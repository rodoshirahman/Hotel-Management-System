
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author khadi
 */
public class DbHelper {

    private static Connection connect = null;
    private PreparedStatement pStatement = null;
    private Statement statement = null;
    private static String dbName = "hotel";

    public DbHelper() {

    }

    public static void setConnection() throws ClassNotFoundException, SQLException {
        String user = "root";
        String password = "";
        String url = "jdbc:mysql://localhost/" + dbName;
        Class.forName("com.mysql.jdbc.Driver");
        connect = (Connection) DriverManager.getConnection(url, user, password);
    }

    public String countUser() throws ClassNotFoundException, SQLException {
        DbHelper.setConnection();
        try {
            String query = "SELECT count(*) as count FROM register ";
            statement = (Statement) connect.createStatement();
            ResultSet result = statement.executeQuery(query);
            System.out.println(result);
            String num = null;
            while (result.next()) {
                num = result.getString("count");
            }
            return num;
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return "error";
    }

    public void insertNewUser(ArrayList<String> userInfo) throws ClassNotFoundException, SQLException {
        DbHelper.setConnection();
        String query = "INSERT INTO register VALUES(?,?,?,?,?,?,?,?,?,?)";
        pStatement = (PreparedStatement) connect.prepareStatement(query);
        pStatement.setString(1, userInfo.get(0));
        pStatement.setString(2, userInfo.get(1));
        pStatement.setString(3, userInfo.get(2));
        pStatement.setString(4, userInfo.get(3));
        pStatement.setString(5, userInfo.get(4));
        pStatement.setString(6, userInfo.get(5));
        pStatement.setString(7, userInfo.get(6));
        pStatement.setString(8, userInfo.get(7));
        pStatement.setString(9, userInfo.get(8));
        pStatement.setString(10, userInfo.get(9));

        pStatement.executeUpdate();
    }

    public boolean findUser(String userEmail, String givenPass) throws ClassNotFoundException, SQLException {
        DbHelper.setConnection();

        try {
            String query = "SELECT password_1 FROM register WHERE email= '" + userEmail + "'";
            statement = (Statement) connect.createStatement();
            ResultSet result = statement.executeQuery(query);
            System.out.println(result);
            String userpass = null;
            while (result.next()) {
                userpass = result.getString("password_1");
            }
            if (userpass.equals(givenPass)) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return false;
    }

    public boolean insertNewReservation(ArrayList<String> reservationInfo) throws ClassNotFoundException, SQLException {
        DbHelper.setConnection();
            String query = "INSERT INTO reservation VALUES(?,?,?,?,?,?,?)";
            pStatement = (PreparedStatement) connect.prepareStatement(query);
            pStatement.setString(1, reservationInfo.get(0));
            pStatement.setString(2, reservationInfo.get(1));
            pStatement.setString(3, reservationInfo.get(2));
            pStatement.setString(4, reservationInfo.get(3));
            pStatement.setString(5, reservationInfo.get(4));
            pStatement.setString(6, reservationInfo.get(5));
            pStatement.setString(7, reservationInfo.get(6));
            pStatement.executeUpdate();
  
            return true;
     
    }

    boolean findAdmin(String username, String password) throws ClassNotFoundException, SQLException {
        DbHelper.setConnection();

        try {
            String query = "SELECT password FROM admin";
            statement = (Statement) connect.createStatement();
            ResultSet result = statement.executeQuery(query);
            System.out.println(result);
            String pass = null;
            while (result.next()) {
                pass = result.getString("password");
            }
            if (username.equals("Admin") && pass.equals(pass)) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return false;
    }
    
    public void bill_generate(String userEmail) throws ClassNotFoundException, SQLException
    {
       DbHelper.setConnection();
       try
       {
           String query = "SELECT * FROM reservation WHERE email= '" + userEmail + "'";
           statement = (Statement) connect.createStatement();
           ResultSet result = statement.executeQuery(query);
           String email = null,troom = null,bed = null,nroom = null,meal = null,cin = null,cout = null;
           while (result.next()) {
               email = result.getString("email");
               troom = result.getString("troom");
               bed = result.getString("bed");
               nroom = result.getString("nroom");
               meal = result.getString("meal");
               cin = result.getString("cin");
               cout = result.getString("cout");
           }
           
           String query1 = "SELECT price FROM room WHERE name= '" + troom + "'";
           statement = (Statement) connect.createStatement();
           ResultSet result1 = statement.executeQuery(query1);
           String roomrent = null;
           while (result1.next()) {
               roomrent = result1.getString("price");
           }
           
           double rent = Double.parseDouble(roomrent);
           double bedno = 0;
           if(bed.equals("Single"))
               bedno=1;
           else if(bed.equals("Double"))
               bedno=2;
           else if(bed.equals("Triple"))
               bedno=3;
           else 
               bedno=4;
           
           double noroom = Double.parseDouble(nroom);
           
           double mealrent = 0;
           if(meal.equals("Room only"))
               mealrent = 1200;
           else if(meal.equals("Breakfast"))
               mealrent = 800;
           else if(meal.equals("Half Board"))
               mealrent = 1800;
           else
               mealrent = 2100;
           
           double bill;
           bill = rent * bedno * noroom * mealrent;
           
        String query2 = "INSERT INTO payment VALUES(?,?,?,?,?,?,?,?,?,?,?)";
        pStatement = (PreparedStatement) connect.prepareStatement(query2);
        pStatement.setString(1, email);
        pStatement.setString(2, troom);
        pStatement.setString(3, bed);
        pStatement.setString(4, cin);
        pStatement.setString(5, cout);
        pStatement.setString(6, nroom);
        pStatement.setString(7, meal);
        pStatement.setString(8, String.valueOf(rent));
        pStatement.setString(9, String.valueOf(bedno));
        pStatement.setString(10, String.valueOf(mealrent));      
        pStatement.setString(11,String.valueOf(bill));

        pStatement.executeUpdate();
           
           
       }catch (SQLException e) {
            System.out.println(e.toString());
        }
    }

}
