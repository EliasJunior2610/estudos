def fatorial(ted, show):
    fator = 1
    print('5! =', end=' ')
    for c in range(ted, 0, -1):
        fator *= c
        if show in 'Ss':
            print(f'{c}', end=' ')
            if c > 1:
                print('x', end=' ')
            else:
                print('=', end=' ')
    print(fator)


descfat = int(input('Digite um número para descobrir seu fatorial: '))
mostrar = str(input('Deseja ver a conta sendo feita? S ou N: ')).strip()
fatorial(descfat, mostrar)
