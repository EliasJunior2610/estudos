matriz = [[0, 0, 0], [0, 0, 0], [0, 0, 0]]
soma = 0
for linha in range(0, 3):
    for coluna in range(0, 3):
        adicionar = int(
            input(f'Digite um número para adicionar na posição {linha}x{coluna}: '))
        matriz[linha][coluna] = adicionar
        if linha == coluna:
            soma += adicionar


for c in range(0, 3):
    print(matriz[c])
print(f'A soma dos valores na diagonal é igual a: {soma}')
