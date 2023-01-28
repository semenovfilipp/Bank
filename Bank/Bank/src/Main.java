import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сумму!\n");
        int amountRequired = sc.nextInt();
        CatchFalls(amountRequired);
        final int[] availableNotes = {5000, 1000, 500, 100, 50};

        for (int i = 0; i < availableNotes.length;i++) {
            int count = 0;
            while (amountRequired - availableNotes[i] >= 0) {
                amountRequired -= availableNotes[i];
                count++;
            }
            if (count > 0) {
                System.out.println("Количество купюр по " + availableNotes[i] + " рублей - " + count + " шт.");
            }
        }


        /*

        for (int i = 0; i < list.length; i++) {
            for (int j = n; j % list[i] != 0; result = j - list[i]) {
                count = j / list[i];
                System.out.println();
                continue;
            }
        }

         */
    }

    public static int CatchFalls(int a) {
        if (a <= 0) {
            throw new IllegalArgumentException("Значение должно быть больше 0");
        }
        if (a % 100 != 0) {
            throw new IllegalArgumentException("Значение должно быть кратно 100");
        }
        return a;
    }
}


/*
///дано 5500
            ///пока 5500 > индекс ай ===== 5500/5000
                ///int count = 5500/лист ай(5000)
                ///результат = 5500%5000

                /// если есть остаток и результат деления равен нулю, тогда = остаток / индекс ай(1000)

         */






