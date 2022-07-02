aluno = {}
aluno['Nome'] = str(input('Nome do aluno: ')).strip().title()
aluno['Media'] = float(input('Média do aluno: '))
if aluno['Media'] >= 7:
    aluno['Situação'] = 'Aprovado'
else:
    aluno['Situação'] = 'Reprovado'
print('-='*50)
for k, v in aluno.items():
    print(f'{k} do aluno é {v}')
