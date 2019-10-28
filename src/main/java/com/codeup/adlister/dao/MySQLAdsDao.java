package com.codeup.adlister.dao;

import com.codeup.adlister.models.Ad;
import com.mysql.cj.jdbc.Driver;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class MySQLAdsDao implements Ads {
    private Connection connection = null;



    public MySQLAdsDao(Config config) {

        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                config.getUrl(),
                config.getUsername(),
                config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database!", e);
        }
    }

    @Override
    public List<Ad> all() {
        PreparedStatement stmt = null;

        try {
            // FIRST TRY //
            String query = "SELECT * FROM ads";
//            PreparedStatement ps = connection.prepareStatement(query);
//            ps.setString();
            stmt = connection.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            return createAdsFromResults(rs);
        } catch (SQLException e) {
            throw new RuntimeException("Error retrieving all ads.", e);
        }
    }

    @Override
    public Long insert(Ad ad) {
        try {
            String query = "SELECT * FROM ads";
            PreparedStatement stmt = connection.prepareStatement(createInsertQuery(), PreparedStatement.RETURN_GENERATED_KEYS);
            // Evaluation happens at compile time, not at runtime
            stmt.setLong(1, ad.getUserId());
            stmt.setString(2, ad.getTitle());
            stmt.setString(3, ad.getDescription());
            stmt.executeUpdate();

            ResultSet rs = stmt.getGeneratedKeys();
            rs.next();
                System.out.println("Insered new record! New id: " + rs.getLong(1));
                return rs.getLong(1);

        } catch (SQLException e) {
            throw new RuntimeException("Error creating a new ad.", e);
        }
    }

    private String createInsertQuery() {
//        return "INSERT INTO ads(user_id, title, description) VALUES "
//            + "(" + ad.getUserId() + ", "
//            + "'" + ad.getTitle() +"', "
//            + "'" + ad.getDescription() + "')";
            return "INSERT INTO ads(user_id, title, description) VALUES (?, ?, ?)";
    }

    private Ad extractAd(ResultSet rs) throws SQLException {
        return new Ad(
            rs.getLong("id"),
            rs.getLong("user_id"),
            rs.getString("title"),
            rs.getString("description")
        );
    }

    private List<Ad> createAdsFromResults(ResultSet rs) throws SQLException {
        List<Ad> ads = new ArrayList<>();
        while (rs.next()) {
            ads.add(extractAd(rs));
        }
        return ads;
    }

    public static void main(String[] args) {
        Ads adsDao = new MySQLAdsDao(new Config());
//        List<Ad> ads = adsDao.all();
//        for(Ad ad : ads){
//            System.out.println(ad.toString());
//        }
        long lastInsertedId = adsDao.insert(new Ad(1, "Storage Shed for sale", "Old, but not old enough to hold up."));
        System.out.println("lastInsertedId = " + lastInsertedId);
    }
}
