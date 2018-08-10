package hello_module_Dao;

public class JDBCUtil {
    public static void main(String args) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc");
            System.out.println("ss");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


}

