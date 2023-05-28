package org.example.Persistencia;

import org.example.Modelo.Campeones;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CampeonesDAO implements DAO{
    public CampeonesDAO() {
    }

    @Override
    public boolean insertar(Object obj) throws SQLException {
        String sqlInsert = "INSERT INTO Campeones(Nombre, Rol, Dificultad, Habilidad, URL) VALUES(?,?,?,?,?)";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSQL.getInstance("LOLDB.db").getConnection().prepareStatement(sqlInsert);
        pstm.setString(1,((Campeones)obj).getNombre());
        pstm.setString(2,((Campeones)obj).getRol());
        pstm.setString(3,((Campeones)obj).getDificultad());
        pstm.setString(4,((Campeones)obj).getHabilidad());
        pstm.setString(5,((Campeones)obj).getURL());
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public boolean update(Object obj) throws SQLException {
        String sqlUpdate = "UPDATE Campeones SET Nombre = ?, " +
                "Rol = ?, Dificultad = ?, Habilidad = ?, URL = ? WHERE id = ? ;";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSQL.getInstance("LOLDB.db").getConnection().prepareStatement(sqlUpdate);
        pstm.setString(1,((Campeones)obj).getNombre());
        pstm.setString(2,((Campeones)obj).getRol());
        pstm.setString(3,((Campeones)obj).getDificultad());
        pstm.setString(4,((Campeones)obj).getHabilidad());
        pstm.setString(5,((Campeones)obj).getURL());
        pstm.setInt(6,((Campeones)obj).getID());
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public boolean delete(String id) throws SQLException {
        String sqlDelete = "DELETE FROM Campeones WHERE id = ? ; ";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSQL.getInstance("LOLDB.db").getConnection().prepareStatement(sqlDelete);
        pstm.setInt(1,Integer.parseInt(id));
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public ArrayList obtenerTodo() throws SQLException {
        String sql = "SELECT * FROM Campeones";
        ArrayList<Campeones> resultado = new ArrayList<>();


        Statement stm = ConexionSQL.getInstance("LOLDB.db").getConnection().prepareStatement(sql);
        ResultSet rst = stm.executeQuery(sql);
        while (rst.next()){
            resultado.add(new Campeones(rst.getInt(1), rst.getString(2),
                    rst.getString(3),rst.getString(4),
                    rst.getString(5),rst.getString(6)));
        }
        return resultado;
    }

    @Override
    public Object buscarporID(String id) throws SQLException {
        String sql = "SELECT * FROM Campeones WHERE id = ? ; ";
        Campeones campeones = null;

            PreparedStatement pstm = ConexionSQL.getInstance("LOLDB.db").getConnection().prepareStatement(sql);
            pstm.setInt(1,Integer.parseInt(id));
            ResultSet rst = pstm.executeQuery();
            if (rst.next()){
                campeones = new Campeones(rst.getInt(1), rst.getString(2),
                        rst.getString(3),rst.getString(4),
                        rst.getString(5),rst.getString(6));
            }
        return campeones;
    }
}
