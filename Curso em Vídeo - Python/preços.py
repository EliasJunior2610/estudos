import time
soma = caro = barato = 0
c = 1
while True:
    nome = str(input('Digite o nome do produto: ')).strip()
    produto = float(input('Digite o preço do produto em R$: '))
    escolha = str(input(
        'Digite [N] para parar e qualquer outra letra para continuar a inserir produtos: ')).strip().upper()
    if produto > 1000:
        caro += 1
    if c == 1:
        barato = produto
        nomeproduto = nome
        c += 1
    if barato > produto:
        barato = produto
        nomeproduto = nome
    soma += produto
    if escolha in 'N':
        break
print(f'O total gasto foi de R${soma}  .')
print(f'{caro} produto(s) custam mais de R$1000.')
print(f'{nomeproduto} é o nome do produto mais barato.')
time.sleep(0.7)
print('Que a Força esteja com você.')
