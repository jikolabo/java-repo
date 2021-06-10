import java.net.*;
import java.io.*;

public class SocketGetHtml {
    public static void main(String[] args) throws IOException {
        Socket sock = new Socket("dokojava.jp", 80);
        InputStream is = sock.getInputStream();
        OutputStream os = sock.getOutputStream();
        os.write("GET /index.html HTTP/1.0\n".getBytes());
        os.write("\n".getBytes());
        os.flush();
        InputStreamReader isr = new InputStreamReader(is);
        int i = isr.read();
        while (i != -1) {
            System.out.print((char) i);
            i = isr.read();
        }
        sock.close();
    }
}
