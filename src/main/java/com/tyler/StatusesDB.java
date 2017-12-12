package com.tyler;

import java.sql.*;
import java.util.ArrayList;

/*
This class handles my database
 */
public class StatusesDB extends DBConfig {

    // Retrieves all statues in the database and sorts them by created_at
    public ArrayList<StatusObj> getStatuses() {

        try (Connection conn = DriverManager.getConnection(db_url);
                Statement statement = conn.createStatement()) {
                // Create a query that returns all statuses from the StatusObj table
                String getAllStatus = "SELECT * FROM status ORDER BY created_on ASC";
                ResultSet rs = statement.executeQuery(getAllStatus);
                ArrayList<StatusObj> statusList = new ArrayList<>();
                // While the ResultSet contains data, create a status object
                while (rs.next()) {
                    StatusObj status = new StatusObj(rs.getString("status_text"), rs.getString("created_on"));
                    statusList.add(status);
                }
                statement.close();
                return statusList;

        } catch (SQLException se) {
            se.printStackTrace();
        } return null;
    }

    public void addStatus(String message, String created) {

        try (Connection conn = DriverManager.getConnection(db_url);
             Statement statement = conn.createStatement()) {

            // Create a query that checks if a status already exists
            String statusExists = "SELECT * FROM status WHERE status_text = '" + message + "'";
            ResultSet rs = statement.executeQuery(statusExists);
            if (!rs.next()) {
                // If the status doesn't already exist, create a query to add the status to status table
                //
                String sqlAdd = "INSERT INTO status VALUES (?, ?)";
                PreparedStatement preparedStatement = conn.prepareStatement(sqlAdd);
                preparedStatement.setString(1, message);
                preparedStatement.setString(2, created);

                int rowsInserted = preparedStatement.executeUpdate();
                if (rowsInserted > 0) {
                    System.out.println("Status added to database");
                }
            }
            statement.close();
        } catch (SQLException se) {
            se.printStackTrace();
        }
    }
}
