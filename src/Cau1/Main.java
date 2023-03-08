package Cau1;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println(c);
        System.out.println("Chu vi cua hinh tron = "+c.getArea());
        System.out.println("Dien tich cua hinh tron = "+c.getCircumferce());

        Circle c2 = new Circle(6);
        System.out.println(c2);
        System.out.println("Chu vi cua hinh tron = "+c2.getArea());
        System.out.println("Dien tich hinh tron = "+c2.getCircumferce());


        try{
            Circle c3 = new Circle(-10);
        }
        catch (Exception e){
            System.out.println(e);
        }


    }
}
