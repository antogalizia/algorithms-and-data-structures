#Ejercicio 1

def contarLineas(arch: str) -> int:
    contador = 0
    archivo = open(arch, 'r')
    for linea in archivo.readlines():
        contador += 1
    archivo.close()
    return contador


def contarLineas2(archivo: str) -> int:
    with open(archivo, 'r') as f:
        return len(f.readlines())


print(contarLineas('ChatGPT.txt'))


#Ejercicio 2

def existePalabra(p: str, arch: str) -> bool:
    archivo = open(arch)
    for linea in archivo.readlines():
        palabras = linea.split()
        for palabra in palabras:
            if palabra == p:
                return True
    return False

print(existePalabra('permiten', 'ChatGPT.txt'))
print(existePalabra('helow', 'ChatGPT.txt'))


#Ejercicio 3

def cantidadApariciones()