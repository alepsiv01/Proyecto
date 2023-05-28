package org.example;

import org.example.Controlador.ControladorCarga;
import org.example.Vista.Ventana;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Ventana ventanita = new Ventana("proyecto");
        ControladorCarga controlador = new ControladorCarga(ventanita);
    }
}
