/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

/**
 *
 * @author joan
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(String.format("El factorial de 3 es %f" , Factorial(3)));
        System.out.println(String.format("El factorial de 7 es %f" , Factorial(7)));
        System.out.println(String.format("El factorial de 35 es %f" , Factorial(35)));
    }
    
    public static double Factorial(double numero){
        if(numero>=0 && numero<=100){
            double test=1;
            for(double i=numero;i>1;i--){
                test = test *i;
            }
            return test;
        }else{
            return 0;
        }
    }
}
