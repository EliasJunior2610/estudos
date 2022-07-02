listinha = []
for c in range(0, 10):
    adicionar = int(input(f'Digite o {c+1}° valor para adicionar à lista: '))
    listinha.append(adicionar)
print(f'Lista completa: {sorted(listinha)}')
print(f'Soma dos valores da lista: {sum(listinha)}')
