package datos;

/**
 * Abstract class Persona - Clase padre
 * 
 * @author: Osman Ahumada Villafaña
 * Date: versión 1.0
 */
public abstract class Persona
{
    /**
     * atributos minimos
     */
    protected String rut;
    protected String nombre;
    protected String apellido;
    protected int edad = 0;
    
    /**
     * Constructores sobrecargados
     */
    public Persona(){}
    public Persona(String rut)
    {
        this.rut = rut;
    }
    public Persona(String rut, String nombre, String apellido, int edad)
    {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    /**
     * Setters
     */
    public void setRut(String rut)
    {
        this.rut = rut;
    }
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    public void setApellido(String apellido)
    {
        this.apellido = apellido;
    }
    public void setEdad(int edad)
    {
        this.edad = edad;
    }
    
    /**
     * Getters
     */
    public String getRut()
    {
        return(this.rut);
    }
    public String getNombre()
    {
        return(this.nombre);
    }
    public String getApellido()
    {
        return(this.apellido);
    }
    public int getEdad()
    {
        return(this.edad);
    }
    
    /**
     * Validaciones
     */
    
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
            if(edad >= 21)
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
