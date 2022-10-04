listinha = []
while True:
    valor = int(input('Digite um valor para inserir na matriz: '))
    listinha.append(valor)
    escolha = str(
        input('S para continuar ou N para parar de inserir valores: ')).strip().upper()
    if escolha in 'N':
        break
print(f'Você adicionou um total de {len(listinha)} valores à lista.')
listinha.sort(reverse=True)
print(listinha)
if 5 in listinha:
    print('O valor 5 foi adicionado à lista.')
else:
    print('O valor 5 não foi adicionado à lista.')
