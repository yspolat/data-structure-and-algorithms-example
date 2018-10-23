public class NumberCanBeDividedBy {

    public String example = "Find the number can be divided by given number. ";


    public static void findNumbersCanBeDivided () {
        int number = 10;

        for (int i=1; i<=10; i++){
            if (number % i == 0){
                System.out.println(i);
            }
        }
    }

}
