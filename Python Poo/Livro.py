class Livro:
    def __init__(self, nome, autor, genero):
        self.nome = nome
        self.autor = autor
        self.genero = genero


    def get_nome(self):
        return self.nome
    
    def set_nome(self, nome):
        self.nome = nome

    def get_autor(self):
        return self.autor
    
    def set_autor(self, autor):
        self.autor = autor

    def get_genero(self):
        return self.genero
    
    def set_genero(self, genero):
        self.genero = genero


l1 = Livro('Luz dos Jedi', 'Charles Soule', 'Fantasia')
print(f'O nome do livro é: {l1.nome}.')
print(f'O autor do livro é: {l1.autor}.')
print(f'O gênero do livro é: {l1.genero}.')