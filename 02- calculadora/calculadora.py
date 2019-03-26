class Calc:
    def __init__(self, batmax):
        self.bateria = 0
        self.bateriamax = batmax
        
    def carregar(self, valor):
        self.bateria += valor
        if self.bateria > self.bateriamax:
            self.bateria = self.bateriamax

    def __str__(self):
        return "bateria = " + str(self.bateria) + "/" + str(self.bateriamax)
    
calc = Calc(0)
print"mostrar,inicio_ maxcarga, carregar _valor, soma _carga, "
while True:
    ui = input().split(" ")
    if ui[0] == "encerrar":
        break
    elif  ui[0] == "iniciar": 
        calc = Calc(int(ui[1]))
    elif ui[0] == "carregar":
        calc.carregar(int(ui[1])
    else:
        print invalido
