def calculate(expression, num):
    stack = []

    for char in expression:
        if char.isalpha():
            # 피연산자인 경우 스택에 해당하는 값 추가
            stack.append(num[ord(char) - ord('A')])
        else:
            # 연산자인 경우 스택에서 피연산자를 pop하여 계산 후 결과를 스택에 추가
            operand2 = stack.pop()
            operand1 = stack.pop()

            if char == '+':
                stack.append(operand1 + operand2)
            elif char == '-':
                stack.append(operand1 - operand2)
            elif char == '*':
                stack.append(operand1 * operand2)
            elif char == '/':
                stack.append(operand1 / operand2)

    return stack[0]


N = int(input())
expression = input()
num = []

for i in range(N):
    n = int(input())
    num.append(n)

result = calculate(expression, num)

print("{:.2f}".format(result))
