import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException{
    FileOutputStream fos = new FileOutputStream("test2.dat", true);
    fos.write(65);
    fos.flush();
    fos.close();
  }
}