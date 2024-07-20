package javaconcepts;

public class break_contineous {
    public static void main(String[] args) {

        for (int i = 5; i < 9; i++) {
            System.out.println(i);
            if (i == 7) {
               /// System.out.println(break);
                break;
            }
        }
        System.out.println("i");
        for (int i = 5; i < 10; i++) {
//            System.out.println(i);
            if (i == 7) {
                continue;
            }
            System.out.println(i);
            i=10;
            System.out.println(i);
            ////continue SKIPS the if statement where break cuts the loop
            ///we cant right print after break where for continue its reverse
        }
    }
}
