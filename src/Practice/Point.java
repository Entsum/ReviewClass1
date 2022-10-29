package Practice;

public class Point {
    int m_x, m_y;

    public Point(int x) {

        System.out.println("I am constructor");

    }


    public Point(int x, int y) {

        m_x = x;

        m_y = y;

    }

    public Point() {

    }

    public static void main(String args[])  {
        Point p = new Point();
    }
}
