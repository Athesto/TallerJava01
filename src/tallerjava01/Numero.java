/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerjava01;

/**
 *
 * @author Gustavo
 */
public class Numero {
    private long value = 1; //Valor del numero
         
    public  boolean isPrime() {
        long n=value;
    if (n <= 3) {
        return n > 1;
    } else if (n % 2 == 0 || n % 3 == 0) {
        return false;
    } else {
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}

/**
 *  Retorna el valor que tiene el numero
 * 
 * @return 
 */
    public long getValue() {
        return value;
    }
/**
 * Se define el valor del numero (entero)
 * @param value 
 */
    public void setValue(long value) {
        this.value = value;
    }
    
    public class Nota extends Numero{
        
    }
}
