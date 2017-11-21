'''
single-line (str)
'''
n = input()
print(n)

'''
single-line (int)
'''
n = int(input())
print(n)

'''
multi-line (str)
'''
import sys

a = []
for line in sys.stdin:
    a.append(line.strip())

print(a)

'''
n
a_1
a_2
.
a_n
'''
n = int(input())
a = [input() for i in range(n)]
print(n,a)

'''
n
p_11 p_12 p_13 ... (str)
p_21 p_22 p_23 ... (str)
...
p_n1 p_n2 p_n3 ... (str)
'''
n = int(input())
p = [input().split() for i in range(n)]
print(n,p)

'''
n
p_11 p_12 p_13 ... (int)
p_21 p_22 p_23 ... (int)
...
p_n1 p_n2 p_n3 ... (int)
'''
n = int(input())
p = [list(map(int, input().split())) for i in range(n)]
print(n,p)
