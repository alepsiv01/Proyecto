package org.example.Persistencia;

import org.example.Modelo.Campeones;

import java.sql.*;
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
    public ArrayList<Campeones> obtenerTodo() throws SQLException {
        String sql = "SELECT * FROM Campeones";
        ArrayList<Campeones> resultado = new ArrayList<>();
        String dbPath = "C:\\Users\\Efrain\\IdeaProjects\\Proyecto\\LOLDB.db";
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:" + dbPath);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                resultado.add(new Campeones(resultSet.getInt(1), resultSet.getString(2),
                        resultSet.getString(3), resultSet.getString(4),
                        resultSet.getString(5), resultSet.getString(6)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
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
