import java.util.ArrayList;

public class Q6 {
    public static void main(String[] args) {
        String[] list={"Alice", "Noah", "Bob", "Bob", "Alice", "Adam", "Ava"};
        String temp;
        for(int i=0;i<list.length;i++){
            for (int j = i + 1; j < list.length;j++) {


                if (list[i].compareTo(list[j]) > 0) {

                    temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
        System.out.println("The names in alphabetical order are: ");
        for (int i = 0; i <list.length; i++) {
            System.out.println(list[i]);
        }

    }
}
