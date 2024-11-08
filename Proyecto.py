import tkinter

def ven1 ():
        ventana1 = tkinter.Tk()
        ventana1.geometry("500x400")
#Seccion de arriba y descripcion de que hacer para que funcione el programa
        btn_ven1= tkinter.Button(ventana1, text="Ventana 1")
        btn_ven1.place(x=0, y=0)
        btn_ven2= tkinter.Button(ventana1, text="Ventana 2", command=ven2)
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

def ven2 ():
        #def Cam_tex():
               #texto= "Pc,Dell,AH305,Bueno"
               #Ejemplo["text"]=texto
        ventana2=tkinter.Tk()
        ancho_pantalla = ventana2.winfo_screenwidth()
        alto_pantalla = ventana2.winfo_screenheight()
        ventana2.geometry(f"{ancho_pantalla}x{alto_pantalla}")
        
        rel=tkinter.Label(ventana2, text="", height=5, width=50)
        rel.grid(row=1, column=1)

        #Primera seccion 
        asset=tkinter.Label(ventana2, text="Asset:", width=30)
        asset.grid(row=2, column=2)
        entry_asset=tkinter.Entry(ventana2, font="Arial 10")
        entry_asset.grid(row=3, column=2)

#relleno
        rel=tkinter.Label(ventana2, text="", height=3, width=20)
        rel.grid(row=4, column=2)
#relleno
        #Segunda seccion
        marca=tkinter.Label(ventana2, text="Marca:", width=30)
        marca.grid(row=5, column=2)
        entry_Marc=tkinter.Entry(ventana2, font="Arial 10")
        entry_Marc.grid(row=6, column=2)

        #Tercera seccion
        modelo=tkinter.Label(ventana2, text="Modelo:", width=30)
        modelo.grid(row=2, column=3)
        entry_Mod=tkinter.Entry(ventana2, font="Arial 10")
        entry_Mod.grid(row=3, column=3)

#relleno
        rel=tkinter.Label(ventana2, text="", height=3, width=20)
        rel.grid(row=4, column=3)
#relleno

        #cuarta seccion
        estado=tkinter.Label(ventana2, text="Estado (Nuevo o Viejo):", width=30)
        estado.grid(row=5, column=3)
        entry_est=tkinter.Entry(ventana2, font="Arial 10")
        entry_est.grid(row=6, column=3)
        
        #quinta seccion
        articulo=tkinter.Label(ventana2, text="Articulo:", width=30)
        articulo.grid(row=2, column=4)
        entry_art=tkinter.Entry(ventana2, font="Arial 10", )
        entry_art.grid(row=3, column=4)

#relleno
        rel=tkinter.Label(ventana2, text="", height=3, width=20)
        rel.grid(row=4, column=4)
#relleno

        #sexta seccion
        descripcion=tkinter.Label(ventana2, text="Descripcion del articulo:", width=30)
        descripcion.grid(row=5, column=4)
        entry_desc=tkinter.Entry(ventana2, font="Arial 10", )
        entry_desc.grid(row=6, column=4)
        
        #boton para consultar los datos
        btn_con=tkinter.Button(ventana2, text="Hacer Consulta")
#relleno
        rel=tkinter.Label(ventana2, text="", height=3, width=20)
        rel.grid(row=7, column=3)
#relleno
        btn_con.grid(row=8, column=3)
        ventana2.mainloop()

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
