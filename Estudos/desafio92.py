import random, datetime
trabalhador = dict()
trabalhador['Nome'] = str(input('Insira o nome completo: ')).strip().title()
ano = int(input('Digite o ano de seu nascimento: '))
trabalhador['Idade'] = datetime.datetime.now().year - ano
trabalhador['CTPS'] = int(input('Digite o número de sua CTPS: '))
if trabalhador['CTPS'] != 0:
    trabalhador['Contratação'] = ano + 18
    trabalhador['Salário'] = random.randint(1900, 10000)
trabalhador['Aposentadoria'] = 60 - trabalhador['Idade']
print('-='*50)
for k, v in trabalhador.items():
    print(f'{k} = {v}')
print('-='*50)
