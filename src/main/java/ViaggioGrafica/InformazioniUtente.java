
package ViaggioGrafica;


public class InformazioniUtente
{
    private String cognome;
    private String nome;
    private String telefono;
    private String cittaAppartenenza;
    private String cittaDestinazione;
    private String data;

    public InformazioniUtente(String cognome, String nome, String telefono, String cittaAppartenenza, String cittaDestinazione, String data) 
   {
        this.cognome = cognome;
        this.nome = nome;
        this.telefono = telefono;
        this.cittaAppartenenza = cittaAppartenenza;
        this.cittaDestinazione = cittaDestinazione;
        this.data = data;
    }

      public String toString()
    {
        String s = "\n" + "Cognome: " + cognome + "\n" + " Nome: " + nome +  "\n" + " Numero Di Telefono: " + telefono +  "\n" + " Citta Appartenenza: " + cittaAppartenenza +  "\n" + " Citta destinazione: " + cittaDestinazione +  "\n" + " Data: " + data;
        return s;
    }
      
    public String getCognome() 
    {
        return cognome;
    }

    public void setCognome(String cognome)
    {
        this.cognome = cognome;
    }

    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getTelefono()
    {
        return telefono;
    }

    public void setTelefono(String telefono) 
    {
        this.telefono = telefono;
    }

    public String getCittaAppartenenza()
    {
        return cittaAppartenenza;
    }

    public void setCittaAppartenenza(String cittaAppartenenza)
    {
        this.cittaAppartenenza = cittaAppartenenza;
    }

    public String getCittaDestinazione()
    {
        return cittaDestinazione;
    }

    public void setCittaDestinazione(String cittaDestinazione) 
    {
        this.cittaDestinazione = cittaDestinazione;
    }

    public String getData()
    {
        return data;
    }

    public void setData(String data)
    {
        this.data = data;
    }
    
    
    
}
