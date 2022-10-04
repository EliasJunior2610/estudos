nome = str(input('Insira o nome do(a) aluno(a).')).strip()
n1 = float(input('Insira o valor da nota 1: '))
n2 = float(input('Insira o valor da nota 2: '))
n3 = float(input('Insira o valor da nota 3: '))
media = (n1+n2+n3)/3
print('O(A) Aluno(a) {} teve sua média de notas igual a {}'.format(nome, media))
