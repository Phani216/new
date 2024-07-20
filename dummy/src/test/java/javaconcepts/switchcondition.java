package javaconcepts;

public class switchcondition {
    public static void main(String[] args){
        int a=1,b=2;
        switch (a+b){
            case 1:
                System.out.println("A");
                break;
            case 2:
                System.out.println("B");
                break;
            case 3:
                System.out.println("C");
                break;
                ///break
            default:
                System.out.println("D");
        }

    }
}
