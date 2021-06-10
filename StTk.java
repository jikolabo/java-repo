import java.util.StringTokenizer;

public class StTk {
    public static void main(String[] args) {
        String s = "ミナト,アサカ,スガワラ";
        StringTokenizer st = new StringTokenizer(s, ",");
        while(st.hasMoreTokens()) {
            String t = st.nextToken();
            System.out.println(t);
        }
    }
}
