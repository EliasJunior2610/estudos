# estudando a biblioteca random
from random import randint


z = 0
compradores = ["Pessoa 1", "Pessoa 2", "Pessoa 3"]
sorteados = ["Pessoa 1", "Pessoa 2", "Pessoa 3"]
escolhidosc = ["", "", ""]
escolhidoss = ["", "", ""]
while z < 3:
    x = randint(0, 2)
    y = randint(0, 2)
    if z == 0:
        while x == y:
            x = randint(0, 2)
            y = randint(0, 2)
    if z > 0:
        while compradores[x] == sorteados[y]:
            x = randint(0, 2)
            y = randint(0, 2)
            while compradores[x] == escolhidosc[x]:
                x = randint(0, 2)
            while sorteados[y] == escolhidoss[y]:
                y = randint(0, 2)
    if x == 0:
        print('Pessoa 1 vai presentear ', end='')
        escolhidosc[x] = compradores[x]
    elif x == 1:
        print('Pessoa 2 vai presentear ', end='')
        escolhidosc[x] = compradores[x]
    elif x == 2:
        print('Pessoa 3 vai presentear ', end='')
        escolhidosc[x] = compradores[x]

    if y == 0:
        print('Pessoa 1.')
        escolhidoss[y] = sorteados[y]
    elif y == 1:
        print('Pessoa 2.')
        escolhidoss[y] = sorteados[y]
    elif y == 2:
        print('Pessoa 3.')
        escolhidoss[y] = sorteados[y]

    z += 1
