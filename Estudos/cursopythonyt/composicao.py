from composicao_classes import Cliente, Endereco

c1 = Cliente('Luiz', 32)
c1.insere_endereco('Belo Horizonte', 'MG')
print(c1.nome)
c1.lista_enderecos()
del c1
print()

c2 = Cliente('Maria', 55)
c2.insere_endereco('Salvador', 'BA')
c2.insere_endereco('Rio de Janeiro', 'RJ')
print(c2.nome)
c2.lista_enderecos()
del c2
print()

c3 = Cliente('João', 19)
c3.insere_endereco('São Paulo', 'SP')
print(c3.nome)
c3.lista_enderecos()
del c3
