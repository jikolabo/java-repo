
public class Main {
  public static void main(String[] args){
    Bank b = new Bank();
    Bank b2 = new Bank();
    b.name = "みずほ";
    b.address = "日本";
    b2.name = "みずほ";
    b2.address = "日本";

    if(b.equals(b2)){
      System.out.println("二つの銀行は同じ内容です。");
    }

  }
}