
public class DataTypeTasks {
    public static void main(String args[]) {
        test(2);
        System.out.println(factorial(9));
        int[] array = {1, 44, 56, 76, 3, 8, 90};
        System.out.println(average(array));
        string(array);
    }

    public static void test(int a) {                       //четное-нечетное
        if ((a % 2) == 0) {
            System.out.println("число " + a + " четное");
        } else {
            System.out.println("число" + a + "нечетное");
        }
    }

    public static int factorial(int b) {                 //факториал через метод
        int res = 1;
        for (int i = 1; i <= b; i++) {
            res *= i;
        }
        return res;
    }

    public static double average(int[] array) {          //среднее арфиметическое
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    public static void string (int[] array) {              //числовой массив в стороковый
        String sum = "";
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);
    }
}
//        byte d = -128;    //8
//        short b = -32001; //16
//        int a = 10;       //32
//        long c = 6000000; //64
//
//        float d = 12.3;    //32 не использовать
//        double e = 12.8;   //64
//