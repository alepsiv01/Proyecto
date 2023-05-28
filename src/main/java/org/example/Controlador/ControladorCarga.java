package org.example.Controlador;

import org.example.Modelo.ModTa;
import org.example.Vista.Ventana;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ControladorCarga extends MouseAdapter {
    private Ventana vista;
    private ModTa modelo;

    public ControladorCarga(Ventana vista) {
        this.vista = vista;
        this.vista.getBtnCargar().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == this.vista.getBtnCargar()){
            modelo = new ModTa();
            modelo.cargar();
            this.vista.getTblLOL().setModel(modelo);
            this.vista.getTblLOL().updateUI();
        }

    }
}
