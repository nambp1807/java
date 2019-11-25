package jv2_labsession7;

import java.sql.*;

public class Connect {
    Connection conn;
    private static Connect instance;

    private Connect() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/labsession6?useUnicode=true&characterEncoding=utf-8";
            String username = "root";
            String password = "";
            conn = DriverManager.getConnection(url,username,password);
        }
        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connect getInstance(){
        if(instance==null){
            instance = new Connect();
        }
        return instance;
    }

    public ResultSet getQuery(String sql){
        try{
            Statement stm = conn.createStatement();
            return stm.executeQuery(sql);
        }
        catch (Exception e){};
        return null;
    }

    public boolean updateQuery(String sql){
        try{
            Statement stm = conn.createStatement();
            if(stm.executeUpdate(sql)>0){
                return true;
            }
        }
        catch (Exception e){}
        return false;
    }
    public void close(){
        try{
            conn.close();
        }
        catch (Exception e){}
    }
}