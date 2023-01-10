import java.io.*;
public class App {
    public static void main(String[] args) throws IOException {
        System.out.println("Digite o número:");
        BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));
        int userInput = Integer.parseInt(bfn.readLine());
        System.out.println("Tabela de multiplicação de "+ userInput);
        for (int i =1 ; i<11 ; i++) {
            System.out.println(userInput*i);
        }
    }
}
