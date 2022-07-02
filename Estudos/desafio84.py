listinha = []
listona = []
maior = menor = 0
while True:
    listinha.append(str(input('Nome: ')).strip().title())
    listinha.append(float(input('Peso: ')))
    if len(listona) == 0:
        maior = menor = listinha[1]
    else:
        if listinha[1] > maior:
            maior = listinha[1]
        if listinha[1] < menor:
            menor = listinha[1]
    listona.append(listinha[:])
    listinha.clear()
    escolha = str(input(
        'Deseja continuar adicionando pessoas e pesos? [S] ou [N]: ')).strip().upper()
    if 'N' in escolha:
        break
print(f'Todas as pessoas cadastradas: {listona}')
print(f'Foram cadastradas {len(listona)} pessoas.')
for c in listona:
    if c[1] == maior:
        print(f'{c[0]} com o maior peso de {maior}')
for c in listona:
    if c[1] == menor:
        print(f'{c[0]} com o menor peso de {menor}')
