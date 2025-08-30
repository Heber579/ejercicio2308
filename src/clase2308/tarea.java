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
public class tarea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector=new Scanner (System.in);
        int opcion;
        String pregunta;
        do{
        System.out.println("+++++++++++PROGRAMA+++++");
        System.out.println("1. Calculadora");
        System.out.println("2. Meses del anio");
        System.out.println("3. Descuento de un producto");
        System.out.println("4. Calculo geometrico");
        System.out.println("5. Salir");
        opcion=lector.nextInt();
        switch (opcion){
            case 1:{
                calculadora();
                break;
            }case 2:{
                meses();
                break;
            }case 3:{
                descuento();
                break;
            }case 4:{
                calculo();
                break;
            }case 5:{
                System.out.println("Salir");
                break;
            }
        }
            System.out.println("Desea continuar?");
            pregunta=lector.next().toUpperCase();
        }while (pregunta.equals("SI"));   
    }
public static void calculadora(){
    String operacion,pregunta;
    Scanner lector=new Scanner (System.in);
    do{
    System.out.println("+++++CALCULADORA++++++");
    System.out.println("Ingrese la letra de la operacion");
    System.out.println("matematica que desea realizar");
    System.out.println("S,s SUMA");
    System.out.println("R,r RESTA");
    System.out.println("M,m,P,p PRODUCTO");
    System.out.println("D,d DIVISION");
    operacion=lector.next().toUpperCase();
    switch (operacion){
        case "S":{
            suma();
            break;
        }case "R":{
            resta();
            break;
        }case "M,P":{
            multiplicacion();
            break;
        }case "D":{
            division();
            break;
        }
    }
        System.out.println("Desea continuar?");
        pregunta=lector.next().toUpperCase();
    }while (pregunta.equals("SI"));          
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
public static void division (){
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
public static void meses(){
    Scanner lector=new Scanner (System.in);
    int mes,anio;
    String pregunta;
    do{
    System.out.println("+++++++MESES DEL ANIO++++++");
    System.out.println("Ingrese el numero de un mes");
    mes=lector.nextInt();
    System.out.println("Ingrese un anio");
    anio=lector.nextInt();
    switch (mes){
        case 1:{
            System.out.println("EL nombre del mes es enero y tiene 31 dias del "+anio);
            break;
        }case 2:{
            System.out.println("EL nombre de mes es febrero y tiene 28 dias del "+anio);
            break;
        }case 3:{
            System.out.println("EL nombre del mes es marzo y tiene 31 dias del "+anio);
            break;
        }case 4:{
            System.out.println("EL nombre del mes es abril y tiene 30 dias del "+anio);
            break;
        }case 5:{
            System.out.println("EL nombre del mes es mayo y tiene 31 dias del "+anio);
            break;
        }case 6:{
            System.out.println("EL nombre del mes es junio y tiene 30 dias del "+anio);
            break;
        }case 7:{
            System.out.println("EL nombre del mes es julio y tiene 31 dias del "+anio);
            break;
        }case 8:{
            System.out.println("EL nombre del mes es agosto y tiene 31 dias del "+anio);
            break;
        }case 9:{
            System.out.println("EL nombre del mes es septiembre y tiene 30 dias del "+anio);
            break;
        }case 10:{
            System.out.println("EL nombre del mes es octubre y tiene 31 dias del "+anio);
            break;
        }case 11:{
            System.out.println("EL nombre del mes es noviembre y tiene 30 dias del "+anio);
            break;
        }case 12:{
            System.out.println("EL nombre del mes es diciembre y tiene 31 dias del "+anio);
            break;
        }
    }
        System.out.println("Desea continuar?");
        pregunta=lector.next().toUpperCase();
    }while (pregunta.equals("SI"));
}
public static void descuento(){
    Scanner lector=new Scanner (System.in);
    double gastado,descuento,total;
    String pregunta;
    do{
    System.out.println("+++++++DESCUENTO+++++");
    System.out.println("Ingrese el total gastado");
    gastado=lector.nextDouble();
    if (gastado<500){
        System.out.println("No aplica descuento");
    }else if((gastado>500) && (gastado<1000)){
        descuento=gastado*0.05;
        total=gastado-descuento;
        System.out.println("El descuento es de "+descuento+". EL total es de "+total);
    }else if ((gastado>1000) && (gastado<7000)){
        descuento=gastado*0.11;
        total=gastado-descuento;
        System.out.println("El descuento es de "+descuento+". EL total es de "+total);
    }else if ((gastado>7000) && (gastado<15000)){
        descuento=gastado*0.18;
        total=gastado-descuento;
        System.out.println("El descuento es de "+descuento+". EL total es de "+total);
    }else if (gastado>15000){
        descuento=gastado*0.25;
        total=gastado-descuento;
        System.out.println("El descuento es de "+descuento+". EL total es de "+total);
    }
        System.out.println("Desea continuar?");
        pregunta=lector.next().toUpperCase();
    }while (pregunta.equals("SI"));         
}
public static void calculo(){
    Scanner lector=new Scanner (System.in);
    String pregunta,operacion;
    do{
    System.out.println("++++++CALCULOS GEOMETRICOS");
    System.out.println("Ingrese el nombre de una de las tres figuras");
    System.out.println("Cuadrado");
    System.out.println("Rectangulo");
    System.out.println("Triangulo");
    operacion=lector.next().toUpperCase();
    switch (operacion){
        case "CUADRADO":{
            cuadrado();
            break;
        }case "RECTANGULO":{
            rectangulo();
            break;
        }case "TRIANGULO":{
            triangulo();
            break;
        }
    }
        System.out.println("Desea continuar?");
        pregunta=lector.next().toUpperCase();
    }while (pregunta.equals("SI"));   
}
public static void cuadrado(){
    Scanner lector=new Scanner (System.in);
    double lado,perimetro,area;
    String pregunta;
    do{
    System.out.println("Ingrese un lado del cuadrado");
    lado=lector.nextDouble();
    perimetro=lado*4;
    area=lado*lado;
    System.out.println("El perimetro es "+perimetro+" y el area es "+area);
        System.out.println("Desea continuar?");
        pregunta=lector.next().toUpperCase(); 
    }while (pregunta.equals("SI")); 
}
public static void rectangulo(){
    Scanner lector=new Scanner (System.in);
    double base,altura,perimetro,area;
    String pregunta;
    do{
    System.out.println("Ingrese la base del rectangulo");
    base=lector.nextDouble();
    System.out.println("Ingrese la altura del rectangulo");
    altura=lector.nextDouble();
    perimetro=2*(base+altura);
    area=base*altura;
    System.out.println("El perimetro es "+perimetro+" y el area es "+area);
        System.out.println("Desea continuar?");
        pregunta=lector.next().toUpperCase(); 
    }while (pregunta.equals("SI")); 
}
public static void triangulo(){
    Scanner lector=new Scanner (System.in);
    double lado1,lado2,base,altura,perimetro,area;
    String pregunta;
    do{
    System.out.println("Ingrese el primer lado del triangulo");
    lado1=lector.nextDouble();
    System.out.println("Ingrese el segundo lado del triangulo");
    lado2=lector.nextDouble();
    System.out.println("Ingrese la base del triangulo");
    base=lector.nextDouble();
    System.out.println("Ingrese la altura del triangulo");
    altura=lector.nextDouble();
    perimetro=lado1+lado2+base;
    area=(base*altura)/2;
    System.out.println("El perimetro es "+perimetro+" y el area es "+area);
        System.out.println("Desea continuar?");
        pregunta=lector.next().toUpperCase(); 
    }while (pregunta.equals("SI")); 
}

}
