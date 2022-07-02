onibus = 1
while True:
    if 9584 / onibus > 24:
        onibus += 1
    else:
        break


print(f'Serão necessários {onibus} veículos')
