package datos;


/**
 * Clase Pasaje, servira a los pasajero en su viaje.
 * 
 * @author (Osman Ahumada Villafaña) 
 * @version (1.0)
 */
public class Pasaje
{
    private int numeroVuelo = 0;
    private String fecha;
    private String hora;
    private String origen;
    private String destino;
    private String clase;
    private int valor;
    
    public Pasaje()
    {
      
    }
     public Pasaje(int numeroVuelo)
    {
        this.numeroVuelo = numeroVuelo;
    }
    public Pasaje(int numeroVuelo,String fecha, String hora, String origen, String destino, String clase, int valor)
    {
        this.numeroVuelo = numeroVuelo;
        this.fecha = fecha;
        this.hora = hora;
        this.origen = origen;
        this.destino = destino;
        this.clase = clase;
        this.valor = valor;       
    }
    
    public void setNumeroVuelo(int num)
    {
        this.numeroVuelo = num;
    }
    public void setFecha(String fecha)
    {
        this.fecha = fecha;
    }
    public void setHora(String hora)
    {
        this.hora = hora;
    }
    public void setOrigen(String origen)
    {
        this.origen = origen;
    }
    public void setDestino(String destino)
    {
        this.destino = destino;
    }
    public void setClase(String clase)
    {
        this.clase = clase;
    }
    public void setValor(int valor)
    {
        this.valor = valor;
    }
    
    
    public int getNumeroVuelo()
    {
        return(this.numeroVuelo);
    }
    public String getFecha()
    {
        return(this.fecha);
    }
    public String getHora()
    {
        return(this.hora);
    }
    public String getOrigen()
    {
        return(this.origen);
    }
    public String getDestino()
    {
        return(this.destino);
    }
    public String getClase()
    {
        return(this.clase);
    }
    public int getValor()
    {
        return(this.valor);
    }
    
    /**
     * Validaciones 
     */
    public boolean validaNvuelo(int vuelo)
    {
        boolean flag = false;
        try
        {
            if(vuelo>0)
            {
                flag = true;                
            }else
            {
                flag = false;
            }
        }
        catch(Exception x)
        {
            System.out.print("Error al validar numero de vuelo : "+x);
        }
        finally
        {
            return(flag);
        }
    }
    public boolean validaFecha(String date)
    {
         boolean flag = false;
        try
        {
            if(date.length()>0)
            {
                flag=true;
            }else
            {
                flag=false;
            }
        }
        catch(Exception x)
        {
            System.out.print("Error al validar fecha : "+x);
        }
        finally
        {
            return(flag);
        }
    }
    public boolean validaHora(String hour)
    {
         boolean flag = false;
        try
        {
            if(hour.length()>0)
            {
                flag = true;
            }else
            {
                flag = false;
            }
        }
        catch(Exception x)
        {
            System.out.print("Error al validar la hora : "+x);
        }
        finally
        {
            return(flag);
        }
    }
    public boolean validaOrigen(String origin)
    {
         boolean flag = false;
        try
        {
            if(origin.length()>0)
            {
                flag = true;
            }else
            {
                flag = false;
            }
        }
        catch(Exception x)
        {
            System.out.print("Error al validar origen : "+x);
        }
        finally
        {
            return(flag);
        }
    }
    public boolean validaDestino(String destiny)
    {
         boolean flag = false;
        try
        {
            if(destiny.length()>0 && destiny != this.origen)
            {
                flag = true;
            }else
            {
                flag = false;
            }
        }
        catch(Exception x)
        {
            System.out.print("Error al validar destino : "+x);
        }
        finally
        {
            return(flag);
        }
    }
    public boolean validaClase(String classs)
    {
         boolean flag = false;
        try
        {
            if(classs.length()>0)
            {
                flag = true;
            }else
            {
                flag = false;
            }
        }
        catch(Exception x)
        {
            System.out.print("Error al validar clase : "+x);
        }
        finally
        {
            return(flag);
        }
    }
    public boolean validaValor(int value)
    {
         boolean flag = false;
        try
        {
            if(value>0)
            {
                flag = true;
            }else
            {
                flag = false;
            }
        }
        catch(Exception x)
        {
            System.out.print("Error al validar el valor : "+x);
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
        if (obj instanceof Pasaje) 
        {
            Pasaje personita = (Pasaje) obj;
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
        if (obj instanceof Pasaje && obj2 instanceof Pasaje) 
        {
            Pasaje personita = (Pasaje) obj;
            Pasaje personota = (Pasaje) obj2;
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
