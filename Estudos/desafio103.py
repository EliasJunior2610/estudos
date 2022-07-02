def ficha(jogador=0, placar=0):
    if jogador == 0:
        print('O nome do jogador não foi informado.')
    else:
        print(f'O nome do jogador é {jogador}')
    if placar == 0:
        print('A quantidade de gols marcados não foi informado.')
    else:
        print(f'O jogador marcou {placar} gols.')


nome = str(input('Digite o nome do jogador: ')).strip().title()
gols = str(input('Digite a quantidade de gols marcados: ')).strip()
ficha(nome, gols)
