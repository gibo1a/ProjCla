from Crypto.Hash import SHA256
from Crypto.Cipher import ARC4
import os
import sys

if sys.argv < 3:
    quit()
elif not os.path.exists(sys.argv[1]) or not os.path.isfile(sys.argv[1]) or os.path.isdir(sys.argv[1]):
    quit()

if sys.argv[2] < 5:
    h = SHA256.new()
    h.update(sys.argv[2].encode('utf-8'))
    key = h.digest()
else:
    key = sys.argv[2][:256]

with open(sys.argv[1],'rb') as file:
    cipher = ARC4.new(key)
    for i in file:
        criptograma = cipher.encrypt(i)
        os.write(1,criptograma)
        print()

    
                