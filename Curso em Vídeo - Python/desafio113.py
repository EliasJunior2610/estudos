def leiaint(msg):
    while True:
        n = str(input(msg))
        try:
            valor = int(n)
        except:
            print('Erro! Digite um número inteiro válido!')
        else:
            break
    return valor


def leiaFloat(msg):
    while True:
        n = str(input(msg)).replace(',', '.')
        try:
            valor = float(n)
        except:
            print('Erro! Digite um número real válido!')
        else:
            break
    return valor
