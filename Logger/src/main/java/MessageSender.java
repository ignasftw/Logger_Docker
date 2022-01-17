import java.sql.*;

public class MessageSender {
    public MessageSender(){
        String uname = "root";
        String password = "root";
        String query =  "SELECT * FROM client";
        String url = "jdbc:mysql://localhost:3307/clients";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Connection con= null;
        try {
            con = DriverManager.getConnection(url,uname,password);
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next()){
                String data = "";
                for (int i=1; i<=3;i++){
                    data += rs.getString(i) + " ";
                }
                System.out.println(data);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
