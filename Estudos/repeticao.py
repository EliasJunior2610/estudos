menor = maior = 0
while True:
    valor = int(input('Digite um valor inteiro: '))
    if valor == 0:
        break
    if valor > maior:
        maior = valor
    if valor < menor:
        menor = valor
print('{} foi menor valor digitado e {} foi o maior valor digitado.'.format(menor, maior))
