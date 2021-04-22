package ViaggioGrafica;

import java.util.ArrayList;

public class Prenotazione 
{
    ArrayList<InformazioniUtente> contenitoreutenti = new ArrayList<InformazioniUtente>();
    
    public void AggiunguInformazioni(InformazioniUtente x)
    {
        contenitoreutenti.add(x);
    }
    
  public InformazioniUtente getElemento(int i)
  {
      return contenitoreutenti.get(i);
  }
    
    public int getSize()
    {
        return contenitoreutenti.size();
    }
}
