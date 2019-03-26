class Carro
    def __init__(self):
        self.gas=0
        self.pas=0
        self.km=0
        self.lim_pas=2
        self.lim_gas=10
    def __str__(self):
        return "Pas:"+str(self.pas)+", Gas:"+str(self.gas)+", Km:"+str(self.km)
    def mostrar(self):
        print(self)
    def entrar(self):
        if self.pas < self.lim_pas:
           self.pas+=1
        else:
            print("Limite atingido")
    def sair(self):
        if self.pas > 0:
            self.pas-=1
        else:
            print("Nao a ninguem no carro")
    def abastecer(self, gas):
        if self.gas + gas <= self.lim_gas:
            self.gas += gas
        else:
           self.gas = self.lim_gas
    def andar(self, km):
        qtd = km/10.0
        if self.pas > 0 and qtd <= self.gas:
            self.gas -=qtd
            self.km +=km
        elif qtd > self.gas :
            print("A quantidade de combustível e insuficiente") 
