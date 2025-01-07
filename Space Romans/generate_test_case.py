import random
import string
import numpy as np

N_VARS = 4
B = np.array([2225, 2125, 2025, 1925])

# bounds on sys of eq coeffs
MIN_A, MAX_A = 0, 10

assert N_VARS == B.size

# loop through until valid test case achieved
while True:
    A = np.array(
        [[random.randint(MIN_A, MAX_A) for _ in range(N_VARS)] for _ in range(N_VARS)]
    )

    if np.linalg.det(A) != 0:
        solution = np.linalg.solve(A, B)

        if all(x > 0 and x.is_integer() for x in solution):
            break

sorted_indices = np.argsort(-solution)
solution = solution[sorted_indices]
A = A[:, sorted_indices]

# generate distinct numerals
numerals = ""
for i in range(N_VARS):
    num = ""
    while num in numerals:
        num = random.choice(string.ascii_uppercase)
    numerals += num

print("System of equations:")
for i in range(N_VARS):
    equation = (
        " + ".join(f"{A[i, j]}*{numerals[j]}" for j in range(N_VARS)) + f" = {B[i]}"
    )
    print(equation)

print("\nSolution:")
to_print = ""
for i in range(N_VARS):
    to_print += f"{numerals[i]} = {solution[i]:.0f}, "

print(to_print.strip(", "))

print("\nInput file:")
for i in range(N_VARS):
    to_print = ""
    for j in range(N_VARS):
        to_print += f"{''.join([numerals[j] * A[i, j]])}"
    print(to_print)
