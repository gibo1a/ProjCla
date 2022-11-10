# Complete este programa como pedido no guião da aula.
def listContacts(dic):
    """Print the contents of the dictionary as a table, one item per row."""
    print("{:>12s} : {}".format("Numero", "Nome"))
    for num in dic:
        print("{:>12s} : {}".format(num, dic[num]))

def filterPartName(contacts, partName):
    """Returns a new dict with the contacts whose names contain partName."""
    for i in contacts:
        d = {}
        if partName in contacts.values():
            d[i] = contacts[i]
    return d
def addContact(dic,nome, numero):
    dic[numero] = nome
    return dic

def removeContact(dic, numero):
    dic.pop(numero)    
    return dic
def searchNumber(dic,numero):
    try :
        print(dic.get(numero))
    finally :
        print(numero)




def menu():
    """Shows the menu and gets user option."""
    print()
    print("(L)istar contactos")
    print("(A)dicionar contacto")
    print("(R)emover contacto")
    print("Procurar (N)úmero")
    print("Procurar (P)arte do nome")
    print("(T)erminar")
    op = input("opção? ").upper()   # converts to uppercase...
    return op


def main():
    """This is the main function containing the main loop."""

    # The list of contacts (it's actually a dictionary!):
    contactos = {"234370200": "Universidade de Aveiro",
        "727392822": "Cristiano Aveiro",
        "387719992": "Maria Matos",
        "887555987": "Marta Maia",
        "876111333": "Carlos Martins",
        "433162999": "Ana Bacalhau"
        }

    op = ""
    while op != "T":
        op = menu()
        if op == "T":
            print("Fim")
        elif op == "L":
            print("Contactos:")
            listContacts(contactos)
        elif op == 'A':
            print(addContact(contactos, 'Joao', '999888777'))
        elif op == 'R':
            print(removeContact(contactos, '433162999'))
        elif op == 'N':
            searchNumber(contactos, '727392822')
        elif op == 'P':
            print(filterPartName(contactos, 'C'))
        else:
            print("Não implementado!")
    

# O programa começa aqui
main()

