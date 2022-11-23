class Pessoa:
    ano_atual = 2022
    
    def __init__(self, nome, idade):
        self.nome = nome
        self.idade = idade

    def get_ano_nascimeto (self):
        print(self.ano_atual - self.idade)

    @classmethod
    def por_ano_nascimeto(cls, nome, ano_nascimento):
        idade = cls.ano_atual - ano_nascimento
        return cls(nome, idade)


p1 = Pessoa.por_ano_nascimeto('Merielly', 1995)
print(p1.idade)
p1.get_ano_nascimeto()