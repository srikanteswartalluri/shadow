public class Constants {
    public static void main(String[] args) {
        //integer
        int rollNumber  = 12;

        //constant
        final  int CONVERSIONFACTOR = 4;

        //modify rollNumber
        rollNumber = 34;
       // CONVERSIONFACTOR = 5;

        int newRollNumber = rollNumber + CONVERSIONFACTOR;
        System.out.println(newRollNumber);


    }
}
