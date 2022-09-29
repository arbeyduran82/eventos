
package eventosfinal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class EventosFinal {
     public static void main(String[] args) {
        Textos jFrame1=new Textos();
        jFrame1.setTitle("EVENTOS Y LEY DE SIGNOS");
        jFrame1.setBounds(600, 300, 700, 400);
        jFrame1.setVisible(true);
        jFrame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
      
    }
}

class Textos extends JFrame implements ActionListener {
    private final JLabel label1, label2, label3 ;
    private final JTextField textfield1;
    private final JButton boton1;
    
    public Textos(){
        setLayout(null);
        label1=new JLabel("BIENVENIDO A QUIEN QUIERE SER MILLONARIO.");
        label1.setBounds(200,10,300,30);
        add(label1);
        
        label2=new JLabel("Reto No 1.");
        label2.setBounds(30,40,300,30);
        add(label2);
        
        label3=new JLabel("Si al realizar una suma, X vale 7 cuanto debe valer Y para que el resultado sea -16.");
        label3.setBounds(30,60,500,30);
        add(label3);
        
        textfield1=new JTextField();
        textfield1.setBounds(30,100,100,30);
        add(textfield1);
        
        boton1=new JButton("Validar");
        boton1.setBounds(35,250,100,30);
        add(boton1);
        boton1.addActionListener(this);
         
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==boton1) {
            int dato1= Integer.parseInt(textfield1.getText());
            int $suma = (7 + (dato1));
            if($suma !=-16){
                JOptionPane.showMessageDialog(null,"Error, Siguelo intentando");
            } else {
                JOptionPane.showMessageDialog(null,"el resultado es \n" + $suma + "Su solucion es correcta!");
            }
            
        }
        
    }
      
}
