package datos;


/**
 * Clase PersonalDeCabina que correspone de todos los tripulantes.
 * 
 * @author (Osman Ahumada) 
 * @version (1.0)
 */
public abstract class PersonalDeCabina extends Persona
{
    private String nacionalidad;
    
    public PersonalDeCabina()
    {
        super();
    }
    public PersonalDeCabina(String rut){
        super(rut);
    }
    public PersonalDeCabina(String rut, String nombre, String apellido, int edad)
    {
        super(rut,nombre,apellido,edad);
    }

    public void setNacionalidad(String nac)
    {
        this.nacionalidad = nac;
    }
    
    public String getNacionalidad()
    {
        return(this.nacionalidad);
    }
    
   
   /**
     * Metodos de utilidad 
     */
    
    public abstract String toString();
    public abstract String toString(String rut);
    
    public void imprimir(String palabra)
    {
      System.out.println(palabra);
    }
    
    public boolean equals (Object obj) {
        if (obj instanceof Persona) 
        {
            PersonalDeCabina personita = (PersonalDeCabina) obj;
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
        if (obj instanceof PersonalDeCabina && obj2 instanceof PersonalDeCabina) 
        {
            PersonalDeCabina personita = (PersonalDeCabina) obj;
            PersonalDeCabina personota = (PersonalDeCabina) obj2;
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
