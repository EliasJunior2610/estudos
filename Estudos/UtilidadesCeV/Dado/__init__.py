def leiaDinheiro(num):
    válido = False
    while not válido:
        entrada = str(input(num)).replace(',', '.').strip()
        if entrada.isalpha() or entrada == '':
            print('Erro! Preço inválido!')
        else:
            válido = True
            return float(entrada)
