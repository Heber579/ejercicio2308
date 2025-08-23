/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase2308;

import java.util.Scanner;

/**
 *
 * @author Ever
 */
public class Clase2308 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector=new Scanner (System.in);
        int opcion;
        String pregunta;
        do{
        System.out.println("+++++++++++CALCULADORA+++++");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("5. Potencia");
        System.out.println("6. Salir");
        opcion=lector.nextInt();
        switch (opcion){
            case 1:{
                suma();
                break;
            }
            case 2:{
                resta();
                break;
            }
            case 3:{
                multiplicacion();
                break;
            } 
            case 4:{
                division();
                break;
            } 
            case 5:{
                potencia();
                break;
            } 
            case 6:{
                System.out.println("Bye");
                break;
            }
            default:{
                System.out.println("La opcion no existe");
                break;
            }
        }
            System.out.println("¿Desea continuar?");
            pregunta=lector.next().toUpperCase();
        }while(pregunta.equals("SI")); 
    }
public static void suma(){
   int num1,num2,suma;
   String pregunta;
   Scanner lector=new Scanner (System.in);
   do{
    System.out.println("Ingrese el numero 1");
    num1=lector.nextInt();
    System.out.println("Ingrese el numero 2");
    num2=lector.nextInt();
    suma=num1+num2;
    System.out.println("La suma es "+suma);
    System.out.println("Desea seguir sumando?");
    pregunta=lector.next().toUpperCase();
   }while(pregunta.equals("SI"));
}  
public static void resta(){
   int num1,num2,resta;
   String pregunta;
   Scanner lector=new Scanner (System.in);
   do{
    System.out.println("Ingrese el numero 1");
    num1=lector.nextInt();
    System.out.println("Ingrese el numero 2");
    num2=lector.nextInt();
    resta=num1-num2;
    System.out.println("La resta es "+resta);
    System.out.println("Desea seguir restando?");
    pregunta=lector.next().toUpperCase();
   }while(pregunta.equals("SI"));
} 
public static void multiplicacion(){
   int num1,num2,multiplicacion;
   String pregunta;
   Scanner lector=new Scanner (System.in);
   do{
    System.out.println("Ingrese el numero 1");
    num1=lector.nextInt();
    System.out.println("Ingrese el numero 2");
    num2=lector.nextInt();
    multiplicacion=num1*num2;
    System.out.println("La multiplicacion es "+multiplicacion);
    System.out.println("Desea seguir multiplicando?");
    pregunta=lector.next().toUpperCase();
   }while(pregunta.equals("SI"));
} 
public static void division(){
   int num1,num2,division;
   String pregunta;
   Scanner lector=new Scanner (System.in);
   do{
    System.out.println("Ingrese el numero 1");
    num1=lector.nextInt();
    System.out.println("Ingrese el numero 2");
    num2=lector.nextInt();
    if (num2==0){
        System.out.println("No se puede dividir dentro de cero");
    }else{    
        division= num1 / num2;
        System.out.println("La division es "+division);    
    }
    System.out.println("Desea seguir dividiendo?");
    pregunta=lector.next().toUpperCase();
   }while(pregunta.equals("SI"));
}
public static void potencia(){
   int num1,num2;
   double potencia;
   String pregunta;
   do{
   Scanner lector=new Scanner (System.in);
    System.out.println("Ingrese la base");
    num1=lector.nextInt();
    System.out.println("Ingrese el exponente");
    num2=lector.nextInt();
    potencia=Math.pow(num1, num2);
    System.out.println("La potencia es "+potencia);
    System.out.println("Desea seguir elevando?");
    pregunta=lector.next().toUpperCase();
   }while(pregunta.equals("SI"));
}

}
