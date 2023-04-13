class Carro:
    def __init__(self, marca, modelo, cor):
        self.marca = marca
        self.modelo = modelo
        self.cor = cor
        self.ligado = False
        self.freioMao = True

    def Buzinar(self):
        print('Buzinando')

    def GirarChave(self, ligado):
        self.ligado = ligado
        if self.ligado:
            print('O carro está ligado!!!')
        else:
            print('O carro está desligado!!!')

    def PuxarFreioMao(self, freioMao):
        self.freioMao = freioMao
        if self.freioMao:
            print('O freio de mão está travado!!!')
        else:
            print('O freio de mão está destravado!!!')


c1 = Carro('Volkswagen', 'Golf', 'Preto')
c1.Buzinar()
c1.GirarChave(True)
c1.GirarChave(False)
c1.PuxarFreioMao(False)
c1.PuxarFreioMao(True)