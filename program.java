//Пусть дан произвольный список целых чисел.

//1) Нужно удалить из него чётные числа
//2) Найти минимальное значение
//3) Найти максимальное значение
//4) Найти среднее значение

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class program {
    public static void main(String[] args) throws Exception{
        System.out.println("Введите длину списка N: ");
        try (Scanner iScanner = new Scanner(System.in)){
            int N = iScanner.nextInt();
            ArrayList<Integer> arr = new ArrayList<Integer>();
            Random ran = new Random();
            for (int i = 0; i < N; i++){
                int a = ran.nextInt(N);
                arr.add(a);
            }
            System.out.println("Произвольный список целых чисел: \n " + arr);

            for (int i = arr.size() - 1; i >= 0; i--){
                int b = arr.get(i) % 2;
                if (b == 0){
                System.out.println("Четное число:" + arr.get(i));
                arr.remove(i);
                }
            }
            Collections.sort(arr);
            System.out.println("Список с удаленными четными числами: \n " + arr);
            
            int min = arr.get(0);
            int max = arr.get(0);
            float summ = 0;
            for (int i = 0; i < arr.size(); i++){
                int num = arr.get(i);
                if (num < min) {
                    min = num;
                }
                if (num > max){
                    max = num;
                }
                summ += num;
            }
            float average = summ / arr.size();

            System.out.println("Минимальное значение: " + min);
            System.out.println("Максимальное значение: " + max);
            System.out.println("Среднее арифметическое значение: " + average);
        
        }
    }   
}