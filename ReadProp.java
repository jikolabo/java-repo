import java.io.*;
import java.util.*;

public class ReadProp {
    public static void main(String[] args) throws Exception {
        Reader fr = new FileReader("./sample.properties");
        Properties p = new Properties();
        p.load(fr);
        String name = p.getProperty("heroName");
        String strHp = p.getProperty("heroHp");
        int hp = Integer.parseInt(strHp);
        System.out.println("名前:" + name);
        System.out.println("HP:" + hp);
        fr.close();

    }
}
