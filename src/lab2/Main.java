package lab2;

class Main {
    public static void main(String[] args) {
        // Создание точек 2d
        Point2d myPoint = new Point2d ();//создает точку (0,0)
        Point2d myOtherPoint = new Point2d (5,3);//создает точку (5,3)
        Point2d aThirdPoint = new Point2d ();

        System.out.println("Сравнение 2 2d точек, значение:");
        System.out.println(Point2d.comparePoints(myOtherPoint, aThirdPoint));

        // Создание точек 3d
        Point3d p1 = new Point3d ();//создает точку (0,0,0)
        Point3d p2 = new Point3d (5,3,0);//создает точку (5,3,0)
        Point3d p3 = new Point3d (0,0,0);

        System.out.println("Сравнение 2 одинаковых 3d точек, значение:");
        System.out.println(Point3d.comparePoints(p1, p3));

        System.out.println("Сравнение 2 разных 3d точек, значение:");
        System.out.println(Point3d.comparePoints(p1, p2));

        System.out.println("distanceTo");
        System.out.println(Point3d.distanceTo(p1, p2));
    }
}