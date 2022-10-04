jogador = {}
jogador['Nome'] = str(input('Insira o nome do jogador: ')).strip().title()
jogador['Total de Partidas'] = int(
    input('Digite o total de partidas que ele jogou: '))
jogador['Total de Gols'] = 0
for c in range(1, jogador['Total de Partidas'] + 1):
    jogador[f'Partida {c}'] = int(
        input(f'Gols marcados por {jogador["Nome"]} na partida {c}: '))
    jogador['Total de Gols'] += jogador[f'Partida {c}']
print('-='*50)
for k, v in jogador.items():
    print(f'{k} = {v}')
print('-='*50)
