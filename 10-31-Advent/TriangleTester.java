import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester {

  public static int countTrianglesA(String filename) {
    try {
      File newFile = new File (filename);
      Scanner input = new Scanner(newFile);

      int counter = 0;

      while (input.hasNextLine() && input.hasNextDouble()) {
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        if (isTriangle(a, b, c)) {
          counter++;
        }
      }
      input.close();
      return counter;
    }
    catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return -1;
    }
  }

  public static boolean isTriangle(double a, double b, double c) {
    return ((a + b > c) && (a + c > b) && (b + c > a));
  }

  public static int countTrianglesB(String filename) {
    try {
      File newFile = new File (filename);
      Scanner input = new Scanner (newFile);

      int counter = 0;

      while (input.hasNextLine() && input.hasNextDouble()) {
        double a1 = input.nextDouble();
        double b1 = input.nextDouble();
        double c1 = input.nextDouble();
        double a2 = input.nextDouble();
        double b2 = input.nextDouble();
        double c2 = input.nextDouble();
        double a3 = input.nextDouble();
        double b3 = input.nextDouble();
        double c3 = input.nextDouble();
        if (isTriangle(a1, a2, a3)) {
           counter++;
        }
        if (isTriangle(b1, b2, b3)) {
           counter++;
        }
        if (isTriangle(c1, c2, c3)) {
           counter++;
        }
      }
      return counter;
    }
    catch (FileNotFoundException ex) {
      System.out.println("File Not Found");
      return -1;
    }
  }

  public static void main(String[] args) {
    // test cases for isTriangle
    System.out.println(isTriangle(5, 10, 25));
    System.out.println(isTriangle(5, 100, 5));
    System.out.println(isTriangle(3, 4, 5));
    System.out.println(isTriangle(1, 1, 1));

    // countTrianglesA test
    // System.out.println(countTrianglesA("inputTri.txt"));

    // countTrianglesB test
    System.out.println(countTrianglesA("inputA.txt"));
  }
}
