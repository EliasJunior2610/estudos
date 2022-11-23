alfredo = [[], [], []]
pares = 0
soma3c = 0
maior2l = 0
for c in range(1, 10):
    valor = int(input(f'Digite o {c}° valor: '))
    if valor % 2 == 0:
        pares += valor
    if c <= 3:
        alfredo[0].append(valor)
    elif c > 3 and c <= 6:
        alfredo[1].append(valor)
    else:
        alfredo[2].append(valor)
    if c > 1 and c % 3 == 0:
        soma3c += valor
    if c >= 4 and c <= 6:
        if valor > maior2l:
            maior2l = valor
print(alfredo[0])
print(alfredo[1])
print(alfredo[2])
print(f'A soma dos valores da terceira coluna é igual a {soma3c}.')
print(f'O maior valor da segunda linha é {maior2l}.')
