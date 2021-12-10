import java.net.InetAddress;

class GetIp {
    public static void main(String[] args) throws Exception {
        InetAddress myIP = InetAddress.getLocalHost();
        System.out.println("My IP Address is: " + myIP.getHostAddress());
    }
}
