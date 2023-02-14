from Crypto.Hash import SHA256
from Crypto.Cipher import ARC4
import os

def encriptar(ficheiro):
    with open(ficheiro, 'rb') as file:
        buffer = file.read(256)
        while len(buffer) > 0:
            if len(buffer) < 5:
                h = SHA256.new()
                for i in file:
                    h.update(i.encode('utf-8'))
                print(h.hexdigest())
            elif len(buffer) > 256:
                buffer1 = buffer[:257]
                cipher = ARC4.new('chave')
                cryptogram = cipher.encrypt('buffer1')
                os.write(1, cryptogram)
                print()
            else:
                cipher = ARC4.new('chave')
                cryptogram = cipher.encrypt('buffer')
                os.write(1, cryptogram)
                print()
            buffer = file.read(256)

                