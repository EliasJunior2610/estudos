n11 = int(input('Digite o valor da posição 1x1: '))
n12 = int(input('Digite o valor da posição 1x2: '))
n13 = int(input('Digite o valor da posição 1x3: '))
n21 = int(input('Digite o valor da posição 2x1: '))
n22 = int(input('Digite o valor da posição 2x2: '))
n23 = int(input('Digite o valor da posição 2x3: '))
n31 = int(input('Digite o valor da posição 3x1: '))
n32 = int(input('Digite o valor da posição 3x2: '))
n33 = int(input('Digite o valor da posição 3x3: '))
matriz = [n11, n12, n13], [n21, n22, n23], [n31, n32, n33]
print(matriz[0])
print(matriz[1])
print(matriz[2])
soma = n11 + n22 + n33
print(f'A soma dos valores {n11} + {n22} + {n33} = {soma}')
