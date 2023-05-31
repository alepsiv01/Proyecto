package org.example.Controlador;

import org.example.Modelo.Campeones;
import org.example.Modelo.ModTa;
import org.example.Persistencia.ConexionSQL;
import org.example.Vista.Ventana;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ControladorCarga extends MouseAdapter {
    private Ventana vista;
    private ModTa modelo;

    public ControladorCarga(Ventana vista) {
        this.vista = vista;
        modelo = new ModTa();
        this.vista.getTblLOL().setModel(modelo);
        this.vista.getBtnCargar().addMouseListener(this);
        this.vista.getBtnAgregar().addMouseListener(this);
        this.vista.getBtnActualizar().addMouseListener(this);
        this.vista.getBtnEliminar().addMouseListener(this);
        this.vista.getTblLOL().addMouseListener(this);
    }
   @Override
   public void mouseClicked(MouseEvent e) {

       if (e.getSource() == this.vista.getBtnCargar()) {
           modelo.cargar();
           this.vista.getTblLOL().setModel(modelo);
           this.vista.getTblLOL().updateUI();

           this.vista.limpiar();
       }
       if (e.getSource() == this.vista.getBtnAgregar()) {
           Campeones campeones = new Campeones();
           campeones.setID(0);
           campeones.setNombre(this.vista.getTxtNombre().getText());
           campeones.setRol(this.vista.getTxtRol().getText());
           campeones.setDificultad(this.vista.getTxtDificultad().getText());
           campeones.setHabilidad(this.vista.getTxtHabilidad().getText());
           campeones.setURL(this.vista.getTxtURL().getText());
           this.vista.getTblLOL().updateUI();
           if (modelo.agregar(campeones)) {
               JOptionPane.showMessageDialog(vista, "Se agrego correctamente", "aviso", JOptionPane.INFORMATION_MESSAGE);
               this.vista.getTblLOL().updateUI();
           } else {
               JOptionPane.showMessageDialog(vista, "No se pudo agregar a la base de datos. Por favor revise su conexion", "Error", JOptionPane.ERROR_MESSAGE);
           }
           this.vista.limpiar();
       }
       if (e.getSource() == this.vista.getBtnActualizar()) {
           int respuesta = JOptionPane.showConfirmDialog(vista, "¿Estas seguro que se actualice el registro?",
                   "Confirmacion", JOptionPane.YES_NO_OPTION);
           if (e.getSource() == this.vista.getBtnActualizar()) {
               int resul = JOptionPane.showConfirmDialog(vista, "¿Quieres actualizar el registro?", "ATENCION", JOptionPane.YES_NO_OPTION);
               if (resul == 0) {
                   Campeones campeon = new Campeones();
                   campeon.setID(Integer.parseInt((String) this.vista.getTxtIDN().getText()));
                   campeon.setNombre(this.vista.getTxtNombreN().getText());
                   campeon.setRol(this.vista.getTxtRolN().getText());
                   campeon.setDificultad(this.vista.getTxtDificultadN().getText());
                   campeon.setHabilidad(this.vista.getTxtHabilidadN().getText());
                   campeon.setURL(this.vista.getTxtURLN().getText());
                   this.vista.getTblLOL().updateUI();
                   if (modelo.actualizar(campeon)) {
                       JOptionPane.showMessageDialog(vista, "Se actualizo el registro", "ATENCION", JOptionPane.INFORMATION_MESSAGE);
                       this.vista.getTblLOL().updateUI();
                   } else {
                       JOptionPane.showMessageDialog(vista, "No se actualizo. Revisar conexion", "ERROR", JOptionPane.ERROR_MESSAGE);
                   }
                   this.vista.limpiarPn4();
               } else {
                   this.vista.limpiarPn4();
               }
           }
       }
           if (e.getSource() == this.vista.getBtnEliminar()) {
               int respuesta = JOptionPane.showConfirmDialog(vista, "Estas seguro de borrar el registro?",
                       "Confirmacion", JOptionPane.YES_NO_OPTION);
               if (respuesta == 0) {
                   String sqlDelete = "DELETE FROM Campeones WHERE id=?;";
                   PreparedStatement pstm = null;
                   try {
                       pstm = ConexionSQL.getInstance("LOLDB.db").getConnection().prepareStatement(sqlDelete);
                   } catch (SQLException ex) {
                       throw new RuntimeException(ex);
                   }
                   try {
                       pstm.setInt(1, Integer.parseInt(this.vista.getTxtElminarId().getText()));
                       this.vista.getTblLOL().updateUI();
                       JOptionPane.showMessageDialog(vista, "Se elimino correctamente", "aviso", JOptionPane.INFORMATION_MESSAGE);
                   } catch (NumberFormatException a) {
                       JOptionPane.showMessageDialog(vista, "No se elimino correctamente", "aviso", JOptionPane.ERROR_MESSAGE);
                   } catch (SQLException ex) {
                       System.out.println(ex.getMessage());
                   }
                   try {
                       pstm.executeUpdate();
                   } catch (SQLException ex) {
                       JOptionPane.showMessageDialog(vista, "Error en Id", "aviso", JOptionPane.INFORMATION_MESSAGE);
                       throw new RuntimeException(ex);
                   } finally {
                       this.vista.limpiarPn4();
                   }
               }
           }
           if (e.getSource() == vista.getTblLOL()) {
               int index = this.vista.getTblLOL().getSelectedRow();
               Campeones tmp = modelo.getCampeonIndex(index);
               try {
                   this.vista.getImagenCampeon().setIcon(tmp.getImagen());
               } catch (MalformedURLException mfue) {
                   System.out.println(e.toString());
               }
           }
       }
   }
