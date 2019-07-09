public class DataTypeTasks3<sout> {
    public static void main(String[] args) {
        String[][] array = {{"Яблоки ", "Код товара:1 ", "Цена:50"}, {"Апельсины ", "Код товара:2 ", "Цена:300"}, {"Груши ", "Код товара:3 ", "Цена:100"}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
        data(array, "Код товара:3 ");
        boolmas();
        cycle1();
        cycle2();
        random1();
        random2();
    }

    public static void data(String[][] array, String code) {         //вывод необходимых данных из 2х мерного массива
        for (int i = 0; i < array.length; i++) {
            if (array[i][1] == code) {
                System.out.println();
                System.out.print(array[i][0]);
                System.out.println(array[i][2]);
            }
        }
    }

    public static void boolmas() {                                  //из числового массива в boolean
        int[] array1 = {343, 1, 567, 34};
        boolean[] array2 = new boolean[array1.length];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = array1[i] > 100;
        }
        for (boolean x : array2) {
            System.out.println(x);
        }
    }

    public static void cycle1() {                                    //цикл while
        int a = 15;
        while (a >= 10) {
            System.out.println(a);
            a--;
        }
    }

    public static void cycle2() {                                   //цикл do....while
        int a = 15;
        do {
            System.out.println(a);
            a--;
        }
        while (a >= 10);
    }

    public static void random1() {                                   //ручной ввод рандома для массива foreach
        int[] array = {1, 545, 6, 1, 6, 5, 7, 456, 2, 2};
        for (int x : array) {
            if (x == 5) {
                System.out.println(x + " - Искомое значение");
            }
        }
    }

    public static void random2() {                                   //автоввод рандома для массива for
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 10));
            if (array[i] == 5) {
                System.out.println(array[i] + " - Искомое значение");
                }
            }
        }
    }