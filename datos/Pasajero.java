package datos;


/**
 * Clase Pasajero es la persona que compra un pasaje de vuelo.
 * 
 * @author (Osman Ahumada) 
 * @version (1.0)
 */
public class Pasajero extends PersonalDeCabina
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
     return("");
    }
    public String toString(String rut)
    {
     return(""+rut);
    }
    
    public void imprimir(String palabra)
    {
      System.out.println(palabra);
    }
    
    public boolean equals (Object obj) {
        if (obj instanceof Persona) 
        {
            Persona personita = (Persona) obj;
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
        if (obj instanceof Persona && obj2 instanceof Persona) 
        {
            Persona personita = (Persona) obj;
            Persona personota = (Persona) obj2;
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
