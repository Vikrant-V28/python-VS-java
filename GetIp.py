import socket
hostname = socket.gethostname()
IPAddress = socket.gethostbyname(hostname)
print("My IP Adress is: " + IPAddress)
