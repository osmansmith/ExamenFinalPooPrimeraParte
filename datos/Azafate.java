package datos;


/**
 * Clase Azafate, Corresponde a las personas que atienden 
 * y auxilian a los pasajeros del avión, los que son personal de cabina.
 * 
 * @author (Osman Ahumada Villafaña) 
 * @version (1.0)
 */
public class Azafate extends PersonalDeCabina
{
    /**
     * atributos
     */
    private String idioma;
    
    /**
     * constructores
     */
    public Azafate()
    {
        super();
    }  
    public Azafate(String rut)
    {
        super(rut);
    }
    public Azafate(String rut, String nombre, String apellido, int edad, String idioma)
    {
        super(rut,nombre,apellido,edad);
        this.idioma = idioma;
    }
    
    /**
     * Setters
     */
    public void setIdioma()
    {
        this.idioma = idioma;
    }
    
    /**
     * getters
     */
    public String getIdioma()
    {
        return(this.idioma);
    }
    
    /**
     * Validaciones
     */
    
    public void validaIdioma()
    {
    
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
