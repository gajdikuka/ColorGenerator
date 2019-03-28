package Model;
import java.sql.*;
import java.util.ArrayList;

public class dbManager {

    private Connection connection;

    public void Csatlakoz(){

        try {
            Class.forName("oracle.jdbc.OracleDriver");
        } catch (ClassNotFoundException e) {

            System.out.println("No Driver!");
            e.printStackTrace();
            return;
        }

        connection = null;

        try{
            connection = DriverManager.getConnection(
                    "jdbc:oracle:thin:@193.225.33.71:1521:xe", "szg6rp", "szelektcsillag");
        } catch (SQLException e){
            System.out.println("Connection Failed");
            e.printStackTrace();
            return;
        }

    }

    public ArrayList<Character> GetHex(){
        ArrayList<Character> hexList = new ArrayList<>();
        Statement stmt;
        ResultSet rs;
        try {
            stmt = connection.createStatement();
            rs= stmt.executeQuery("select * from bedando");
            while(rs.next())
                hexList.add(rs.getString(2).charAt(0));
            connection.close();

        }catch(SQLException e){
            System.out.println("Connection Failed!");
            e.printStackTrace();
        }
        return hexList;
    }

}