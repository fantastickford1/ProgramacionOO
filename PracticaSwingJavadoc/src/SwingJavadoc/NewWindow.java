package SwingJavadoc;

import javax.swing.*; //importacion de Swing
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Esta Clase tiene los medios necesario para crear una ventana
 * @author Carlos Alejandro Zenteno Robles
 */
public class NewWindow extends JFrame implements ActionListener{
    /**
     * creacion de objetos para la estructura de la ventana
     */
    private JButton nwWindow; //boton
    private JLabel title; //titulo
    private JCheckBox check; //check box
    private JLabel shi; //texto
    private JLabel datos; //texto
    
    /**
     * <b>Constructor</b> que crea una ventana con todo lo que contiene
     */
    public NewWindow(){
        super("Window");
        /**
         * Objetos creados de JFrame
         */
        nwWindow = new JButton("Botn");
        title = new JLabel("HOLI :3");
        shi = new JLabel("FreeStyle");
        datos = new JLabel("Carlos Alejandro Zenteno Robles");
        check = new JCheckBox("Check :D");
        Container pane = getContentPane();
        
        /**
         * se adiren los objetos a un paneles
         */
        nwWindow.setPreferredSize(new Dimension(20, 30));
        pane.add(nwWindow,BorderLayout.CENTER);
        pane.add(title,BorderLayout.NORTH);
        pane.add(shi,BorderLayout.WEST);
        pane.add(check,BorderLayout.EAST);
        pane.add(datos,BorderLayout.SOUTH);
        
        
        nwWindow.addActionListener(this);
        /**
         * set up the window
         */
        setLocation(300,300);
        setSize(500,350);
        setVisible(true);
        
    }
    /**
     * Metodo que abre otra ventana principal
     * @param e de tipo ActionEvent
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == nwWindow){
        new NewWindow();
        }
        
    }
    
}
