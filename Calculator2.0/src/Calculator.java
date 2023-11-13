import java.util.Scanner;//import scaneer class
public class Calculator {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);//intialise scanner
        System.out.println("Enter num1:");//display enter first number
        int num1 = read.nextInt();//read first number
        System.out.println("Enter num2:");//display enter second number
        int num2 = read.nextInt();//read second number
        System.out.println("enter operation (+, -, *, /): ");//display enter operation
        char operation = read.next().charAt(0);
          if (operation == '+'){
            int result = add(num1, num2);
            System.out.println(result);
          }else if (operation == '-') {
          int result = subtract(num1, num2);
          System.out.println(result);
          }else if (operation == '*') {
            int result = multiply(num1, num2);
            System.out.println(result);
          }else if (operation == '/'){
            int result = divide(num1, num2);
            System.out.println(result);
          }
          //conditional statements for operators
             read.close();//close scanner
        }
       
      

    public static int add(int num1, int num2) {//Initialise add method plus varibles
            int sum = num1 + num2;//Initials varible operation
            return sum;//print result
            
        }
        public static int subtract(int num1, int num2) {//initialise subtraction method
            int difference = num1 - num2;//intitialse subtraction operation
            return difference;//print result
}
        public static int divide(int num1, int num2) {
            int quotient = num1 / num2;
            return quotient;

        }
        public static int multiply(int num1, int num2) {
            int product = num1 * num2;
            return product;

        }

}
