/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    package ViaggioGrafica;

import java.awt.Container;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Grafica extends JFrame implements ActionListener
{
    private Container c = new Container();    
    private JPanel p1 = new JPanel();  
    private JLabel cognome = new JLabel("Cognome:");
    private JLabel nome = new JLabel("Nome:");
    private JLabel telefono = new JLabel("Telefono:");
    private JLabel cittaAppartenenza = new JLabel("Citta D'appartenenza:");
    private JLabel cittaDestinazione = new JLabel("Citta Destinazione:");
    private JLabel data = new JLabel("Data");
    private JLabel avviso = new JLabel("");
    private JTextField testoCognome = new JTextField();     
    private JTextField testoNome = new JTextField();
    private JTextField testoTelefono = new JTextField();
    private JTextField testoCittaAppartenenza = new JTextField();
    private JTextField testoCittaDestinazione = new JTextField();
    private JTextField testoData = new JTextField();
    private JButton bottoneConferma = new JButton("Conferma");
    private JButton bottoneAnnulla = new JButton("Annulla");
    private JButton bottoneApriFile = new JButton("File");
       Prenotazione pre = new Prenotazione();
    
    public Grafica() 
    {
        c = this.getContentPane();
        p1.setLayout(null);
        this.setTitle("Viaggio");                              //Imposta il titolo alla finestra.
        this.setVisible(true);                                  //Imposta la finestra visibile.
        this.setLocationRelativeTo(null);                       //Imposta la finestra al centro dello schermo
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //Imposta la chiusura della finestra
        this.setSize(300, 300);                                 //Imposta la grandezza del Frame(la finestra)
        this.setResizable(false);      
        
        int x = 100;
        cognome.setBounds(10, 5, 140, 50);
        testoCognome.setBounds(80, 22, x, 20);
        nome.setBounds(30, 30, 140, 50);
        testoNome.setBounds(80, 46, x, 20);
        telefono.setBounds(10, 62, 140, 50);
        testoTelefono.setBounds(80, 78, x, 20);
        cittaDestinazione.setBounds(10, 94, 140, 50);
        testoCittaDestinazione.setBounds(142, 110, x, 20);
        cittaAppartenenza.setBounds(10, 126, 140, 50);
        testoCittaAppartenenza.setBounds(142, 140, x, 20);
        data.setBounds(10, 156, 140, 50);
        testoData.setBounds(40, 172, x, 20);
        avviso.setBounds(105, 195, 90, 20);
        bottoneConferma.setBounds(10, 220, 90, 20);
        bottoneAnnulla.setBounds(100, 220, 90, 20);
        bottoneApriFile.setBounds(190, 220, 90, 20);
        
        p1.add(cognome);
        p1.add(testoCognome);
        p1.add(nome);
        p1.add(testoNome);
        p1.add(telefono);
        p1.add(testoTelefono);
        p1.add(cittaDestinazione);
        p1.add(testoCittaDestinazione);
        p1.add(cittaAppartenenza);
        p1.add(testoCittaAppartenenza);
        p1.add(data);
        p1.add(testoData);
        p1.add(avviso);
        p1.add(bottoneConferma);
        p1.add(bottoneAnnulla);
        p1.add(bottoneApriFile);
        c.add(p1);
        
        bottoneConferma.addActionListener(this);
        bottoneAnnulla.addActionListener(this);
        bottoneApriFile.addActionListener(this); 
    }
 
    public void Scrivi(String s) throws IOException
    {
        FileWriter w;
        BufferedWriter b;
        
        w = new FileWriter("scrittura.txt");
        b = new BufferedWriter(w);

        b.write(s);
        b.flush();
        b.close();
    }  
    
    public void ApriFile()
    {
        try  
        {  

        File file = new File("C:\\Users\\HP\\Desktop\\Nuovo PC\\Chiavetta\\Scuola\\Informatica\\Java\\ProgViaggioGrafica\\scrittura.txt"); 
        
        if(!Desktop.isDesktopSupported())
        {  
            System.out.println("not supported");  
            return;  
        }  
        
        Desktop desktop = Desktop.getDesktop();  
            if(file.exists())          
                desktop.open(file);             
        }  
        catch(Exception e)  
        {  
            e.printStackTrace();  
        }  
    }
    
    public String Stampa()
    {
        String s = "";

        for(int i = 0; i < pre.getSize(); i++)
             s += pre.getElemento(i);
        
        return s;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        String evento = e.getActionCommand();
        String cognome;
         String nome;
         String telefono;
         String cittaAppartenenza;
         String cittaDestinazione;
         String data;
         String s = "";
         
        
        switch(evento)
        {
            case "Conferma":
                cognome = testoCognome.getText();
                nome = testoNome.getText();
                telefono = testoTelefono.getText();
                cittaAppartenenza = testoCittaAppartenenza.getText();
                cittaDestinazione = testoCittaDestinazione.getText();
                data = testoData.getText();
                InformazioniUtente info = new InformazioniUtente(cognome, nome, telefono, cittaAppartenenza, cittaDestinazione, data);
                pre.AggiunguInformazioni(info);
                testoCognome.setText("");
                testoNome.setText("");
                testoTelefono.setText("");
                testoCittaAppartenenza.setText("");
                testoCittaDestinazione.setText("");
                testoData.setText("");
                
               for(int i = 0; i < pre.getSize(); i++)
                System.out.println(s += pre.getElemento(i).toString());
               
               FrameStampa Fs = new FrameStampa(Stampa());
            {
                try 
                {
                    Scrivi(Stampa());
                } catch (IOException ex) 
                {
                    Logger.getLogger(Grafica.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
               
                break;

                
            case "Annulla":
                testoCognome.setText("");
                testoNome.setText("");
                testoTelefono.setText("");
                testoCittaAppartenenza.setText("");
                testoCittaDestinazione.setText("");
                testoData.setText("");
                avviso.setText("Dati Cancellati");
                break;
            
            case "File":
                ApriFile();
                break;
        }
    }
}
