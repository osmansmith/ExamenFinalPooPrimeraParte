package datos;


/**
 * Clase Piloto, Es el personal de cabina encargado de pilotear el avión.
 * 
 * @author (Osman Ahumada Villafaña) 
 * @version (1.0)
 */
public class Piloto extends PersonalDeCabina
{
    private int horasVuelo = 0;
    
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
            if(hora>=400)
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
      String msj = "\n\n***  Datos de Piloto ***\n\n"+
            "Rut : "+this.getRut()+
            "\nNombre : "+this.getNombre()+
            "\nApellido : "+this.getApellido()+
            "\nEdad : "+this.getEdad()+
            "\nNacionalidad : "+this.getNacionalidad()+
            "\nHoras de Vuelo : "+this.getHorasVuelo()+
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
        if (obj instanceof Piloto) 
        {
            Piloto personita = (Piloto) obj;
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
        if (obj instanceof Piloto && obj2 instanceof Piloto) 
        {
            Piloto personita = (Piloto) obj;
            Piloto personota = (Piloto) obj2;
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
