"""
Author: Rajat Gupta
Problem: Prime Factors
"""

from math import *

def generate(n):
    num_list = []

    while(n%2 == 0):
        num_list.append(2)
        n /= 2

    for i in range(3, int(sqrt(n))+1, 2):
        while(n%i == 0):
            num_list.append(i)
            n /= i

    if n > 2:
        num_list.append(n)

    return num_list


def main():
    n = int(raw_input())
    print generate(n)


if __name__ == "__main__": main()
