times = 'São Paulo', 'Coritiba', 'Corinthians', 'Atlético-MG', 'Ceará SC', 'Avaí', 'Cuiabá', 'Bragantino', 'Juventude', 'Flamengo', 'Atlético-GO', 'Santos', 'Fluminense', 'Palmeiras', 'Fortaleza', 'América-MG', 'Botafogo', 'Internacional', 'Goiás', 'Athletico-PR'
print('Os 5 primeiros colocados são: {}'.format(times[0:5]))
print('Os 4 últimos colocados são: {}'.format(times[16:]))
print('Em ordem alfabética, os times são: {}'.format(sorted(times)))
print('O Fortaleza está na posição: {}'.format(times.index('Fortaleza')+1))
