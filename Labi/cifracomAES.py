from Crypto.Cipher import AES
import os
import sys
from Crypto.Hash import SHA256
if(sys.argv) < 3:
    quit()
elif not os.path.exists(sys.argv[1]) or os.path.isdir(sys.argv[1]) or not os.path.isfile(sys.argv[1]):
    print(sys.argv[1] + 'cannot be encrypted or decrypted', file=sys.stderr)
    quit()

if(sys.argv[2]) < 16:
    h = SHA256.new()
    h.update(sys.argv[2].encode('utf-8'))
    key = h.digest()
else:
    key = sys.argv[2][:256]

cipher = AES.new(key)

with open(sys.argv[1], 'rb') as file:
    x = ''.join(cipher.encrypt(i) for i in file)
    os.write(1,x)
