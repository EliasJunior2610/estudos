from math import sqrt


valorA = int(input('Informe o valor de A (x²): '))
valorB = int(input('Informe o valor de B (x): '))
valorC = int(input('Informe o valor de C: '))

delta = sqrt((valorB ** 2) - (4 * valorA * valorC))

if valorA == 0:
    print('O valor de A deve ser diferente de 0!')

elif delta < 0:
    print('Não há raízes reais!')

else: 
    x1 = (- valorB + (delta)) / (2 * valorA)
    x2 = (- valorB - (delta)) / (2 * valorA)
    
    print(f'O valor de x1 é: {x1}')
    print(f'O valor de x2 é: {x2}')
