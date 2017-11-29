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
    protected int edad;
    
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
