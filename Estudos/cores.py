# ↓ Função ↓
def cores(cor1, cor2):
    if ('Amarelo' in cor1 and 'Azul' in cor2) or ('Azul' in cor1 and 'Amarelo' in cor2):
        return 'Verde'
    elif ('Amarelo' in cor1 and 'Vermelho' in cor2) or ('Vermelho' in cor1 and 'Amarelo' in cor2):
        return 'Laranja'
    elif ('Azul' in cor1 and 'Vermelho' in cor2) or ('Vermelho' in cor1 and 'Azul' in cor2):
        return 'Roxo'
    else:
        print('Erro! Escolha duas cores primárias!')


# ↓ Programa Principal ↓
print('As cores primárias são: Vermelho, Azul e Amarelo. Sua função é fazer uma combinação com duas destas.')
n1 = str(input('Digite a primeira cor primária de sua escolha: ')).strip().capitalize()
n2 = str(input('Digte a segunda cor primária de sua escolha: ')).strip().capitalize()
mistura = cores(n1, n2)
print(f'A mistura entre {n1} e {n2} é igual a {mistura}.')
