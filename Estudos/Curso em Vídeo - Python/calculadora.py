import time
print('Calculadora ligada!')
n1 = float(input('Digite o valor 1: '))
n2 = float(input('Digite o valor 2: '))
escolha = 0
while escolha != 7:
    escolha = int(input(
        'Digite [1] para somar, [2] para subtrair, [3] para multiplicar, [4] para dividir, [5] para elevar, [6] para nos valores e [7] para desligar a calculadora: '))
    if escolha == 1:
        resultado = (n1+n2)
        print('O resultado é igual a: {}'.format(resultado))
    elif escolha == 2:
        resultado = (n1-n2)
        print('O resultado é igual a: {}'.format(resultado))
    elif escolha == 3:
        resultado = (n1*n2)
        print('O resultado é igual a: {}'.format(resultado))
    elif escolha == 4:
        resultado = (n1/n2)
        print('O resultado é igual a: {}'.format(resultado))
    elif escolha == 5:
        resultado = (n1**n2)
        print('O resultado é igual a: {}'.format(resultado))
    elif escolha == 6:
        n1 = float(input('Digite o valor 1: '))
        n2 = float(input('Digite o valor 2: '))
    elif escolha == 7:
        print('Calculadora está sendo desligada.')
        time.sleep(0.5)
        print('Que a força esteja com você!')
    else:
        print('Valor inválido! Digite novamente: ')
