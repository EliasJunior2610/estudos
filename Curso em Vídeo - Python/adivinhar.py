import random
numero = random.randint(0,10)
c = 1
player = int(input('O computador pensou num número de 0 a 10, tente adivinhar: '))
while numero != player: 
    print('Você errou!')
    c += 1
    player = int(input('Tente adivinhar novamente: '))
print('Parabéns, você acertou! A resposta era {} e foram necessárias {} tentativas para adivinhar.'.format(numero, c))