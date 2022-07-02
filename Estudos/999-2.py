soma = num = vezes = 0
while num != 999:
    num = float(input('Digite um número de sua escolha: '))
    if  num == 999:
        break
    soma += num 
    vezes += 1
print(f'A soma de {vezes} número(s) é igual a {soma} .')