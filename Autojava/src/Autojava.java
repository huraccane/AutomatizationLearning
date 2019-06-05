public class Autojava {
        public static void main(String[] Args) {
            hello("Igor");
            hello("Kris");

            double len = 5;
            System.out.println("Площадь квадрата со сторонами " + len + " = " + area(len));
            double a = 5;
            double b = 4;
            System.out.println("Площадь прмоугольника со сторонами " + a + " и " + b + " = " + area(a, b));

        }

        public static void hello(String somebody) {
            System.out.println("Hello, " + somebody + "!");
        }

        public static double area(double l) {
            return l * l;
        }
            public static double area(double a, double b) {
                return a * b;
            }
        }


