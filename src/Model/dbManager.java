package Model;
import Controller.Logger.ProgramLogger;

import java.sql.*;
import java.util.ArrayList;

public class dbManager {
    private ProgramLogger logger = new ProgramLogger();
    private Connection connection;

    public void Csatlakoz(){

        try {
            Class.forName("oracle.jdbc.OracleDriver");
        } catch (ClassNotFoundException e) {
            System.out.println("No Driver!");
            logger.LogException(e);
        }

        connection = null;

        try{
            connection = DriverManager.getConnection(
                    "jdbc:oracle:thin:@193.225.33.71:1521:xe", "szg6rp", "szelektcsillag");
        } catch (SQLException e){
            System.out.println("Connection Failed");
            logger.LogException(e);
        }

    }

    /**
     *
     * This method connects to the database and
     * gets all the values stored in it.
     * @return ArrayList<Character> This should return [1,2,3,4,5,6,7,8,9,A,B,C,D,E,F]
     */
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
            logger.LogException(e);
        }
        return hexList;
    }

}
