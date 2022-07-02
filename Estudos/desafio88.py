import random
megasena = list()
contador = 0
jogos = int(input('Quantos jogos serão sorteados? '))
for c in range(0, jogos):
    while True:
        num = random.randint(0, 60)
        if num not in megasena:
            megasena.append(num)
            contador += 1
        if contador >= 6:
            megasena.sort()
            print(f'Os números sorteados foram: {megasena}')
            contador = 0
            megasena.clear()
            break
