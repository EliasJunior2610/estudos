
class Radio:
    def __init__(self, marca, cor, volume):
        self.marca = marca
        self.cor = cor
        self.volume = volume

    def get_marca(self):
        return self.marca
    
    def set_marca(self, marca):
        self.marca = marca

    def get_cor(self):
        return self.cor

    def set_cor(self, cor):
        self.cor = cor

    def get_volume(self):
        return self.volume
    
    def set_volume(self, volume):
        self.volume = volume


r1 = Radio('Phillips', 'Verde', 98)
print(f'A marca do radio é : {r1.marca}')
print(f'A cor do radio é : {r1.cor}')
print(f'A volume do radio é : {r1.volume}')