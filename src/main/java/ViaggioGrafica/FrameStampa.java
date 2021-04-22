package ViaggioGrafica;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class FrameStampa extends JFrame
{
    private JLabel risultato = new JLabel();
    public JLabel avviso = new JLabel("Lista Prenotazioni Viaggio:");
    
    public FrameStampa(String s)
    {
                this.setVisible(true);
                this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
                this.setSize(300, 300);
                this.setLocationRelativeTo(null);
                this.add(risultato);
                risultato.setBounds(90, 70, 400, 500);
                risultato.setText(s);
    }
}