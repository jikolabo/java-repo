import java.io.*;
import java.util.*;

public class SetProp {
    public static void main(String[] args) throws IOException {
        Writer fw = new FileWriter("./sample.properties");
        Properties p = new Properties();

        p.setProperty("heroHame", "アサカ");
        p.setProperty("heroHp", "42");
        p.setProperty("heroMp", "45");
        p.store(fw, "情報");
        fw.close();
        
    }
}
