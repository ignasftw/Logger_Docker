import java.sql.*;

public class MessageSender {
    public MessageSender(){
        String uname = "root";
        String password = "root";
        String query = "INSERT INTO Cpu (temperature) VALUES (100);";

        String url = "jdbc:mysql://logger_docker_mysql_1:3306";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Connection con= null;
        try {
            con = DriverManager.getConnection(url,uname,password);
            Statement stmt=con.createStatement();

            stmt.executeQuery("use Temperature;");
            //stmt.executeUpdate(query);
            ResultSet rs= stmt.executeQuery("SELECT * FROM Cpu;");

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
