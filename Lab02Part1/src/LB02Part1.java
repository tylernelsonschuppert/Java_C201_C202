public class LB02Part1 {
    
    public static void main(String[] args) {
        /*
         * Overflow and Underflow
         */
        int value = 2147483647 + 1;
        System.out.println("The value is " + value);
        /*
         * Why is your above output a negative integer?
         * answer: This becomes a negative integer because of overflow. Overflow - "when a variable is assigned a value that is too large (in size) to be stored, it causes overflow.
         * When you declare an int in Java, it is a signed int. When using 32 bits and all are ones - an unsigned int could equal up to 4294967295 when all bits are 1. But for the 
         * signed int, the last bit is used for negatives.
         */
        double number = 1.0 / Math.pow(10, 308);
        System.out.println("The number is " + number);
        /*
         * Look for "Scientific Notation" in your notes or text book
         * What does Math.pow(10, 308) do?
         * answer : This raises 10 to the power of 308 (10^308).
         * What is the consequence of changing the data type of above variable 'number' to float?
         * answer : An error occurs when running the program only after changing the data type to float: "Exception in thread "main" java.lang.RuntimeException: Uncompilable source code - incompatible types: possible lossy conversion from double to float"
         */
        System.out.println("Floating point error " + (1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1));
        /*
         * What is the expected output of above statement?
         * answer: The expected output would be 0.5
         * Explain the reason why we do not see the expected output
         * answer: We do not see the expected output because the 0.1 floating point numbers are approximations. The output is "Floating point error 0.5000000000000001" instead of 0.5
         */
        
        
        //==================================================
        /*
         * operators and expressions
         */
        int a = 5;
        int num = ++a - 8 % 3;
        System.out.println("The num is " + num);
        /*
         * rewite the expression (++a - 8 % 3) to compute 'num' without using
         * increment operator where num should still evaluate to 4.
         * answer: int num = a - 1;
         * What is the value of variable 'a' after computing num?
         * answer: The value of variable 'a' after computing num is 6, because of the pre-increment operator.
         */
        
        /*
         * Write Java code to execute the following fraction,
         * if a = 3 , b = 5, c = 6, d = 4 (declare these as int type variables).
         * numerator  = a * b / (d + c)
         * denominator = c % d - b + a
         * results = numerator/denominator.
         * output 'results'
        
        answer:
        
        import java.util.Scanner;
        public class NewClass {
            public static void main(String[] args){
                int a;
                int b;
                int c;
                int d;
                int numerator;
                int denominator;
                int results;
        
                a = 3;
                b = 5;
                c = 6;
                d = 4;
                numerator = a * b / (d + c);
                denominator = c % d - b + a;
                results = numerator/denominator;

                System.out.println("The numerator is " + numerator);
                System.out.println("The denominator is " + denominator);
                System.out.println("The result is " + results);
            }
        }
        
         */
        
        
        /* Expected output should be -0.1666666716337204
         * Show your hand calculation to verify correctness of 'results'.
         * If the output is incorrect, fix the expression to get the correct 'results'.
         */
        
        // answer: the issue with this is that we are dividing by 0 because the denominator is equal to 0 based on the given formula.
        // I am not sure how to get the expected result indicated above. I have tried changing the data types but still receive the same result
        // with the answer being "Infinity" based on the given input values.
    }
}
