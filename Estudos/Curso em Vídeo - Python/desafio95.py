selecao = []
jogador = {}
quantidade = int(input('Digite quantos jogadores você quer cadastrar: '))
for c in range(1, quantidade + 1):
    jogador['Nome'] = str(input('Insira o nome do jogador: ')).strip().title()
    jogador['Total de Partidas'] = int(
        input('Digite o total de partidas que ele jogou: '))
    jogador['Total de Gols'] = 0
    for c in range(1, jogador['Total de Partidas'] + 1):
        jogador[f'Partida {c}'] = int(
            input(f'Gols marcados por {jogador["Nome"]} na partida {c}: '))
        jogador['Total de Gols'] += jogador[f'Partida {c}']
    selecao.append(jogador.copy())
print('-='*50)
ordem = 1
for c in selecao:
    print(f'O nome do {ordem}° Jogador é {c["Nome"]}')
    print(f'{c["Nome"]} jogou um total de {c["Total de Partidas"]} partidas.')
    print(
        f'O total gols marcados por {c["Nome"]} é igual {c["Total de Gols"]}.')
    ordem += 1
