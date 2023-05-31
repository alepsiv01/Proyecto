package org.example.Vista;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    // PANEL 1
    private JLabel lblID;
    private JLabel lblNombre;
    private JLabel lblRol;
    private JLabel lblDificultad;
    private JLabel lblHabilidad;
    private JLabel lblURL;
    private JTextField txtID;
    private JTextField txtNombre;
    private JTextField txtRol;
    private JTextField txtDificultad;
    private JTextField txtHabilidad;
    private JTextField txtURL;
    private JButton btnAgregar;
    //PANEL 2
    private JButton btnCargar;
    private JTable tblLOL;
    private JScrollPane scrollPane;
    private GridLayout layout;
    //PANEL 3
    private JLabel imagenCampeon;

    //PANEL 4
    private JLabel lblActualizar;
    private JLabel lblSeleccionar;
    private JTextField txtSeleccionar;
    private JLabel lblIDN;
    private JTextField txtIDN ;
    private JLabel lblNombreN;
    private JTextField txtNombreN;
    private JLabel lblRolN;
    private JTextField txtRolN;
    private JLabel lblDificultadN;
    private JTextField txtDificultadN;
    private JLabel lblHabilidadN;
    private JTextField txtHabilidadN;
    private JLabel lblURLN;
    private JTextField txtURLN;
    private JButton btnActualizar;
    private JLabel lblEliminar;
    private JLabel lblEliminarId;
    private JTextField txtElminarId;
    private JButton btnEliminar;

    private JPanel pn1;
    private JPanel pn2;
    private JPanel pn3;
    private JPanel pn4;



    public Ventana(String title) throws HeadlessException {
        super(title);

        this.setSize(900,900);
        layout = new GridLayout(2,2);
        this.getContentPane().setLayout(layout);
        //PANEL 1
        pn1 = new JPanel(new FlowLayout());
        pn1.setBackground(new Color(47, 227, 42));
        this.getContentPane().add(pn1,0);

        lblID = new JLabel("ID");
        lblNombre = new JLabel("Nombre");
        lblRol = new JLabel("Rol");
        lblDificultad = new JLabel("Dificultad");
        lblHabilidad = new JLabel("Habilidad");
        lblURL = new JLabel("URL");

        txtID = new JTextField(3);
        txtID.setText("0");
        txtID.setEnabled(false);
        txtNombre = new JTextField(29);
        txtRol = new JTextField(15);
        txtDificultad = new JTextField(15);
        txtHabilidad = new JTextField(32);
        txtURL = new JTextField(12);

        btnAgregar = new JButton("Agregar");

        pn1.add(lblID);
        pn1.add(txtID);

        pn1.add(lblNombre);
        pn1.add(txtNombre);

        pn1.add(lblRol);
        pn1.add(txtRol);

        pn1.add(lblDificultad);
        pn1.add(txtDificultad);

        pn1.add(lblHabilidad);
        pn1.add(txtHabilidad);

        pn1.add(lblURL);
        pn1.add(txtURL);

        pn1.add(btnAgregar);

        //PANEL 2
        pn2 = new JPanel(new FlowLayout());
        pn2.setBackground(new Color(17, 139, 46));
        this.getContentPane().add(pn2,1);
        tblLOL = new JTable();
        scrollPane = new JScrollPane(tblLOL);
        pn2.add(scrollPane);
        btnCargar = new JButton("Cargar");
        pn2.add(btnCargar);

        //PANEL 3
        pn3 = new JPanel(new FlowLayout());
        pn3.setBackground(new Color(0, 80, 29));
        this.getContentPane().add(pn3,2);

        imagenCampeon = new JLabel("...");
        pn3.add(imagenCampeon);



        //PANEL 4
        pn4 = new JPanel(new FlowLayout());
        pn4.setBackground(new Color(238, 202, 3));

        lblActualizar= new JLabel("Actualizar registro");
        lblIDN=new JLabel("ID:");
        txtIDN=new JTextField(3);
        lblNombreN=new JLabel("Nombre: ");
        txtNombreN=new JTextField(15);
        lblRolN=new JLabel("Rol: ");
        txtRolN=new JTextField(15);
        lblDificultadN=new JLabel("Dificultad: ");
        txtDificultadN=new JTextField(10);
        lblHabilidadN=new JLabel("Habilidad: ");
        txtHabilidadN=new JTextField(15);
        lblURLN=new JLabel("URL");
        txtURLN=new JTextField(15);
        btnActualizar=new JButton("Actualizar");
        lblEliminar=new JLabel("                                                           Eliminar registro                                                  ");
        lblEliminarId=new JLabel("Id por eliminar");
        txtElminarId=new JTextField(3);
        btnEliminar=new JButton("Eliminar");

        pn4.add(lblActualizar,0);
        pn4.add(lblIDN,1);
        pn4.add(txtIDN,2);
        pn4.add(lblNombreN,3);
        pn4.add(txtNombreN,4);
        pn4.add(lblRolN,5);
        pn4.add(txtRolN,6);
        pn4.add(lblDificultadN,7);
        pn4.add(txtDificultadN,8);
        pn4.add(lblHabilidadN,9);
        pn4.add(txtHabilidadN,10);
        pn4.add(lblURLN,11);
        pn4.add(txtURLN,12);
        pn4.add(btnActualizar,13);
        pn4.add(lblEliminar,14);
        pn4.add(lblEliminarId,15);
        pn4.add(txtElminarId,16);
        pn4.add(btnEliminar);

        this.getContentPane().add(pn1,0);
        this.getContentPane().add(pn2,1);
        this.getContentPane().add(pn3,2);
        this.getContentPane().add(pn4,3);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public JLabel getLblIDN() {
        return lblIDN;
    }

    public void setLblIDN(JLabel lblIDN) {
        this.lblIDN = lblIDN;
    }

    public JTextField getTxtIDN() {
        return txtIDN;
    }

    public void setTxtIDN(JTextField txtIDN) {
        this.txtIDN = txtIDN;
    }

    public JLabel getLblNombreN() {
        return lblNombreN;
    }

    public void setLblNombreN(JLabel lblNombreN) {
        this.lblNombreN = lblNombreN;
    }

    public JTextField getTxtNombreN() {
        return txtNombreN;
    }

    public void setTxtNombreN(JTextField txtNombreN) {
        this.txtNombreN = txtNombreN;
    }

    public JLabel getLblRolN() {
        return lblRolN;
    }

    public void setLblRolN(JLabel lblRolN) {
        this.lblRolN = lblRolN;
    }

    public JTextField getTxtRolN() {
        return txtRolN;
    }

    public void setTxtRolN(JTextField txtRolN) {
        this.txtRolN = txtRolN;
    }

    public JLabel getLblDificultadN() {
        return lblDificultadN;
    }

    public void setLblDificultadN(JLabel lblDificultadN) {
        this.lblDificultadN = lblDificultadN;
    }

    public JTextField getTxtDificultadN() {
        return txtDificultadN;
    }

    public void setTxtDificultadN(JTextField txtDificultadN) {
        this.txtDificultadN = txtDificultadN;
    }

    public JLabel getLblHabilidadN() {
        return lblHabilidadN;
    }

    public void setLblHabilidadN(JLabel lblHabilidadN) {
        this.lblHabilidadN = lblHabilidadN;
    }

    public JTextField getTxtHabilidadN() {
        return txtHabilidadN;
    }

    public void setTxtHabilidadN(JTextField txtHabilidadN) {
        this.txtHabilidadN = txtHabilidadN;
    }

    public JLabel getLblURLN() {
        return lblURLN;
    }

    public void setLblURLN(JLabel lblURLN) {
        this.lblURLN = lblURLN;
    }

    public JTextField getTxtURLN() {
        return txtURLN;
    }

    public void setTxtURLN(JTextField txtURLN) {
        this.txtURLN = txtURLN;
    }

    public JLabel getImagenCampeon() {
        return imagenCampeon;
    }

    public void setImagenCampeon(JLabel imagenCampeon) {
        this.imagenCampeon = imagenCampeon;
    }

    public JLabel getLblActualizar() {
        return lblActualizar;
    }

    public void setLblActualizar(JLabel lblActualizar) {
        this.lblActualizar = lblActualizar;
    }

    public JLabel getLblSeleccionar() {
        return lblSeleccionar;
    }

    public void setLblSeleccionar(JLabel lblSeleccionar) {
        this.lblSeleccionar = lblSeleccionar;
    }

    public JTextField getTxtSeleccionar() {
        return txtSeleccionar;
    }

    public void setTxtSeleccionar(JTextField txtSeleccionar) {
        this.txtSeleccionar = txtSeleccionar;
    }

    public JButton getBtnActualizar() {
        return btnActualizar;
    }

    public void setBtnActualizar(JButton btnActualizar) {
        this.btnActualizar = btnActualizar;
    }

    public JLabel getLblEliminar() {
        return lblEliminar;
    }

    public void setLblEliminar(JLabel lblEliminar) {
        this.lblEliminar = lblEliminar;
    }

    public JLabel getLblEliminarId() {
        return lblEliminarId;
    }

    public void setLblEliminarId(JLabel lblEliminarId) {
        this.lblEliminarId = lblEliminarId;
    }

    public JTextField getTxtElminarId() {
        return txtElminarId;
    }

    public void setTxtElminarId(JTextField txtElminarId) {
        this.txtElminarId = txtElminarId;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public void setBtnEliminar(JButton btnEliminar) {
        this.btnEliminar = btnEliminar;
    }

    public JLabel getLblID() {
        return lblID;
    }

    public void setLblID(JLabel lblID) {
        this.lblID = lblID;
    }

    public JLabel getLblNombre() {
        return lblNombre;
    }

    public void setLblNombre(JLabel lblNombre) {
        this.lblNombre = lblNombre;
    }

    public JLabel getLblRol() {
        return lblRol;
    }

    public void setLblRol(JLabel lblRol) {
        this.lblRol = lblRol;
    }

    public JLabel getLblDificultad() {
        return lblDificultad;
    }

    public void setLblDificultad(JLabel lblDificultad) {
        this.lblDificultad = lblDificultad;
    }

    public JLabel getLblHabilidad() {
        return lblHabilidad;
    }

    public void setLblHabilidad(JLabel lblHabilidad) {
        this.lblHabilidad = lblHabilidad;
    }

    public JLabel getLblURL() {
        return lblURL;
    }

    public void setLblURL(JLabel lblURL) {
        this.lblURL = lblURL;
    }

    public JTextField getTxtID() {
        return txtID;
    }

    public void setTxtID(JTextField txtID) {
        this.txtID = txtID;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JTextField getTxtRol() {
        return txtRol;
    }

    public void setTxtRol(JTextField txtRol) {
        this.txtRol = txtRol;
    }

    public JTextField getTxtDificultad() {
        return txtDificultad;
    }

    public void setTxtDificultad(JTextField txtDificultad) {
        this.txtDificultad = txtDificultad;
    }

    public JTextField getTxtHabilidad() {
        return txtHabilidad;
    }

    public void setTxtHabilidad(JTextField txtHabilidad) {
        this.txtHabilidad = txtHabilidad;
    }

    public JTextField getTxtURL() {
        return txtURL;
    }

    public void setTxtURL(JTextField txtURL) {
        this.txtURL = txtURL;
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public void setBtnAgregar(JButton btnAgregar) {
        this.btnAgregar = btnAgregar;
    }

    public JButton getBtnCargar() {
        return btnCargar;
    }

    public void setBtnCargar(JButton btnCargar) {
        this.btnCargar = btnCargar;
    }

    public JTable getTblLOL() {
        return tblLOL;
    }

    public void setTblLOL(JTable tblLOL) {
        this.tblLOL = tblLOL;
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }

    public void setScrollPane(JScrollPane scrollPane) {
        this.scrollPane = scrollPane;
    }

    @Override
    public GridLayout getLayout() {
        return layout;
    }

    public void setLayout(GridLayout layout) {
        this.layout = layout;
    }

    public JPanel getPn1() {
        return pn1;
    }

    public void setPn1(JPanel pn1) {
        this.pn1 = pn1;
    }

    public JPanel getPn2() {
        return pn2;
    }

    public void setPn2(JPanel pn2) {
        this.pn2 = pn2;
    }

    public JPanel getPn3() {
        return pn3;
    }

    public void setPn3(JPanel pn3) {
        this.pn3 = pn3;
    }

    public JPanel getPn4() {
        return pn4;
    }

    public void setPn4(JPanel pn4) {
        this.pn4 = pn4;
    }

    public void limpiar(){
        txtNombre.setText(" ");
        txtRol.setText(" ");
        txtDificultad.setText(" ");
        txtHabilidad.setText(" ");
        txtURL.setText(" ");
    }
    public void limpiarPn4(){
        txtNombreN.setText("");
        txtRolN.setText("");
        txtDificultadN.setText("");
        txtHabilidadN.setText("");
        txtURLN.setText("");
        txtIDN.setText("");
        txtElminarId.setText("");
    }
}