package ru.mirea.kvbo1.gurtovaya;

public class Main {
    public static void main(String[] args) {
        int [] massive = new int[4];

        for (int i = 0; i < massive.length; i++) { //заполнить массив
            int a = (int) (Math.random() * 90 + 10);
            massive[i] = a;
            System.out.print(massive[i] + " ");
        }

        if (massive[0] < massive[1] && massive[1] < massive[2] && massive[2] < massive[3]) {
            System.out.println("\nПоследовательность строго возрастающая.");
        }
        else {
            System.out.println("\nПоследовательность нестрого возрастающая.");
        }
    }
}
