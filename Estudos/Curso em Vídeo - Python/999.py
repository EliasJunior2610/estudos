num = contador = soma = 0
while num != 999:
    num = int(input('Digite um número [999 para parar]: '))
    print('dsadasdasdasdas')
    contador += 1
    if num != 999:
        soma += num
    else:
        soma += (num-999)

print('Você digitou {} valores e soma desses valores resultou em {}.'.format(contador-1, soma))
