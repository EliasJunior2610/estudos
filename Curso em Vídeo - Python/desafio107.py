import moedas
ted = int(input('Digite um número: '))
print(f'{ted} + 1 = {moedas.aumentar(ted)}')
print(f'{ted} - 1 = {moedas.diminuir(ted)}')
print(f'{ted} * 2 = {moedas.dobro(ted)}')
print(f'{ted} / 2 = {moedas.metade(ted)}')
