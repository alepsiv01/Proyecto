package org.example.Vista;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
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
    private JButton btnCargar;
    private JTable tblLOL;
    private JScrollPane scrollPane;
    private GridLayout layout;
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
        txtURL = new JTextField(2048);

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
        //PANEL 4
        pn4 = new JPanel(new FlowLayout());
        pn4.setBackground(new Color(0,0,0));
        this.getContentPane().add(pn4,3);



        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
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
}
