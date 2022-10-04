palavras = 'CASAMATA', 'ALGORITMO', 'COMPUTADOR'
vezesA = vezesE = vezesI = vezesO = vezesU = 0
for c in range(0, 3):
    if palavras[c].count('A') >= 1:
        vezesA = palavras[c].count('A')
    if palavras[c].count('E') >= 1:
        vezesE = palavras[c].count('E')
    if palavras[c].count('I') >= 1:
        vezesI = palavras[c].count('I')
    if palavras[c].count('O') >= 1:
        vezesO = palavras[c].count('O')
    if palavras[c].count('U') >= 1:
        vezesU = palavras[c].count('U')
    print(f'A palavra {palavras[c]} possui as vogais', 'A '*vezesA, end='')
    print(f'E '*vezesE, end='')
    print(f'I '*vezesI, end='')
    print(f'O '*vezesO, end='')
    print(f'U '*vezesU)
