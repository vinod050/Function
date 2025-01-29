import java.util.Scanner;
public class Function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Greet ab= new Greet();
        Wel b= new Wel();
        System.out.println("hello world"+b);
        // Greet.Wel.Msg();
    }
}
class Greet{
    String a=" hari";
    class Wel{
    String msg(){
        System.out.println("hello world");
        return a;
    }
}
}