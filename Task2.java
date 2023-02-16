import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedOne = new LinkedList<>();
        LinkedList<Integer> linkedTwo = new LinkedList<>();

        System.out.print("Введите количество элементов списка: ");

        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();
        Random rand = new Random();

        for (int i = 0; i < value; i++) {
            int randomNum = rand.nextInt(10);
            linkedOne.add(randomNum);
        }
        System.out.println(linkedOne);

        for (int j = linkedOne.size() - 1; j >= 0; j--) {
            linkedTwo.add(linkedOne.get(j));
        }
        System.out.println(linkedTwo);
    }
}
