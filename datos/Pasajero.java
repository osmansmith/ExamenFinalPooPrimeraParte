package datos;


/**
 * Clase Pasajero es la persona que compra un pasaje de vuelo.
 * 
 * @author (Osman Ahumada) 
 * @version (1.0)
 */
public class Pasajero extends Persona
{
    private Pasaje pasaje;
    
    public Pasajero()
    {
        super();
    }
    public Pasajero(String rut)
    {
        super(rut);
    }
     public Pasajero(String rut, String nombre, String apellido, int edad, Pasaje pasaje)
    {
        super(rut,nombre,apellido,edad);
        this.pasaje = pasaje;
    }
    
    public void setPasaje(Pasaje pass)
    {
        this.pasaje = pass;
    }
    
    public Pasaje getPasaje()
    {
        return(this.pasaje);
    }   
    
    /**
     * Metodos de utilidad 
     */
    
    public String toString()
    {
      String msj = "\n\n***  Datos del Pasajero ***\n\n"+
            "Rut : "+this.getRut()+
            "\nNombre : "+this.getNombre()+
            "\nApellido : "+this.getApellido()+
            "\nEdad : "+this.getEdad()+
            "\n\n*** Datos del pasaje ***\n\n"+
            "\nNumero de Vuelo : "+this.getPasaje().getNumeroVuelo()+
            "\nFecha : "+this.getPasaje().getFecha()+
            "\nHora : "+this.getPasaje().getHora()+
            "\nOrigen : "+this.getPasaje().getOrigen()+
            "\nDestino : "+this.getPasaje().getDestino()+
            "\nClase : "+this.getPasaje().getClase()+
            "\nValor : "+this.getPasaje().getValor()+
            "\n\n***************\n\n";
         return(msj);
    }
    public String toString(String rut)
    {
     return(""+rut);
    }
    
    public void print(String palabra)
    {
      System.out.print(palabra);
    }
    
    public boolean equals (Object obj) {
        if (obj instanceof Pasajero) 
        {
            Pasajero personita = (Pasajero) obj;
            if (super.equals(personita)) 
            {
                return true; 
            } 
            else 
            { 
               return false; 
            }
        }  
        else 
        { 
            return false; 
        }
    }
    public boolean equals (Object obj, Object obj2) {
        if (obj instanceof Pasajero && obj2 instanceof Pasajero) 
        {
            Pasajero personita = (Pasajero) obj;
            Pasajero personota = (Pasajero) obj2;
            if (personota.equals(personita)) 
            {
                return true; 
            } 
            else 
            { 
               return false; 
            }
        }  
        else 
        { 
            return false; 
        }
    }
    
}
