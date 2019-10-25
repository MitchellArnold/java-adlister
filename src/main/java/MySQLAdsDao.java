import java.sql.*;
import com.mysql.cj.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads{
    private Connection connection;

    public MySQLAdsDao(){
        try{

            DriverManager.registerDriver(new Driver());
            Config config = new Config();
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUsername(),
                    config.getPassword()
            );

            }catch (SQLException e) {
            e.printStackTrace();
        }

    }



    @Override
    public List<Ad> all() {
//        select * from ads where
        List<Ad> ads = new ArrayList<>();

        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM ads");
            while (rs.next()) {
                //
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


        private Ad translateRStoAd(ResultSet rs) {
            try {
                return new Ad(
                        rs.getLong("id "),
                        rs.getLong("user_id"),
                        rs.getString("title"),
                        rs.getString("description")
                );
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


//            if (rs.next()) {
//                System.out.println("Inserted a new record! New id: " + rs.getLong(1));
//
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return ads;
//    }



    @Override
    public Long insert(Ad ad) {
        return null;
    }
}
