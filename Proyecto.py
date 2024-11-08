import tkinter
ejem = str("a")
def destruir(ven):
    ven1= str(ven)
    if ven1 != ejem:
        ven.destroy
    else:
        pass
def inicial (x):
    destruir(x)
    ven_inicial= tkinter.Tk()
    def ven1 ():
        
        ventana1 = tkinter.Tk()
        ventana1.geometry("500x400")
#Seccion de arriba y descripcion de que hacer para que funcione el programa
        btn_ven1= tkinter.Button(ventana1, text="Ventana 1", command=inicial(ventana1))
        btn_ven1.place(x=0, y=0)
        btn_ven2= tkinter.Button(ventana1, text="Ventana 2", command=ven2)
        btn_ven2.place(x=63, y=0)
        titulo= tkinter.Label(ventana1, text="Escanea el codigo de barras", pady= 20)
        titulo.pack()

#Primer seccion
        cod_barras= tkinter.Label(ventana1, text="Codigo de barras escaneado:")
        cod_barras.place(x=50, y=70)
        caja1= tkinter.Entry(ventana1, font="Ariel 10")
        caja1.place( x=55, y=100)

#Segunda seccion
        articulo= tkinter.Label(ventana1,text="Articulo:")
        articulo.place(x=300, y=70)
        caja2= tkinter.Entry(ventana1, font="Ariel 10")
        caja2.place( x=300, y=100)

#Tercera seccion
        marca=tkinter.Label(ventana1, text="Marca")
        marca.place(x=60, y=210)
        caja3= tkinter.Entry(ventana1, font="Ariel 10")
        caja3.place( x=60, y=240)

#Cuarta seccion
        asset=tkinter.Label(ventana1, text="Asset")
        asset.place(x=300, y=210)
        caja4= tkinter.Entry(ventana1, font="Ariel 10")
        caja4.place( x=300, y=240)

#Boton para enviar datos 
        btn_guardar= tkinter.Button(ventana1, text = "Guardar")
        btn_guardar.place(x=225, y=330)


        ventana1.mainloop()

    def ven2 ():
        ventana2=tkinter.Tk()
        ventana2.geometry("500x400")
        btn_ven1= tkinter.Button(ventana2, text="Ventana 1", command=inicial(ventana2))
        btn_ven1.place(x=0, y=0)



        ventana2.mainloop()

    ven_inicial.geometry("500x400")

#Descripcion 
    texto_desc=tkinter.Label(ven_inicial, text="Bienvenido a la aplicacion Control de activos")
    texto_desc.pack()
    texto_sele=tkinter.Label(ven_inicial, text="Que desea hacer el dia de hoy:")
    texto_sele.pack()
#Boton 1
    registrar=tkinter.Button(ven_inicial, text="Registrar activos", command= ven1())
    registrar.place(x=80, y=100)
#Boton 2
    Consulta=tkinter.Button(ven_inicial, text="Consultar activos", command= ven2())
    Consulta.place(x=300, y=100)


    ven_inicial.mainloop()
inicial(ejem)