public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {
       int lastDigit = 0;
       if(number >= 0) {
           lastDigit = number % 10;
           while (number > 9) {
               number = number / 10;
           }
           System.out.println("FirstDigit " + number + " lastDigit "+lastDigit+" = "+(number+lastDigit));
           return 0;
           // Alter step
           // int sum = number + lastDigit;
           // return sum;
       }else {
           System.out.println("-1");
           return -1;
       }
    }
}
