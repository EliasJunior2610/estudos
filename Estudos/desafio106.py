while True:
    dúvida = str(input('\033[;32m Digite o comando do Python sobre o qual voccê deseja aprender: \n')).strip().lower()
    if dúvida in 'fim':
        print('Programa encerrado!')
        break
    help(dúvida)
