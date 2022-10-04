valores = []
while True:
    adicionar = int(
        input('Digite um valor númerico para adicionar na lista: '))
    if adicionar in valores:
        print('Valor já adicionado anteriormente!')
    valores.append(adicionar)
    escolha = str(input(
        'Digite [N] para parar de adicionar valores e qualquer outra letra pra continuar: ')).strip().upper()
    if escolha in 'N':
        break
print(sorted(valores))
