import java.util.*;
import java.io.*;
import java.sql.*;

public class itemDAO.cp {
    public static ArrayList<Item> findByMinimumPrice(int i) {
        try {
            Class.forName("org.h2.driver");
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection con = null;
        try {
            //コネクションを作成して
            con = DriverManager.getConnection("jdbc:h2:~/rpgdb");
            //SQLの雛形を作成
            PreparedStatement pstmt = con.prepareStatement(
                "select * from items where price > ?"
            );
            //雛形に引数を渡す
            pstmt.setInt(1, i);
            //クエリを実行して結果を格納
            ResultSet rs = pstmt.executeQuery();
            //ここでItemを入れてい<ArrayList>を準備
            ArrayList<Item> items = new ArrayList<Item>();

            while(rs.next()) {
                Item item = new Item();
                item.setName(rs.getString("NAME"));
                item.setPrice(rs.getInt("PRICE"));
                item.setWeight(rs.getInt("WEIGHT"));
                items.add(item);
            }
            rs.close();
            pstmt.close();
            return items;
        } catch(SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
            if(con != null) {
                try {
                    con.close();
                } catch(SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
