import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Employee implements java.io.Serializable {
    String name;
    int age;
}
class Department implements java.io.Serializable {
    String name;
    Employee leader;
}

public class Serial {
    public static void main(String[] args) throws Exception {
        Employee tanaka = new Employee();
        tanaka.name = "田中一郎";
        tanaka.age = 41;
        Department soumubu = new Department();
        soumubu.name = "総務部";
        soumubu.leader = tanaka;

        FileOutputStream fos = new FileOutputStream("./company.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(soumubu);
        oos.flush();
        oos.close();

    }
}