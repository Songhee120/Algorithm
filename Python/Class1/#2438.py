a = int(input())

for i in range(a):
    # print("i 값은 " + i)
    for j in range(i + 1):
        print("*", end="")
    print()