import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> duplicate= new ArrayList<>();
        String[] array1={"Morango", "Uva", "Acerola","Manga","Morango","Caju"};
        String[] array2={"Pêra", "Caju", "Morango","Kiwi"};
        for(int i = 0; i<array1.length;i++){
            for(int j = 0; j<array2.length;j++){
                if(array1[i].equals(array2[j])&&!duplicate.contains(array1[i])){
                    duplicate.add(array1[i]);
                }
            }
        }
        for(int i = 0; i<duplicate.size();i++){
            System.out.println(duplicate.get(i));
        }
    }
}
