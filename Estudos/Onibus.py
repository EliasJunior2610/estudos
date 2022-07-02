mais = 0
for c in range(1, 13890, 5):
    mais += 7

print(f'{mais} minutos serão adicionados aos 555.560 min.')
print(f'{mais+555560} min ao total.')
horas = (mais + 555560)/60
dias = horas / 24
print(f'Horas: {horas}')
print(f'Dias: {dias}')


