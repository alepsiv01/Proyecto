package org.example.Modelo;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Campeones {
    private int ID;
    private String Nombre;
    private String Rol;
    private String Dificultad;
    private String Habilidad;
    private String URL;

    public Campeones() {
    }
    public Campeones(int ID, String nombre, String rol, String dificultad, String habilidad, String URL) {
        this.ID = ID;
        this.Nombre = nombre;
        this.Rol = rol;
        this.Dificultad = dificultad;
        this.Habilidad = habilidad;
        this.URL = URL;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getRol() {
        return Rol;
    }

    public void setRol(String rol) {
        Rol = rol;
    }

    public String getDificultad() {
        return Dificultad;
    }

    public void setDificultad(String dificultad) {
        Dificultad = dificultad;
    }

    public String getHabilidad() {
        return Habilidad;
    }

    public void setHabilidad(String habilidad) {
        Habilidad = habilidad;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    @Override
    public String toString() {
        return "Campeones{" +
                "ID=" + ID +
                ", Nombre='" + Nombre + '\'' +
                ", Rol='" + Rol + '\'' +
                ", Dificultad='" + Dificultad + '\'' +
                ", Habilidad='" + Habilidad + '\'' +
                ", URL='" + URL + '\'' +
                '}';
    }
    public ImageIcon getImagen()throws MalformedURLException {
        URL url = new URL(this.URL);
        return new ImageIcon(url);
    }
}
