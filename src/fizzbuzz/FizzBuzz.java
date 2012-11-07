package fizzbuzz;

/**
 *
 * @author David
 */
public class FizzBuzz {

    public static void printFizzbuzz() {
        for (int i = 1; i <= 100; i++) {
            
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println(" Fizz Buzz  " + i);
                continue;
            }
            
            if (i % 3 == 0) {
                System.out.println("Fizz  " + i);
                continue;
            }
            if (i % 5 == 0) {
                System.out.println("Buzz  " + i);
                continue;
            }
            
            if(i % 5 != 0 && i % 3 != 0){
                System.out.println("" + i);
                continue;
            }
            
        }
    }

    public static void main(String[] args) {
       printFizzbuzz();
      
    }
}
