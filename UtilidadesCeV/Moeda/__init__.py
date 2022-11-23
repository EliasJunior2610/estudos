def aumentar(num):
    aumentado = num+1
    return aumentado


def diminuir(num):
    diminuído = num-1
    return diminuído


def dobro(num):
    dobrado = num*2
    return dobrado


def metade(num):
    half = num/2
    return half


def moeda(num):
    print(f'Aumentando 10%, temos R${num+(num*0.1)}')
    print(f'Diminuindo 10%, temos R${num-(num*0.1)}')
    print(f'O dobro de R${num}, é R${num*2}')
    print(f'A metade de R${num}, é R${num/2}')


def resumo(num):
    tam = len('RESUMO DO VALOR')+4
    print('~'*tam)
    print('  RESUMO DO VALOR')
    print('~'*tam)
    print(f'Preço analisado: R${num}'.replace('.', ','))
    print(f'Dobro do preço: R${dobro(num)}')
    print(f'Metade do preço: R${metade(num)}')
