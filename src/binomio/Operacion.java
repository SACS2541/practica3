package binomio;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class Operacion implements ActionListener{
    
    JFrame ventana;
    
    JTextField a, b;
    
    JButton resultado;
    
    JLabel variableA, variableB;
    
    Container cont;
    
    public Operacion(){
        ventana = new JFrame("Binomio cuadrado");
        ventana.setSize(400, 500);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(null);
        ventana.setResizable(false);
        
        cont = ventana.getContentPane();
        cont.setBackground(Color.white);
        Componentes();
        
        ventana.setVisible(true);
    }
    
    public void Componentes(){
        variableA = new JLabel("Variable a");
        variableA.setBounds(100, 100, 100, 40);
        cont.add(variableA);
        
        a = new JTextField("");
        a.setBounds(200, 100, 100, 40);
        cont.add(a);
        
        variableB = new JLabel("Variable b");
        variableB.setBounds(100, 200, 100, 40);
        cont.add(variableB);
        
        b = new JTextField("");
        b.setBounds(200, 200, 100, 40);
        cont.add(b);
        
        resultado = new JButton("Resultado");
        resultado.setBounds(200, 300, 100, 50);
        resultado.addActionListener(this);
        cont.add(resultado);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == resultado){
            double vA = Double.valueOf(a.getText());
            double vB = Double.valueOf(b.getText());
            
            double CuadradoPrimero = vA * vA;
            double DoblePrimeroSegundo = 2 * (vA * vB);
            double CuadradoSegundo = vB * vB;
            double Total = CuadradoPrimero + DoblePrimeroSegundo + CuadradoSegundo;
            JOptionPane.showMessageDialog(null, "El resultado es: \n" + vA + "^2 + " + "2(" + vB + ")(" + vA + ") + " + vB + "^2 = \n"
                + CuadradoPrimero + " + " + DoblePrimeroSegundo + " + " + CuadradoSegundo + " = \n" + Total);
        }
    }
    
}