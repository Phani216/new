package Examples;

public class sample {

//    int z = 10;
    void sum(){
        int x =1, y=2;
        int sum=x+y;
        System.out.println("Sum : "+sum);
    }
    void b(int x) {
        int sum=0;
//        String phani="123456798" ;
        for (int i = 1; i < x; i++) {
            sum = sum + i;
        }
            System.out.println("Sum : " + sum);

//        for (int i = 0; i < phani.length(); i++) {
//            System.out.println(phani.charAt(i));
//        }
        }
        public static void main (String[]args){
            sample s = new sample();
            s.b(5);
//            System.out.println();
        }
    }
