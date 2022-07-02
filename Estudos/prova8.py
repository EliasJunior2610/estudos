fato = int(input('Digite um número inteiro maior que 0: '))
fatorial = 1
for c in range(fato, 0, -1):
    fatorial *= c
    if c == fato:
        print(f'{fato}! =', end=' ')
    print(f'{c}', end=' ')
    if c > 1:
        print('x', end=' ')
    else:
        print(f'= {fatorial}')

