package javaconcepts;

public class returntype {

        int a(){
            System.out.println("hi");
            return 2;
        }
        String j(){
            return  "afk";
        }
        int b(int x){
            System.out.println("Hello");
            return x+3;
        }

        public static void main(String[] args){
            returntype rt = new returntype();
            int z = rt.a();
            System.out.println(z + 2);
            int x = rt.b(5);
            System.out.println(x+4);
            System.out.println(x+rt.j());
            System.out.println(rt.j());

        }
}
