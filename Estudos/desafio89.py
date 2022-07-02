boletim = list()
while True:
    nome = str(input('Digite o nome do(a) estudante: ')).strip().title()
    n1 = float(input('Digite a nota 1: '))
    n2 = float(input('Digite a nota 2: '))
    media = (n1+n2)/2
    boletim.append([nome, [n1, n2], media])
    escolha = str(input('Deseja continuar? N para finalizar: ')
                  ).strip().upper()
    if 'N' in escolha:
        break
print(f'{"N°":<4}{"Nome":<10}{"Média":>8}')
for i, a in enumerate(boletim):
    print(f'{i:<4}{nome:<10}{media:>8.1f}')
