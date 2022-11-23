import time
a = float(input('Digite o valor de A: '))
b = float(input('Digite o valor de B: '))
a, b = b, a
print('A tem valor de: {}'.format(a))
print('B tem valor de: {}'.format(b))
time.sleep(0.5)
print('Que a Força esteja com você.')
