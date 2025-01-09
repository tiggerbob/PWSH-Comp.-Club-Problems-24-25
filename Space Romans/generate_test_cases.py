import os
import random
import string
import numpy as np

N_VARS = 4
N_CASES = 20
B = np.array([2225, 2125, 2025, 1925])
MIN_A, MAX_A = 0, 10
MIN_SP, MAX_SP = 1, 1000

os.makedirs("./cases/input", exist_ok=True)
os.makedirs("./cases/output", exist_ok=True)


def generate_test_case(case_idx):
    while True:
        A = np.array(
            [
                [random.randint(MIN_A, MAX_A) for _ in range(N_VARS)]
                for _ in range(N_VARS)
            ]
        )

        if np.linalg.det(A) != 0:
            sol = np.linalg.solve(A, B)

            if all(x > 0 and x.is_integer() for x in sol):
                break

    srt_idx = np.argsort(-sol)
    sol = sol[srt_idx]
    A = A[:, srt_idx]

    numerals = ""
    for i in range(N_VARS):
        num = ""
        while num in numerals:
            num = random.choice(string.ascii_uppercase)
        numerals += num

    header = []
    for i in range(N_VARS):
        numeral_representation = ""
        for j in range(N_VARS):
            numeral_representation += numerals[j] * A[i, j]
        header.append(numeral_representation)

    N = random.randint(MIN_SP, MAX_SP)
    sp = []
    dsp = []
    for _ in range(N):
        coeffs = [random.randint(1, MAX_A) for _ in range(N_VARS)]
        strike_point = "".join(numerals[i] * coeffs[i] for i in range(N_VARS))
        sp.append(strike_point)
        dsp.append(int(sum(coeffs[i] * sol[i] for i in range(N_VARS))))

    input_file_path = f"./cases/input/input{case_idx:02}.txt"
    with open(input_file_path, "w") as input_file:
        input_file.write(f"{N}\n")
        input_file.write("\n".join(header) + "\n")
        input_file.write("\n".join(sp) + "\n")

    output_file_path = f"./cases/output/output{case_idx:02}.txt"
    with open(output_file_path, "w") as output_file:
        output_file.write("\n".join(map(str, dsp)) + "\n")


for case_idx in range(N_CASES):
    generate_test_case(case_idx)
