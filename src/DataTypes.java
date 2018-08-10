public class DataTypes {

    public static void main(String[] args) {
        //integers
        int rollNumber;
        rollNumber= 130;

        System.out.println(rollNumber);

        //modify the value of rollNumber
        rollNumber = 179;
        System.out.println(rollNumber);

        int copyRollNUmber = rollNumber;

        System.out.println("This is the copied value" + copyRollNUmber);

        //System.out.println(copyRollNUmber);

        //character
        char input = '%';
        System.out.println("This is a char :" + input);

        //String
        String firstName = "Svethlana";
        String lastName = "Soy";
        String fullName = firstName + " " + lastName; //string concatenation
//        System.out.println("name is : " + fullName);
        System.out.println("name is : " + firstName + " " + lastName);
        //store a decimal value
        //float
        float pi = 3.14f;
        System.out.println("Value of pi is : " + pi);


        //boolean
        boolean result = true;
        boolean newResult = false;

        System.out.println("result is : " + result);
        System.out.println("new result is : " + newResult);

      //byte  -128 to 127
        //short  -32768 to 32767
        //long   integer exceeding 2.14 billion
        //double  long floating point number









    }
}
