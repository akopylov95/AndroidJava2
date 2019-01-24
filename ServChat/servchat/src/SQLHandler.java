import java.sql.*;

public class SQLHandler{

    private static String url = "jdbc:mysql://localhost:3306/maindb";
    private static String user = "eiolv";
    private static String password = "159753";
    private static PreparedStatement stmt;

    private static Connection c;

    public static void connect(){
        try {
            c = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void disconnect(){
        try {
            if (c != null && !c.isClosed()){
                    c.close();
            }
        } catch (SQLException e) {
                e.printStackTrace();
        }
    }

    public static String getNicByLoginAndPass(String login, String pass){
        String w = null;
        try{
            stmt = c.prepareStatement("SELECT Nickname FROM Users WHERE Login = ? AND Password = ?;");
            stmt.setString(1, login);
            stmt.setString(2, pass);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                w = rs.getString("Nickname");
            }
        } catch (SQLException e){
            System.out.println("SQLHandler.getNicByLoginAndPass");
        }
        return w;
    }
}