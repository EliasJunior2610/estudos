produtos = 'Caneta', 'Estojo', 'Caderno'
precos = 3, 5, 10
for c in range(0, 3):
    print(produtos[c], end=' → ')
    print('R$ {},00'.format(precos[c]))
