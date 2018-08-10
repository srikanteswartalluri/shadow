public class Operations {
    public static void main(String[] args) {
        //arithmetic operators
        int first, second;
        first = 10;
        second = 5;

        //addition
        int sum;
        sum = first + second; //assigning the sum of first and second number to sum
        System.out.println("sum of first and second "  + sum);

        //subtraction
        int diff = first - second;
        //multiplication
        int product = first * second;
        //divison
        int quotient = first / second;
        //assign 11 to first
        first = 11;
        //modulo => remainder of the division
        int mod = first % second;
        //12 / 5      5)10(2
//                      10
//                      __
//                      0

        System.out.println("Difference is : " + diff);
        System.out.println("product is : " + product);
        System.out.println("quotient is : " + quotient);

        System.out.println("remainder is :  " + mod);

        //increment
        //first++;
        first = first + 1;
        System.out.println("increment first by 1 : " + first);

        //decrement
        second--; //second = second - 1;
        System.out.println("decrement two by 2 : " + second);

        first = 10;
        first = first * 5;
        System.out.println("value after multiplying by 5 : " + first);
        second = 20;
        second = second / 5;
        System.out.println("value after dividing by 5 : " + second);





    }
}
