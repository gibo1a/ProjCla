import socket

def main():
    udp_s = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
    udp_s.bind(("127.0.0.1", 1234))
    while 1:
        data, adrr = udp_s.recvfrom(4096)
        print(data[:-2])
        message = input("Message? ")
        message2 = message.encode("utf-8")
        udp_s.sendto(message2,adrr)
    udp_s.close()

main()


