import java.io.*;
import java.util.*;

public class ReadProp2 {
    public static void main(String[] args) throws Exception {
        Reader fr = new FileReader("./pref.properties");
        Properties p = new Properties();

        p.load(fr);
        System.out.println(p.getProperty("aichi.capital") + ":" + p.getProperty("aichi.food"));
        fr.close();
    }
}