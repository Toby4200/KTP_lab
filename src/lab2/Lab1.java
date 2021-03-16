package lab2;

class Lab1 {
    public static void main(String[] args) {
        Point3d p1 = new Point3d(1,1,1);
        Point3d p2 = new Point3d(5,3,0);
        Point3d p3 = new Point3d(1,1,1);

        System.out.println(Point3d.comparePoints(p1, p3));
        System.out.println(Lab1.computeArea(p1, p2, p3));

    }

    public static double computeArea(Point3d p1, Point3d p2, Point3d p3) {
        double hero, s, a, b, c;
        System.out.println("fuck");

        // todo => fix comparePoints function
        // Compare 2 points - return 0 if 2 points are equal
        if (Point3d.comparePoints(p1, p2) || Point3d.comparePoints(p1, p3) || Point3d.comparePoints(p2, p3)) {
            System.out.println("Some points are equal");

            return 0;
        }

        a = Point3d.distanceTo(p1, p2);
        b = Point3d.distanceTo(p2, p3);
        c = Point3d.distanceTo(p1, p3);

        System.out.println(p3.getX());

        s = (a + b + c) / 2;


        hero = (double) Math.sqrt(s * (s - a) * (s - b) * (s - c));

        return hero;
    }
}
