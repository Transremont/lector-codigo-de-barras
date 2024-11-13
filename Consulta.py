import tkinter
from Agregar import ven1


def ven2 ():
        #def Cam_tex():
               #texto= "Pc,Dell,AH305,Bueno"
               #Ejemplo["text"]=texto
        ventana2 = tkinter.Tk()
        ventana2.geometry("500x400")

        #Seccion de arriba y descripcion de que hacer para que funcione el programa
        btn_ven1= tkinter.Button(ventana2, text="Ventana 1")
        btn_ven1.place(x=0, y=0)
        btn_ven2= tkinter.Button(ventana2, text="Ventana 2", command= ven1)
        btn_ven2.place(x=63, y=0)
        titulo= tkinter.Label(ventana2, text="Escanea el codigo de barras", pady= 20)
        titulo.pack()
        
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