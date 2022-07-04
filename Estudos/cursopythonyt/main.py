from pessoa import Pessoa
p1 = Pessoa('Luiz', 29)
p2 = Pessoa('João', 32)

p1.falar('Merielly')
p1.comer('Maçã')
p1.parar_comer()
p1.parar_falar()

print(Pessoa.gera_id())
