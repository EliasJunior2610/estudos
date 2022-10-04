for c in range(1, 6):
    nota1 = float(input(f'Digite a nota 1 do {c}° aluno: '))
    nota2 = float(input(f'Digite a nota 2 do {c}° aluno: '))
    media = (nota1+nota2)/2
    if media >= 7:
        print(f'O {c}° aluno foi aprovado com média {media}.')
    else:
        print(f'O {c}° aluno foi reprovado com média {media}.')
