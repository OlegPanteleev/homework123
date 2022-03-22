package ru.geekbrains.homework1;

public class MainApp {

    public static void main(String[] args) {
        byte bt = 1;
        short sh = 101;
        int in = 100001;
        long lg = 101010101010l;
        float ft = 1012.21f;
        double dbl = 101045.678;
        char ch = '$';
        boolean bln = true;

        float a = 12.7f;
        float b = 34.87f;
        float c = 61.009f;
        float d = 43f;
        int x = 4;
        int y = 6;
        int z = 0;
        int xs = -9;
        String name = "Олег";
        int year = 2020;

        float f = firstMethod(a, b, c, d);
        System.out.println(a + " * " + "(" + b + " + " + "(" + c + " / " + d + "))" + " = " + f);

        boolean sum = myMethod(x, y);
        System.out.println(sum);

        numMethod(z);

        boolean numXS = sixthTask(xs);
        System.out.println(numXS);

        nameMethod(name);

        leapYear(year);
    }

    /**
     *
     * @param one число с плавающей точкой
     * @param two число с плавающей точкой
     * @param three число с плавающей точкой
     * @param four число с плавающей точкой
     * @return результат арифмитический действий над числами
     */
    public static float firstMethod(float one, float two, float three, float four){
        float res = one * (two + (three / four));
        return res;
    }

    /**
     *
     * @param one целое число
     * @param two целое число
     * @return результат проверки условий суммы целых чисел
     */
    public static boolean myMethod(int one, int two){
        int sum1 = one + two;
        if (sum1 >= 10 && sum1 <= 20)
            return true;
        else {
            return false;
        }
    }

    /**
     *
      * @param num целое число
     */
    public static void numMethod(int num){
        if (num >= 0){
            System.out.println("Число положительное");
        }
        else {
            System.out.println("Число отрицательное");
        }
     }

    /**
     *
     * @param num1 целое число
     * @return результат проверки условий целого числа
     */
    public static boolean sixthTask (int num1){
        if (num1 >= 0){
            return false;
        }
        else {
            return true;
        }
    }

    /**
     *
     * @param name целое число
     */
    public static void nameMethod(String name){
        System.out.println("Привет, " + name + "!");
    }

    /**
     *
     * @param year целое число
     */
    public static void leapYear (int year) {
        if (year % 4 == 0 || year % 400 == 0 && year % 100 != 0) {
            System.out.println("Год является високосным!");
        }
        else {
            System.out.println("Год не является високосным!");
        }
    }
}
