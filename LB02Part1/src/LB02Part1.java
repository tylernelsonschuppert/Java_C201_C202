public class LB02Part1 {
    
    public static void main(String[] args) {
        /*
         * Overflow and Underflow
         */
        int value = 2147483647 + 1;
        System.out.println("The value is " + value);
        /*
         * Why is your above output a negative integer?
         * answer:
         */
        double number = 1.0 / Math.pow(10, 308);
        System.out.println("The number is " + number);
        /*
         * Look for "Scientific Notation" in your notes or text book
         * What does Math.pow(10, 308) do?
         * answer :
         * What is the consequence of changing the data type of above variable 'number' to float?
         * answer :
         */
        System.out.println("Floating point error " + (1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1));
        /*
         * What is the expected output of above statement?
         * answer:
         * Explain the reason why we do not see the expected output
         * answer:
         */
        
        
        //==================================================
        /*
         * operators and expressions
         */
        int a = 5;
        int num = ++a - 8 % 3;
        System.out.println("The num is " + num);
		System.out.println("a after computing num: " + a);
        /*
         * rewite the expression (++a - 8 % 3) to compute 'num' without using
         * increment operator where num should still evaluate to 4.
         *
         * What is the value of variable 'a' after computing num?
         * answer:
         */
        
		a = 3;
		int b = 5;
		int c = 6;
		int d = 4;
		double numerator = a * b / (d + c);
		double denominator = c % d - (b + a);
		double results = (float)numerator / (float)denominator;
		System.out.println("The results is " + results);
        
        /*
         * Write Java code to execute the following fraction,
         * if a = 3 , b = 5, c = 6, d = 4 (declare these as int type variables).
         * numerator  = a * b / (d + c)
         * denominator = c % d - b + a
         * results = numerator/denominator.
         * output 'results'
         */
        
        
        /* Expected output should be -0.1666666716337204
         * Show your hand calculation to verify correctness of 'results'.
         * If the output is incorrect, fix the expression to get the correct 'results'.
         */
    }
}
