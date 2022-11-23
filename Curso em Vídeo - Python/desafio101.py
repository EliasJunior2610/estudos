def voto(ano):
    import datetime
    atual = datetime.date.today().year
    idade = atual - ano
    if idade < 16:
        return('NEGADO')
    elif idade >= 16 and idade < 18:
        return('OPCIONAL')
    else:
        return('OBRIGATÓRIO')


nascimento = int(input('Digite o ano de seu nascimento: '))
print(f'O seu voto foi considerado {voto(nascimento)}.')
