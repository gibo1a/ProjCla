def fibonacci(number):
    lista = [0,1]
    a = 0
    if number < 0:
        return []
    elif number == 0:
        return 0
    else:
        for i in range(1,number):
            lista.append(lista[i] + a)
            a = lista[i]
        return lista
    

    