package dao;

import Utilerias_II.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.logging.Logger;
import java.util.ArrayList;
import model.Auto;

public class DaoAuto implements idao.IAuto {

    private Connection cnx;

    @Override
    public void createAuto(Auto p) {
        try {
            createautomysql(p);
        } catch (SQLException ex) {
            Logger.getLogger(DaoAuto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    @Override
    public Auto readAuto(int id) {
        Auto a = null;
        try {
            a=readAutoMysql(id);
        } catch (SQLException ex) {
           
        }
        return a; 
    }

    public ArrayList<Auto>  readAuto() {
         ArrayList<Auto> a = null;
         
        return null;
          
    }

    @Override
    public void updateAuto(Auto a) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteAuto(Auto a) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void createautomysql(Auto a) throws SQLException {
        Conexion con = new Conexion();
        cnx = con.getConexion();
        
        String sql = "INSERT INTO Alta(marca, modelo, color) VALUES(?, ?, ?);";
        PreparedStatement ps;

        ps = cnx.prepareStatement(sql);
        ps.setString(1, a.getMarca());
        ps.setString(2, a.getModelo());
        ps.setString(3, a.getColor());
        ps.executeUpdate();
    }
//    private Auto readAutosMysql(Auto a) throws SQLException{
//        Conexion con = new Conexion();
//        cnx = con.getConexion();
//        String sql = "SELECT * FROM alta;";
//        Statement sta = cnx.createStatement();
//        ResultSet rs = sta.executeQuery(sql);
//        
//        if(rs.next()){
//            a = new Auto();
//            a.setId(rs.getInt("id"));
//            a.setMarca(rs.getString("marca"));
//            a.setModelo(rs.getString("modelo"));
//            a.setColor(rs.getString("color"));
//        }
//        cnx.close();
//        return a;
//    }
    private Auto readAutoMysql(int id) throws SQLException{
        Auto a = null;
        
        Conexion con = new Conexion();
        cnx = con.getConexion();
        String sql = "SELECT * FROM alta where id="+id+";";
        Statement sta = cnx.createStatement();
        ResultSet rs = sta.executeQuery(sql);
        
        if(rs.next()){
            a = new Auto();
            a.setId(rs.getInt("id"));
            a.setMarca(rs.getString("marca"));
            a.setModelo(rs.getString("modelo"));
            a.setColor(rs.getString("color"));
        }
        cnx.close();
        return a;
    }

}


