import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

//1. Реализовать консольное приложение, которое:
//Принимает от пользователя и “запоминает” строки.
//Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//Если введено revert, удаляет предыдущую введенную строку из памяти.

/**
 * Task1
 */
public class Task1 {

    public static void main(String[] args) {
        inputString(args);

    }

    public static void inputString(String[] args) {

        // Scanner in = new Scanner(System.in);
        LinkedList<String> wordList = new LinkedList<>();

        while (true) {
            Scanner in1 = new Scanner(System.in);
            System.out.println("Введите слово или stop: ");
            String inputString = in1.nextLine();
            if (!inputString.equalsIgnoreCase("stop")) {
                int couns = 0;
                couns = couns + 1;
                for (int j = 0; j < couns; j++) {
                    wordList.add(inputString);
                }
                // System.out.println(wordList);
            } else if (inputString.equalsIgnoreCase("stop")) {
                break;
            }
            // System.out.println(wordList);
        }
        System.out.println(wordList);
        while (true) {

            Scanner in2 = new Scanner(System.in);
            System.out.println();
            System.out.println("Введите print,revert или stop: ");
            String world = in2.nextLine();

            if (world.isBlank()) {
                System.out.println("Строка не должна быть пустой");
                continue;
            }

            if (world.equalsIgnoreCase("stop")) {
                System.out.println("Пока!");
                break;
            }

            if (world.equalsIgnoreCase("print")) {
                Collections.reverse(wordList);
                System.out.println(wordList);
                continue;
            }

            if (world.equalsIgnoreCase("revert")) {
                wordList.removeLast();
                System.out.println(wordList);
                continue;
            }

            else
                System.out.println("Введите print,revert или stop: ");
            continue;
        }
    }
}
