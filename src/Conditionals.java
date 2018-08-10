public class Conditionals {
    public static void main(String[] args) {
        //integers
        int first = 10;
        int second = 12;

        //compare these numbers
        //10 == 12
        boolean result = (10 == 12);

        System.out.println("result of comparison: " + result);

        result = (10 != 12);
        System.out.println("result of not equals comparison"  + result);

//        result = (12 < 12);
//        result = (12 <= 12);
//        result = (12 > 12);
//        result = (12 >= 12);
//        logical OR AND NOT

        /*
        A  B   A && B    A || B     !A
        0  0     0         0         1
        0  1     0         1         1
        1  0     0         1         0
        1  1     1         1         0
         */

        boolean A, B;
        A = true;
        B = false;

        //logical AND
        boolean res = (A && B);
        System.out.println("A && B : " + res);

        //logical OR
        res = (A || B);
        System.out.println("A || B : " + res);

        //logical NOT
        res = !A;
        System.out.println("!A : " + res);

        //if condition
        //if some condition:
        // do this if true
        //else:
        //  do this if false

        if(10 < 12){
            System.out.println("10 is less than 12");
        }else if(10 == 12){
            System.out.println("10 equal 12");
        }else{
            System.out.println("10 is greater than 12");
        }

        //declare an integer
        //write an if condition to check whether it is odd or even number



    }
}
