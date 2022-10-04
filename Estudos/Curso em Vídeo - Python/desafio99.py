def Maior(*valores):
    maior = 0
    for c in valores:
        if c > maior:
            maior = c
    print(f'Foram digitados {len(valores)} valores ao todo: {valores}')
    print(f'E o maior valor foi {maior}.')


Maior(1, 12, 456, 84, 63, 72)
