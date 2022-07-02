maior = menor = maiorposicao = menorposicao = 0
n1 = int(input('Digite o valor 1: '))
n2 = int(input('Digite o valor 2: '))
n3 = int(input('Digite o valor 3: '))
n4 = int(input('Digite o valor 4: '))
n5 = int(input('Digite o valor 5: '))
valores = [n1, n2, n3, n4, n5]
print(valores)
for c, v in enumerate(valores):
    if v > maior:
        maior = v
        maiorposicao = c
    if v < menor:
        menor = v
        menorposicao = c
print(f'O maior valor foi {maior} na posicão {maiorposicao}')
print(f'O menor valor foi {menor} na posição {menorposicao}')
