lanches = ['Hambúrguer', 12], ['Refrigerante', 5], ['Coxinha', 4], [
    'Suco', 7], ['Cachorro Quente', 9.5], ['Batata Frita', 9.9]
valor = 0
print('Cardápio')
print(lanches[0])
print(lanches[1])
print(lanches[2])
print(lanches[3])
print(lanches[4])
print(lanches[5])
while True:
    pedido = str(input('Faça seu pedido: ')).strip().title()
    if 'Hambúguer' in pedido:
        valor += lanches[0][1]
    if 'Refrigente' in pedido:
        valor += lanches[1][1]
    if 'Coxinha' in pedido:
        valor += lanches[2][1]
    if 'Suco' in pedido:
        valor += lanches[3][1]
    if 'Cachorro Quente' in pedido:
        valor += lanches[4][1]
    if 'Batata Frita' in pedido:
        valor += lanches[5][1]
    escolha = str(
        input('Deseja continuar pedindo? [S] ou [N]: ')).strip().upper()
    if escolha in 'N':
        break
print(f'O total a pagar é de R${valor}')
