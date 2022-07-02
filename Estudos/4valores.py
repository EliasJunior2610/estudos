pares = 0
n1 = int(input('Digite o valor 1 da tupla: '))
n2 = int(input('Digite o valor 2 da tupla: '))
n3 = int(input('Digite o valor 3 da tupla: '))
n4 = int(input('Digite o valor 4 da tupla: '))
tupla = n1, n2, n3, n4
print(f'O valor 9 apareceu {tupla.count(9)} vez(es).')
print(f'O primeiro valor 3 foi o {tupla.index(3)+1}° valor digitado.')
for c in range(0, 4):
    if tupla[c] % 2 == 0:
        pares += 1
print(f'Houve um total de {pares} número(s) par(es).')
