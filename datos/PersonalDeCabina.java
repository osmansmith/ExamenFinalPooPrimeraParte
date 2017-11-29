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

    public void setNaciondalidad(String nac)
    {
        this.nacionalidad = nac;
    }
    
    public String getNacionalidad()
    {
        return(this.nacionalidad);
    }
    
    public boolean validaRut(String val)
    {
        boolean flag = false;
        try
        {                        
            if(val.length() > 0 && val.length() < 14)
            {
                this.setRut(val);
                flag = true;
            }else{
                flag = false;
            }
        }
        catch(Exception ex)
        {
            System.out.print("Error al validar el Rut : "+ex);
        }
        finally{
         return(flag);
        }    
    }
    public boolean validaEdad(int edad)
    {
        boolean flag = false;
        try
        {                        
            if(edad > 0 && edad < 22)
            {
                this.setEdad(edad);
                flag = true;
            }else{
                flag = false;
            }
        }
        catch(Exception ex)
        {
            System.out.print("Error al validar la edad : "+ex);
        }
        finally{
         return(flag);
        }    
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
