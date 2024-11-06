import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        boolean x = true;
        try {
            do {
                System.out.println();
                System.out.println("1- testBook()");
                System.out.println("2- testMovie()");
                System.out.println("3- testMovablePoint()");
                System.out.println("please input number of method to test it or zero to exit");
                System.out.println();
                int n = sc.nextInt();

                switch (n) {
                    case 0:
                        System.out.println("Goodbye!");
                        break;
                    case 1:
                        testBook();
                        break;
                    case 2:
                        testMovie();
                        break;
                    case 3:
                        testMovablePoint();
                        break;

                    default:
                        System.out.println("Invalid input");
                }
            } while (x);
        } catch (Exception e) {
            System.out.println();
            System.out.println("please input number of method to test it or zero to exit");
        }


    }



    public static void testBook() {
        Book myBook2 = new Book("Java", 300, "hussam");

        System.out.println("Book Name: " + myBook2.getName());
        System.out.println("Book Price: " + myBook2.getPrice());
        System.out.println("Book Author: " + myBook2.getAuthor());
        System.out.println("Book Price  Discount: " + myBook2.getDiscount());

        myBook2.setName("PHP");
        myBook2.setPrice(1000);
        myBook2.setAuthor("Alsaedi");

        System.out.println("\n ---------- Data after update  ---------- \n");
        System.out.println("New Book Name: " + myBook2.getName());
        System.out.println("New Book Price: " + myBook2.getPrice());
        System.out.println("new Book Author: " + myBook2.getAuthor());
        System.out.println("Price Book Discount: " + myBook2.getDiscount());
    }

    public static void testMovie() {
        Movie myMovie1 = new Movie("Inception", 3000, " Christopher Nolan");

        System.out.println("Movie Name: " + myMovie1.getName());
        System.out.println("Movie Price: " + myMovie1.getPrice());
        System.out.println("Movie Director: " + myMovie1.getDirector());
        System.out.println("Movie Price  Discount: " + myMovie1.getDiscount());

        myMovie1.setName("The new movie");
        myMovie1.setPrice(1000);
        myMovie1.setDirector("ahmed");
        System.out.println("\n ---------- Data after update  ---------- \n");
        System.out.println("New Movie Name: " + myMovie1.getName());
        System.out.println("New Movie Price: " + myMovie1.getPrice());
        System.out.println("New Movie Director: " + myMovie1.getDirector());
        System.out.println("Price Movie Discount: " + myMovie1.getDiscount());
    }

    public static void testMovablePoint() {
        MovablePoint mPoint = new MovablePoint(20,6,220,120);


        System.out.println("x= "+mPoint.getX());
        System.out.println("y= "+mPoint.getY());
        System.out.println("xSpeed= "+mPoint.getxSpeed());
        System.out.println("ySpeed= "+mPoint.getySpeed());
        mPoint.moveUp();
        mPoint.moveDown();
        mPoint.moveLeft();
        mPoint.moveRight();

        System.out.println("\n ---------- Data after update  ---------- \n");

        mPoint.setX(100);
        mPoint.setY(200);
        mPoint.setxSpeed(10);
        mPoint.setySpeed(20);
        System.out.println("x= "+mPoint.getX());
        System.out.println("y= "+mPoint.getY());
        System.out.println("xSpeed= "+mPoint.getxSpeed());
        System.out.println("ySpeed= "+mPoint.getySpeed());
        mPoint.moveUp();
        mPoint.moveDown();
        mPoint.moveLeft();
        mPoint.moveRight();



    }
}