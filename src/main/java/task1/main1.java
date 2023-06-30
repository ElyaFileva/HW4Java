package task1;

import java.util.LinkedList;
import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество элементов списка: ");
        int n = sc.nextInt();
        System.out.println(getList(list, n));
        for (int i = list.size(); i > 0; i--) {
            System.out.print(i + " ");
        }
    }

    private static LinkedList getList(LinkedList<Integer> list, int n) {
        for (int i = 1; i <= n; i++)
            list.add(i);
        return list;
    }
}
