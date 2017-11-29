
/**
 * Clase test, sirve para probar el funcionamiento optimo de la api(package) datos .
 * 
 * @author (Osman Ahumada) 
 * @version (1.0)
 */
import datos.*;
import java.util.Scanner;
public class test
{
    
    public test()
    {
    
    }
    public static void main(String[] args)
    {
        Azafate aeromosa = new Azafate();
        Piloto  fox = new Piloto();
        Pasajero turista = new Pasajero();
        Pasaje boleto = new Pasaje();
       
        
        int opc = 5;
        try
        {
            while(opc>0)
            {
                Scanner teclado = new Scanner(System.in);
                System.out.println("\u000C");
                System.out.println("******************");
                System.out.println("**   JAVAONE    **");
                System.out.println("******************");
                System.out.println("**              **");
                System.out.println("**  1) Azafate  **");
                System.out.println("**  2) Piloto   **");
                System.out.println("**  3) Pasajero **");
                System.out.println("**              **");
                System.out.println("******************");
                System.out.println("");
                System.out.print(" Escriba una opción : ");
                opc = teclado.nextInt();
                
                switch(opc)
                {
                  case 1:
                     
                  break;
                  case 2:
                  break;
                  case 3:
                  break;
                  case 0:
                  break;
                  default:
                   
                    System.out.println("Respuesta incorrecta, intente nuevamente");                    
                    opc = 5;
                    Thread.sleep(2000);
                  break;
                
                }
                
                
            }
        }
        catch(Exception ex)
        {
            
                    System.out.println("Error en el menu :"+ex);
                    
           
        }         
        
    }

    
}
