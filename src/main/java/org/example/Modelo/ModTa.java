package org.example.Modelo;

import org.example.Persistencia.CampeonesDAO;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.sql.*;
import java.util.ArrayList;

public class ModTa implements TableModel {
    public static final int COLUMNS = 6;
    private ArrayList<Campeones> datos;
    private CampeonesDAO campeonesDAO;

    public ModTa() {
        campeonesDAO = new CampeonesDAO();
        datos = new ArrayList<>();
    }

    public ModTa(ArrayList<Campeones> datos) {
        campeonesDAO = new CampeonesDAO();
        this.datos = datos;
    }

    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMNS;
    }

    @Override
    public String getColumnName(int rowIndex) {
        switch (rowIndex){
            case 0:
                return "ID";
            case 1:
                return "Nombre";
            case 2:
                return "Rol";
            case 3:
                return "Dificultad";
            case 4:
                return "Habilidad";
            case 5:
                return "URL";
        }
        return null;
    }

    @Override
    public Class<?> getColumnClass(int rowIndex) {
        switch (rowIndex){
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
            case 4:
                return String.class;
            case 5:
                return String.class;
        }
        return null;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Campeones champs = datos.get(rowIndex);
        switch (columnIndex){
            case 0:
                return champs.getID();
            case 1:
                return champs.getNombre();
            case 2:
                return champs.getRol();
            case 3:
                return champs.getDificultad();
            case 4:
                return champs.getHabilidad();
            case 5:
                return champs.getURL();
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                //datos.get(rowIndex).setID();
                break;
            case 1:
                datos.get(rowIndex).setNombre((String)aValue);
                break;
            case 2:
                datos.get(rowIndex).setRol((String)aValue);
                break;
            case 3:
                datos.get(rowIndex).setDificultad((String)aValue);
                break;
            case 4:
                datos.get(rowIndex).setHabilidad((String)aValue);
                break;
            case 5:
                datos.get(rowIndex).setURL((String)aValue);
                break;
            default:
                System.out.println("No se modifica nada");

        }

    }

    @Override
    public void addTableModelListener(TableModelListener l) {


    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }
    public void cargar (){
        try {
            ArrayList<Campeones> tirar = campeonesDAO.obtenerTodo();
            System.out.println(tirar);
            datos = campeonesDAO.obtenerTodo();
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
    }

    public boolean agregar(Campeones campeones){
        boolean resultado = false;
        try{
            if(campeonesDAO.insertar(campeones)){
                datos.add(campeones);
                resultado = true;
            }else{
                resultado = false;
            }
        }catch(SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        return resultado;
    }
    public Campeones getCampeonIndex(int idx){
        return datos.get(idx);
    }
    public boolean actualizar(Campeones camp) {
        boolean resultado = false;
        try {
            if (campeonesDAO.update(camp)) {
                datos.add(camp);
                resultado = true;
            } else {
                resultado = false;
            }
        } catch (SQLException sqle) {
            System.out.println("Error" + sqle.getMessage());
        }
        return resultado;
    }
}