
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

//2. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.


public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list1 =new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list1.add(random.nextInt(1,10));
        }
        System.out.println(list1);
        Collections.reverse(list1);
        System.out.println(list1);
    }
       
    }

