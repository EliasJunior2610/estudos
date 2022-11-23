pessoas = []
pessoa = {}
soma = 0
cadastro = int(input('Digite quantas pessoas você quer cadastrar: '))
for c in range(1, cadastro + 1):
    pessoa['Nome'] = str(
        input(f'Digite o nome completo da {c}° pessoa: ')).strip().title()
    pessoa['Sexo'] = str(
        input(f'Digite o sexo da {c}° pessoa: ')).strip().title()
    pessoa['Idade'] = int(input(f'Digite a idade da {c}° pessoa: '))
    soma += pessoa['Idade']
    pessoas.append(pessoa.copy())
print('-='*50)
print(f'Foram cadastradas {len(pessoas)} pessoas neste algoritmo.')
media = soma/cadastro
print(f'A média de idade das pessoas cadastradas é igual a  {media}')
print('-='*50)
print('Lista das mulheres:')
for c in pessoas:
    if c['Sexo'] == 'Feminino':
        print(c['Nome'])
print('-='*50)
print('Pessoas com idade acima da média:')
for c in pessoas:
    if c['Idade'] > media:
        print(c['Nome'])
print('-='*50)
