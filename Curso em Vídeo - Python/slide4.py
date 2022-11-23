a = float(input('Digite o valor de A: '))
b = float(input('Digite o valor de B: '))
a, b = b, a
print('Valores foram trocados!')
print('Agora A vale {} e B vale {}.'.format(a, b))
