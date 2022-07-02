import time
n1 = int(input('Digite um número inteiro: '))
c = 1
prosseguir = str(input('Deseja continuar[S/N]? ')).strip().upper()
maior = 0
while prosseguir in 'S':
    n2 = int(input('Digite outro número inteiro: '))
    prosseguir = str(input('Deseja continuar[S/N] ? ')).strip().upper()
    soma = n1 + n2
    media = soma/c
    if c == 1:
        maior = n1
    if n2 > maior:
        maior = n2
    c += 1
print('Você digitou {} número(s) inteiro(s), a média deu {} e o maior valor lido foi {}.'.format(c, media, maior))
time.sleep(0.5)
print('Que a Força esteja com você.')
