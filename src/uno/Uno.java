/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno;

public class Uno{ // esto es la definición de una clase
    static int valor;//se pone a cero
    public static void main(String[] args) {
        int resultado;
        valor = valor+4;
        /*
        System.out.println("hola mundo");//literal alfanumrico ""
        resultado = mayorDeDosEnteros(3, 9);// 3 y 9 son parámetros actuales
        System.out.println("Mayor: "+resultado);//+ es operador de concatenación
        resultado = menorDeDosEnteros(3, 9);// 3 y 9 son parámetros actuales
        System.out.println("Mayor: "+resultado);//+ es operador de concatenación
        */
        
        int n1,n2,n3;
        n1 = 6;
        n2 = 11;
        n3 = 5;
        resultado = mayorDeTresEnteros(n1,n2,n3);
        System.out.println("El mayor de "+n1+", "+n2+" y "+n3+" es: "+resultado);
        System.out.println("valor "+valor);
        
        
    }

    public static int mayorDeDosEnteros(int a, int b) { // a y b son parámetros formales
       
        if(a>b){
            return a;
        }else {
           return b;
        }
         
    }
    
    public static int menorDeDosEnteros(int a, int b) { // a y b son parámetros formales
        
        if(a<b){
            return a;
        }else {
           return b;
        }
        
       
    }
   /*
  public static void prueba(){
      int valor;//no se inicializa
      //valor = valor +5;
      System.out.println(valor);
      
     
  }
  */ 
    
    
  public static int mayorDeTresEnteros(int a, int b, int c) { // a y b son parámetros formales
      int mayor;
      if(a>b){
          if(a>c){
              mayor = a;
          }
          else 
              mayor = c;
      }else {//b>=a
          if(b>c){
              mayor = b;
          }else {
              mayor = c;
          }
     }
      
      return mayor;
              
    }
    
     public static int sumaDeTresEnteros(int a, int b, int c) { // a y b son parámetros formales
      return a+b+c;
    }
    /*
     public static int mayorDeDosEnteros(int a, int b) { // a y b son parámetros formales
        int mayor;
        if(a>b){
            mayor = a;
        }else {
            mayor = b;
        }
        return mayor;
    }
    */
     
     public static void saludo(){
         System.out.println("Hola");
     }
     
     
}


