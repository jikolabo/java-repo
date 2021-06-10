import java.sql.*;

public class Database {
    public static void main(String[] args) {
        try {
            Class.forName("org.h2.Driver");
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        }

        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:h2:~/rpgdb");
            con.setAutoCommit(false);

            /* メインの処理 */

            con.commit();

        } catch(SQLException e) {
            try {
                con.rollback();
            } catch(SQLException e2) {
                e2.printStackTrace();
            } finally {
                if( con != null) {
                    try {
                        con.close();
                    } catch(SQLException e3) {
                        e3.printStackTrace();
                    }
                }
            }
        }
    }
}
