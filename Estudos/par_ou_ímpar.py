import random
import time
vitorias = 0
while True:
    jogpc = random.randint(0, 10)
    jogada = int(input('Digite [0] para jogar par e [1] para jogar ímpar: '))
    escolha = int(input('Digite quantos dedos você quer levantar: '))
    soma = escolha + jogpc
    if jogada == 0:
        if soma % 2 == 0:
            vitorias += 1
            print(
                f'O computador jogou {jogpc}, logo o resultado é par, você venceu!!!')
        else:
            print(
                f'O computador jogou {jogpc}, logo o resultado é ímpar, você perdeu!!!')
            break
    elif jogada == 1:
        if soma % 2 == 0:
            print(
                f'O computador jogou {jogpc}, logo o resultado é par, você perdeu!!!')
            break
        else:
            print(
                f'O computador jogou {jogpc}, logo o resultado é ímpar, você venceu!!!')
            vitorias += 1
print(f'Você obteve um total de {vitorias} vitórias consecutivas.')
time.sleep(0.5)
print('Que a Força esteja com você.')
