import java.util.LinkedList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner((System.in));
        LinkedList<String> wordList = new LinkedList<>();
        int num = 0;
        while (true) {
            System.out.println();
            System.out.print("Введите строку: ");
            String inputString = in.nextLine();
            wordList.add(inputString);
            if ((inputString.length() == 0)) {
                wordList.removeLast();
                System.out.println("Строка не должна быть пустой");
                continue;
            } else if (inputString.equals("print")) {
                wordList.removeLast();
                String temp = wordList.get(0);
                wordList.set(0, wordList.get(wordList.size() - 1));
                wordList.set(wordList.size() - 1, temp);

                System.out.println(wordList);
            } else if (inputString.equals("revert")) {
                wordList.remove(wordList.get(wordList.size() - 1));
                wordList.removeLast();
                System.out.println(wordList);
            }
        }
    }
}
