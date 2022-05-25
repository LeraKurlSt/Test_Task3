import java.util.Scanner;

public class Task3 {
    //Реализовать класс «Треугольник». Треугольник характеризуется тремя сторонами (допускаются дробные значения).
    // Необходимо реализовать методы получения периметра и площади треугольника, метод,
    // проверяющий корректность значений стороне треугольника (может ли такой треугольник существовать),
    // ввод/вывод треугольника, setters/getters, конструкторы.
    //Протестировать класс через создание объектов и вызовы методов в коде (менюшки и CLI/GUI делать не надо, просто вызовы методов).

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the first side of the triangle: ");
            double a = sc.nextDouble(); //20
            System.out.print("Enter the second side of the triangle: ");
            double b = sc.nextDouble(); // 25
            System.out.print("Enter the third side of the triangle: ");
            double c = sc.nextDouble(); //40
            Triangle triangle = new Triangle(a, b, c);
            System.out.println("The perimeter of the triangle is " + triangle.Perimeter());
            System.out.println("The area of the triangle is " + triangle.Square());
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }

    }
}
