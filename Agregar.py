import tkinter
from Consulta import ven2

def ven1 ():
        ventana1 = tkinter.Tk()
        ventana1.geometry("500x400")
#Seccion de arriba y descripcion de que hacer para que funcione el programa
        btn_ven1= tkinter.Button(ventana1, text="Ventana 1")
        btn_ven1.place(x=0, y=0)
        btn_ven2= tkinter.Button(ventana1, text="Ventana 2", command= ven2)
        btn_ven2.place(x=63, y=0)
        titulo= tkinter.Label(ventana1, text="Escanea el codigo de barras", pady= 20)
        titulo.pack()

#Primer seccion
        cod_barras= tkinter.Label(ventana1, text="Codigo de barras escaneado:")
        cod_barras.place(x=50, y=70)
        caja1= tkinter.Entry(ventana1, font="Ariel 10")
        caja1.place( x=50, y=100)

#Segunda seccion
        articulo= tkinter.Label(ventana1,text="Articulo:")
        articulo.place(x=300, y=70)
        caja2= tkinter.Entry(ventana1, font="Ariel 10")
        caja2.place( x=300, y=100)

#Tercera seccion
        marca=tkinter.Label(ventana1, text="Marca")
        marca.place(x=50, y=130)
        caja3= tkinter.Entry(ventana1, font="Ariel 10")
        caja3.place( x=50, y=160)

#Cuarta seccion
        modelo=tkinter.Label(ventana1, text="Modelo:")
        modelo.place(x=300, y=130)
        caja4= tkinter.Entry(ventana1, font="Ariel 10")
        caja4.place( x=300, y=160)

#Quinta seccion
        estado=tkinter.Label(ventana1, text="Estado del articulo:")
        estado.place(x=50, y=190)
        caja5= tkinter.Entry(ventana1, font="Ariel 10")
        caja5.place( x=50, y=220)

#Sexta seccion
        descripcion=tkinter.Label(ventana1, text="Descripcion del articulo")
        descripcion.place(x=300, y=190)
        caja6= tkinter.Entry(ventana1, font="Ariel 10")
        caja6.place( x=300, y=220)

#Boton para enviar datos 
        btn_guardar= tkinter.Button(ventana1, text = "Guardar")
        btn_guardar.place(x=225, y=330)
        ventana1.mainloop()