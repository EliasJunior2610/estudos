valores = [[], []]
for c in range(1, 8):
    valor = int(input(f'Digite o {c}° valor: '))
    if valor % 2 == 0:
        valores[0].append(valor)
    else:
        valores[1].append(valor)
print(f'Os valores pares foram: {valores[0]}.')
print(f'Os valores ímpares foram: {valores[1]}.')
