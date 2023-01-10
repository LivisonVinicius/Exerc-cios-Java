import java.lang.annotation.Repeatable;

public class App {
    public static void main(String[] args) throws Exception {
        for(int i = 1; i<6 ; i++){
            System.out.println(Integer.toString(i).repeat(i));
        }
    }
}
