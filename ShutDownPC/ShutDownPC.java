import java.io.*;
public class ShutDownPC{

    public static void main(String[] args) throws IOException {
        Runtime runtime = Runtime.getRuntime();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter no. of Seconds after which you want your computer to Shutdown: ");
        long v = Long.parseLong(br.readLine());

        Process proc = runtime.exec("shutdown -s -t " + v);

        System.exit(0);
    }
}
