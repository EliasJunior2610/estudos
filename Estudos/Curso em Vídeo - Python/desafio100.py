import random
Tedzinho = []
pares = []


def sorteia():
    for c in range(0, 5):
        n = random.randint(0, 100)
        Tedzinho.append(n)
    print(Tedzinho)


def somaPar():
    soma = 0
    for c in Tedzinho:
        if c % 2 == 0:
            soma += c
            pares.append(c)
    print(f'A soma dos pares {pares} é igual a {soma}.')


sorteia()
somaPar()
