import java.sql.*;

public class MyDB {

    public class MySQLAdsDao {

        try{
            Config config = new Config();
            DriverManager.registerDriver(new Driver());
            Connection connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUsername(),
                    config.getPassword()
            );
            Statement stmt = connection.createStatement();
//            String sql = 'SELECT * FROM '
        } catch(SQLException e){
            e.printStackTrace();
        }
    }
}
