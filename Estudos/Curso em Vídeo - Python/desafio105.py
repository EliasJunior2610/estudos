def notas(*alunos, sit=False):
    estudantes = dict()
    estudantes['Maior nota'] = max(alunos)
    estudantes['Menor nota'] = min(alunos)
    estudantes['Média de notas'] = sum(alunos)/len(alunos)
    if sit:
        if estudantes['Média de notas'] >= 7:
            estudantes['Situação'] = 'Boa'
        else:
            estudantes['Situação'] = 'Ruim'
    return estudantes


ted = notas(6, 7, 8, 9, 10, 2, 4, 5, sit=True)
print(ted)
