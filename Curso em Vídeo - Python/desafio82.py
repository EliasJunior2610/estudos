listinha = []
listinha_par = []
listinha_impar = []
while True:
    valor = int(input('Digite um valor para se adicionar à lista: '))
    listinha.append(valor)
    if valor % 2 == 0:
        listinha_par.append(valor)
    if valor % 2 != 0:
        listinha_impar.append(valor)
    escolha = str(input(
        'Digite S para continuar ou N para encerrar a adiçaõ de valores: ')).strip().upper()
    if escolha in 'N':
        break
print(f'Lista completa: {listinha}')
print(f'Lista dos pares: {listinha_par}')
print(f'Lista dos ímpares: {listinha_impar}')
