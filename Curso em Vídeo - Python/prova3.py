while True:
    c = int(input('Digite um valor entre 0 e 10: '))
    if c < 0 or c > 10:
        print('Erro!')
    else:
        break
print(f'O valor inserido foi: {c}')
