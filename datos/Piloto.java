package datos;


/**
 * Clase Piloto, Es el personal de cabina encargado de pilotear el avión.
 * 
 * @author (Osman Ahumada Villafaña) 
 * @version (1.0)
 */
public class Piloto extends PersonalDeCabina
{
    private int horasVuelo = 400;
    
    public Piloto()
    {
        super();
    }
    public Piloto(String rut)
    {
        super(rut);
    }
    public Piloto(String rut, String nombre, String apellido, int edad, int horasVuelo)
    {
        super(rut,nombre,apellido,edad);
        this.horasVuelo = horasVuelo;
    }
    
    public void setHorasVuelo(int hora)
    {
     this.horasVuelo = hora;    
    }
    
    public int getHorasVuelo()
    {
        return(this.horasVuelo);
    }
    
    public boolean validaHora(int hora)
    {
        boolean flag = false;
        try
        {
            if(hora>0)
            {
                flag = true;
            }else
            {
                flag = false;
            }
        }
        catch(Exception x)
        {
            System.out.print("Error al validar hora de vuelo : "+x);
        }
        finally
        {
            return(flag);
        }
    
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
