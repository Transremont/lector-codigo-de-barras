import tkinter
from Agregar import ven1
from Consulta import ven2

def inicial ():
    ven_inicial= tkinter.Tk()
    ven_inicial.geometry("500x400")
    

#Descripcion 
    texto_desc=tkinter.Label(ven_inicial, text="Bienvenido a la aplicacion Control de activos")
    texto_desc.pack()
    texto_sele=tkinter.Label(ven_inicial, text="Que desea hacer el dia de hoy:")
    texto_sele.pack()
#Boton 1
    registrar=tkinter.Button(ven_inicial, text="Registrar activos", command=ven1)
    registrar.place(x=80, y=100)
#Boton 2
    Consulta=tkinter.Button(ven_inicial, text="Consultar activos", command=ven2)
    Consulta.place(x=300, y=100)
    ven_inicial.mainloop()

inicial()