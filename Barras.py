import barcode
from barcode import EAN13
from barcode.writer import ImageWriter

def codigos():
    global lista_numeros
    lista_numeros=[]

    for index in range(1,10):
        if len(str(index))<2:
            lista_numeros.append(str(index)+"00000000000")
        elif len(str(index))<3:
            lista_numeros.append(str(index)+"0000000000")
        elif len(str(index))<4:
            lista_numeros.append(str(index)+"000000000")
        elif len(str(index))<5:
            lista_numeros.append(str(index)+"00000000")
        elif len(str(index))<6:
            lista_numeros.append(str(index)+"0000000")
        elif len(str(index))<7:
            lista_numeros.append(str(index)+"000000")
        elif len(str(index))<8:
            lista_numeros.append(str(index)+"00000")
        elif len(str(index))<9:
            lista_numeros.append(str(index)+"0000")
        elif len(str(index))<10:
            lista_numeros.append(str(index)+"000")
        elif len(str(index))<11:
            lista_numeros.append(str(index)+"00")
        elif len(str(index))<12:
            lista_numeros.append(str(index)+"0")
    return lista_numeros
def generar_codigos():
    lista_num=[]
    numeros=codigos()
    for x in numeros:
        with open("imagenes/imagen"+str(x)+".svg","wb") as fichero:
            EAN13(str(x),writer=ImageWriter).write(fichero)
generar_codigos()
