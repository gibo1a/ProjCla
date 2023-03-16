from Crypto.Hash import SHA256
def toSha256(ficheiro):
    h = SHA256.new()
    with open(ficheiro,'rb') as file:
        for i in file:
            h.update(i[:-2].encode('utf-8'))
    print(h.hexdigest())


