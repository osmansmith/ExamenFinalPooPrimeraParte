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
    private String idioma = "Inglés";
    
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
    public void setIdioma(String idioma)
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
     String msj = "\n\n***  Datos de Azafate ***\n\n"+
            "Rut : "+this.getRut()+
            "\nNombre : "+this.getNombre()+
            "\nApellido : "+this.getApellido()+
            "\nEdad : "+this.getEdad()+
            "\nNacionalidad : "+this.getNacionalidad()+
            "\nIdiomas : "+this.getIdioma()+
            "\n\n***************\n\n";
         return(msj);
    }
    public String toString(String rut)
    {
     return("El Rut es : "+this.getRut());
    }
    
    public void imprimir(String palabra)
    {
      System.out.print(palabra);
    }
    
    public boolean equals (Object obj) {
        if (obj instanceof Azafate) 
        {
            Azafate personita = (Azafate) obj;
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
        if (obj instanceof Azafate && obj2 instanceof Azafate) 
        {
            Azafate personita = (Azafate) obj;
            Azafate personota = (Azafate) obj2;
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
