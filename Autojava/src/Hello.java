public class Hello {
    public static void main(String[] args) {
        hello("world");
        hello("user");
        hello("Igor");

        Square s = new Square();
        s.l = 5;
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + area(s));

        Regtangle r = new Regtangle();
        r.a = 4;
        r.b = 6;
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + area(r));
    }
    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }

    public static double area(Square s) {
    return s.l * s.l;
    }

    public static double area(Regtangle r) {
        return r.a * r.b;

    }
}
