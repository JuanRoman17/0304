/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.DignidadControl;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Juan Diego Roman
 */
public class VentanaDignidad extends JFrame {

    private DignidadControl dignidadControl;
    private List<JPanel> jPanelList;
    private List<JButton> jButtonList;
    private List<JTextField> jTextFieldList;
    private List<JLabel> jLabelList;

    public VentanaDignidad() {
        this.setSize(400, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void iniciarComponentes() {
        this.dignidadControl = new DignidadControl();
        this.jPanelList = new ArrayList<>();
        this.jTextFieldList = new ArrayList<>();
        this.jButtonList = new ArrayList<>();
        
        this.jButtonList.add(new JButton("Guardar"));
        this.jButtonList.add(new JButton("Listar"));
        
        this.jTextFieldList.add(new JTextField("",5));

    }
}
