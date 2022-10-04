n1 = int(input('Digite o valor 1: '))
n2 = int(input('Digite o valor 2: '))
escolha = 0
while escolha != 5:
    escolha = int(input('Digite: [1] para somar, [2] para multiplicar, [3] para saber qual é o maior valor, [4] para novos números e [5] para sair: '))
    if escolha == 1:
        resultado = (n1+n2)
        print('O resultado foi {} .'.format(resultado))
    elif escolha == 2:
        resultado = (n1*n2)
        print('O resultado foi {} . '.format(resultado))
    elif escolha == 3:
        if n1 > n2:
            print('O valor {} é maior que {} .'.format(n1, n2))
        elif n2 > n1:
            print('O valor {} é maior que {} .'.format(n2, n1))
        else:
            print('Os números são iguais.')
    elif escolha == 4:
        n1 = int(input('Digite o valor 1: '))
        n2 = int(input('Digite o valor 2: '))
    elif escolha == 5:
        print('O programa foi finalizado!')
    else: 
        print('Escolha um valor válido!')