import time
print('Iniciando Caixa Eletrônico...')
time.sleep(1)
print('Cédulas disponíveis: 50, 20, 10, 1.')
cinquenta = vinte = dez = um = 0
while True:
    time.sleep(1)
    sacar = int(input('Digite o valor que deseja sacar em R$: '))
    while sacar >= 50:
        cinquenta += 1
        sacar -= 50
    while sacar >= 20:
        vinte += 1
        sacar -= 20
    while sacar >= 10:
        dez += 1
        sacar -= 10
    while sacar >= 1:
        um += 1
        sacar -= 1
    time.sleep(1)
    print(
        f'Foram entregues {cinquenta} cédulas de R$ 50, {vinte} de R$ 20, {dez} de R$ 10 e {um} de R$ 1.')
    time.sleep(1)
    escolha = str(input(
        'Deseja continuar a sacar? [N] para não e qualquer outra tecla para sim: ')).strip().upper()
    if escolha in 'N':
        break
time.sleep(1)
print('O Caixa Eletrônico foi finalizado.')
time.sleep(1)
print('Que a Força esteja com você.')
