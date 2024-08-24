import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> ListA = new ArrayList<>();
        System.out.println("Введите пять имен:");
        for (int i = 0; i < 5; i++) {
            ListA.add(scanner.nextLine());
        }
        System.out.println("Список A");
        for (String a : ListA) {
            System.out.println(a);
        }
        ArrayList<String> ListB = new ArrayList<>();
        System.out.println("Введите пять имен:");
        for (int i = 0; i < 5; i++) {
            ListB.add(scanner.nextLine());
        }
        System.out.println("Список Б");
        for (String b : ListB) {
            System.out.println(b);
        }
        ArrayList<String> ListC = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            ListC.add(ListA.get(i));
            ListC.add(ListB.get(4 - i));
        }
        System.out.println("Список С");
        for (String c : ListC) {
            System.out.println(c);
        }
        ListC.sort(Comparator.comparingInt(String::length));

        System.out.println("Отсортированный список С:");
        for (String s : ListC) {
            System.out.println(s);
        }
        scanner.close();
    }
}