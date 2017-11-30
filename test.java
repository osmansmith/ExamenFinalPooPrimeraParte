
/**
 * Clase test, sirve para probar el funcionamiento optimo de la api(package) datos .
 * 
 * @author (Osman Ahumada) 
 * @version (1.0)
 */
import datos.*;
import java.util.Scanner;
//import java.util.InputMismatchException;
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
        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);
        Scanner teclado3 = new Scanner(System.in);
        int opc = 5;
        try
        {
            
            while(opc>0)
            {
                
                System.out.println("\u000C");
                System.out.println("******************");
                System.out.println("**   JAVAONE    **");
                System.out.println("******************");
                System.out.println("**              **");
                System.out.println("** [1] Azafate  **");
                System.out.println("** [2] Piloto   **");
                System.out.println("** [3] Pasajero **");
                System.out.println("** [0] Salir    **");
                System.out.println("**              **");
                System.out.println("******************");
                System.out.println("");
                System.out.print(" Escriba una opción : ");
                opc = teclado.nextInt();
                
                switch(opc)
                {
                  case 1:
                     aeromosa.imprimir("\nDatos de Azafate : ");
                     String rut = "";
                     int edad = 0;
                     while(aeromosa.getRut() == null)
                     {
                         
                         if(aeromosa.validaRut(rut))
                         {
                            aeromosa.setRut(rut);
                         }else
                         {
                            aeromosa.imprimir("\n\nIngrese Rut (13 caracteres max): ");
                            rut = teclado.next();
                         }
                         
                     }
                     if(aeromosa.getNombre() == null)
                     {
                         aeromosa.imprimir("Ingrese Nombre : ");
                         aeromosa.setNombre(teclado.next());
                     }
                     if(aeromosa.getApellido() == null)
                     {
                         aeromosa.imprimir("Ingrese Apellido : ");
                         aeromosa.setApellido(teclado.next()); 
                     }

                                           
                     while(aeromosa.getEdad() == 0)
                     {
                         
                         if(aeromosa.validaEdad(edad))
                         {
                            aeromosa.setEdad(edad);
                         }else
                         {
                            aeromosa.imprimir("Ingrese Edad (21 años min): ");
                            edad = teclado.nextInt();
                         }
                         
                     }
                     if(aeromosa.getNacionalidad() == null)
                     {
                         aeromosa.imprimir("Ingrese Nacionalidad : ");
                         aeromosa.setNacionalidad(teclado.next()); 
                     }
                     aeromosa.imprimir("Maneja el idioma "+aeromosa.getIdioma()+" ?, (si = 1/no = 2) : ");
                     int res = teclado.nextInt();
                     if(res == 1)
                     {
                        
                     }else
                     {
                         aeromosa.setIdioma("");
                     }
                     aeromosa.imprimir("Ingresar idioma : ");
                     String res2 = teclado.next();
                     if(res == 1)
                     {
                        aeromosa.setIdioma(aeromosa.getIdioma()+" , "+res2);
                     }else
                     {
                        aeromosa.setIdioma(res2);
                     }
                     
                                          
                     
                     aeromosa.imprimir(aeromosa.toString());
                     aeromosa.imprimir("Volviendo al menú en ");
                     for(int i=1; i<4 ; i++)
                     {
                        aeromosa.imprimir("..."+i);
                        Thread.sleep(3000);
                     }
                     
                  break;
                  case 2:
                  
                     fox.print("\nDatos de Piloto : ");
                     String rut2 = "";
                     int edad2 = 0;
                     int hora = 0;
                     
                     while(fox.getRut() == null)
                     {
                         
                         if(fox.validaRut(rut2))
                         {
                            fox.setRut(rut2);
                         }else
                         {
                            fox.print("\nIngrese Rut (13 caracteres max): ");
                            rut2 = teclado2.next();
                         }
                         
                     }
                     if(fox.getNombre() == null)
                     {
                         fox.print("Ingrese Nombre : ");
                         fox.setNombre(teclado2.next());
                     }
                     if(fox.getApellido() == null)
                     {
                         fox.print("Ingrese Apellido : ");
                         fox.setApellido(teclado2.next()); 
                     }

                                           
                     while(fox.getEdad() == 0)
                     {
                         
                         if(fox.validaEdad(edad2))
                         {
                            fox.setEdad(edad2);
                         }else
                         {
                            fox.print("Ingrese Edad (21 años min): ");
                            edad2 = teclado2.nextInt();
                         }
                         
                     }
                     if(fox.getNacionalidad() == null)
                     {
                         fox.print("Ingrese Nacionalidad : ");
                         fox.setNacionalidad(teclado2.next()); 
                     }                                                                     
                     
                     while(fox.getHorasVuelo() == 0)
                     {
                         
                         if(fox.validaHora(hora))
                         {
                            fox.setHorasVuelo(hora);
                         }else
                         {
                            fox.print("Ingrese Horas de Vuelo (min 400 hr): ");
                            hora = teclado2.nextInt();
                         }
                         
                     }
                                                                                    
                     fox.print(fox.toString());
                     fox.print("Volviendo al menú en ");
                     for(int i=1; i<4 ; i++)
                     {
                        fox.print("..."+i);
                        Thread.sleep(3000);
                     }
                  break;
                  case 3:
                    turista.print("\nDatos de Pasajero : ");
                     String rut3 = "";
                     int edad3 = 0;
                     int num = 0;
                     int hora2 = 0; 
                     String horas = "";
                     String fecha = "";
                     String origen = "";
                     String destino = "";
                     String clase = "";
                     int valor = 0;
                     while(turista.getRut() == null)
                     {
                         
                         if(turista.validaRut(rut3))
                         {
                            turista.setRut(rut3);
                         }else
                         {
                            turista.print("\nIngrese Rut (13 caracteres max): ");
                            rut3 = teclado3.next();
                         }
                         
                     }
                     if(turista.getNombre() == null)
                     {
                         turista.print("Ingrese Nombre : ");
                         turista.setNombre(teclado3.next());
                     }
                     if(turista.getApellido() == null)
                     {
                         turista.print("Ingrese Apellido : ");
                         turista.setApellido(teclado3.next()); 
                     }

                                           
                     while(turista.getEdad() == 0)
                     {
                         
                         if(turista.validaEdad(edad3))
                         {
                            turista.setEdad(edad3);
                         }else
                         {
                            turista.print("Ingrese Edad (21 años min): ");
                            edad3 = teclado3.nextInt();
                         }
                         
                     }                                                                                         
                     turista.print("\n\nDatos del pasaje\n\n : ");
                     
                     while(boleto.getNumeroVuelo() == 0)
                     {
                        if(boleto.validaNvuelo(num))
                        {
                            boleto.setNumeroVuelo(num);
                        }else{
                            turista.print("Numero de Vuelo : ");
                            num = teclado3.nextInt();
                        }
                     }
                     while(boleto.getFecha() == null)
                     {
                        if(boleto.validaFecha(fecha))
                        {
                            boleto.setFecha(fecha);
                        }else{
                            turista.print("Fecha de Vuelo : ");
                            fecha = teclado3.next();
                        }
                     }
                     while(boleto.getHora() == null)
                     {
                        if(boleto.validaHora(horas))
                        {
                            boleto.setHora(horas);
                        }else{
                            turista.print("Hora : ");
                            horas = teclado3.next();
                        }
                     }
                     while(boleto.getOrigen() == null)
                     {
                        if(boleto.validaOrigen(origen))
                        {
                            boleto.setOrigen(origen);
                        }else{
                            turista.print("Origen : ");
                            origen = teclado3.next();
                        }
                     }
                     while(boleto.getDestino() == null)
                     {
                        if(boleto.validaDestino(destino))
                        {
                            boleto.setDestino(destino);
                        }else{
                            turista.print("Destino : ");
                            destino = teclado3.next();
                        }
                     }
                     while(boleto.getClase() == null)
                     {
                        if(boleto.validaClase(clase))
                        {
                            boleto.setClase(clase);
                        }else{
                            turista.print("Clase : ");
                            clase = teclado3.next();
                        }
                     }
                     while(boleto.getValor() == 0)
                     {
                        if(boleto.validaValor(valor))
                        {
                            boleto.setValor(valor);
                        }else{
                            turista.print("Valor : ");
                            valor = teclado3.nextInt();
                        }
                     }
                     turista.setPasaje(boleto);
                     turista.print(turista.toString());
                     turista.print("Volviendo al menú en ");
                     for(int i=1; i<4 ; i++)
                     {
                        turista.print("..."+i);
                        Thread.sleep(3000);
                     }
                  break;
                  case 0:
                      System.out.print("\u000C");
                      System.out.println("Ádios, examen primera parte, jui bueno.");
                      opc = 0;
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
                    //System.out.println("Error en el menu : "+ex.getMessage());
                    System.out.println("Porfavor solo escriba valores numericos :(");                               
        }         
        
    }

    
}
