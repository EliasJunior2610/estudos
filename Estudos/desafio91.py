import random
import operator
import time
jogo = {'Jogador 1': random.randint(1, 6), 'Jogador 2': random.randint(
    1, 6), 'Jogador 3': random.randint(1, 6), 'Jogador 4': random.randint(1, 6)}
print('-='*50)
ranking = list()
for k, v in jogo.items():
    print(f'O {k} conseguiu {v}.')
    time.sleep(1)
print('-='*20, end='')
print('Colocação', end='')
print('-='*26,)
ranking = sorted(jogo.items(), key=operator.itemgetter(1), reverse=True)
for i, v in enumerate(ranking):
    print(f'{i+1}° Lugar: {v[0]} → {v[1]}')
    time.sleep(1)
