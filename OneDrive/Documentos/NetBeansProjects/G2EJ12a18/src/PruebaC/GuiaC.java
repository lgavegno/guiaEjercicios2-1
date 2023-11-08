package PruebaC;


import java.util.Scanner;

public class GuiaC {
    

/*12- Escriba un método que valide si una nota ingresada por teclado está entre 0 y 10, si no 
está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.*/
    
    public static void validarNota() {
     Scanner sc = new Scanner (System.in); 

        System.out.println("Ingrese una nota");
        float nota = sc.nextFloat();

        while (nota < 0 || nota > 10) {
            System.out.println("Ingrese otra nota");
            nota = sc.nextFloat();
        }

    }
//---------------------------------------------------------------------------------    
/*Escriba un método en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere el 
límite inicial.*/

    public static void sumatoriaNumeros() {
    Scanner sc = new Scanner (System.in);  

        int suma = 0;

        System.out.println("Ingrese un valor límite:");
        int limite = sc.nextInt();

        do {
            System.out.println("Digite un numero:");
            int num = sc.nextInt();
            suma += num;
        } while (suma < limite);

        System.out.println("suma " + suma);
        
  }
 //---------------------------------------------------------------------------------
 /*Metodo que muestra un menu de 5 opciones. El usuario deberá elegir una opción y el programa deberá mostrar el
 resultado por pantalla y luego volver al menú. El método deberá ejecutarse hasta que se elija la opción 5. 
 Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa directamente,
 se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir (S/N)? Si el usuario 
 selecciona el carácter ‘S’ termina, caso contrario se vuelve a mostrar el menú. 
 */    
    public static void calculadora() {
       callMenu();
       
    }

       public static void viewMenu(){  
        System.out.println("MENU\n" +
        "1. Sumar\n" +
        "2. Restar\n" +
        "3. Multiplicar\n" +
        "4. Dividir\n" +
        "5. Salir");
       }

       public static void callMenu(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese el numero 1");
        float n1 = sc.nextFloat();
        System.out.println("Ingrese el numero 2");
        float n2 = sc.nextFloat();
        
        float suma = 0, resta=0, multiplicacion=0,division = 0; 
        viewMenu();
        
        System.out.println("Elija opción: ");
        byte opc = sc.nextByte();
        
        
           switch (opc) {
            case 1:
                suma = n1 + n2;
                System.out.println("La suma de "+n1+" + "+n2+" = "+suma);
                break;
            case 2:
                resta = n1 - n2;
                System.out.println("La resta de "+n1+" - "+n2+" = "+resta);
                break;
            case 3:
                multiplicacion = n1*n2;
                System.out.println("La multiplicacion de "+n1+" * "+n2+" = "+multiplicacion);
                break; 
            case 4:
                division = n1 / n2;
                System.out.println("La division de "+n1+" / "+n2+" = "+division);
                break;
            case 5:
                System.out.println("¿Está seguro que desea salir (S/N)?");
                String op = sc.next();
                    if(op.equalsIgnoreCase("S")){
                        System.out.println("Ejecucion Finalizada");   
                        break;
                    }else {
                        viewMenu();
                        callMenu();
                        break;
                    }
            default:
                System.out.println("NO ES UNA OPCION VALIDA");
                break;
        }
       }

//----------------------------------------------------------------------------
/*Escriba un método que lea 5 números. Si el número leído es igual a cero se debe salir del bucle y
mostrar el mensaje "Se capturó el número cero". El método deberá calcular y mostrar el resultado de la 
suma de los números leídos, pero si el número es negativo no debe sumarse.*/
       
       public static void capturaElCero(){
        Scanner sc = new Scanner (System.in);
          int suma = 0, cont = 0;
          
           while(cont < 5){
            System.out.println("Ingrese un numero");
            int ingreso = sc.nextInt();
             
            suma+=ingreso;
               cont++;
            if(ingreso == 0){
                break;
            }
           
           }
           System.out.println("La suma total es: "+ suma);
       }
//----------------------------------------------------------------------------------
/*Escribir un método que simule el funcionamiento de un dispositivo RS232, este tipo de dispositivo lee
cadenas enviadas por el usuario. Las cadenas deben llegar con un formato fijo: tienen que ser de un 
máximo de 5 caracteres de largo, el primer carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial “&&&&&” marca el
final de los envíos (llamémosla FDE), y toda secuencia distinta de FDE, que no respete el formato se 
considera incorrecta. Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
correctas e incorrectas recibidas.*/


       public static void dispositivoRS232(){
           Scanner sc = new Scanner (System.in);
           
           boolean secEsp = false;
           int cantCorrectas = 0, cantIncorrectas = 0;
           
           while(!secEsp) {
               System.out.println("Ingrese la cadena: ");
               String str = sc.next();
                
               if((str.charAt(0)=='X') && str.charAt(4)=='O'){
                    cantCorrectas++;                
                } else{
                    cantIncorrectas++;
                }
               if (str.equals("&&&&&")){
               secEsp = true;
                   
               }
                   
            }
           System.out.println("Cantidad de lecturas correctas: "+ cantCorrectas);
           System.out.println("Cantidad de lecturas incorrectas: "+ cantIncorrectas);
       }
 //----------------------------------------------------------------------------------
/*17. Crear un método que dibuje un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo,
si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:     */       
       
       public static void dibujarCuadrado(){
            Scanner sc = new Scanner (System.in);
            
            int f= 0, c =0;
            
            System.out.println("Indique el numero de elementos");
            int n = sc.nextInt();
            
            while(c < n){
                for (f=0; f<n; f++){
                
                    if(f==0 || f==n-1|| c==n-1 ||c==0){
                        System.out.print('*');
                        
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println("");
                          
                c++;
            }
            
        }
 //----------------------------------------------------------------------------------
/*18. Realizar un método que lea 4 números (comprendidos entre 1 y 20) e imprima el número
 ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **      
*/       
     public static void dibujarAsteriscos(){
            Scanner sc = new Scanner (System.in);
           
            byte i = 0;
          System.out.println("Ingrese 4 numeros del 1 al 20"); 
        
           
          while(i < 4){
                
              byte n = sc.nextByte();
              
              System.out.print(n+" ");
              for(int j = 0; j<n; j++){
                  System.out.print("*");
                }
                System.out.println(" ");
            i++;
            }
            
            
     }
       
       
       
       
       }
       
       
       
       
       
       

