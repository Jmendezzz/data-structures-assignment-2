import java.util.Scanner;

public class Rectangulo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while(true){
      System.out.println("Ingrese la base del rectangulo");
      int base = sc.nextInt();
      System.out.println("Ingrese la altura del rectangulo");
      int height = sc.nextInt();
      System.out.println(buildRectangle(base,height));
    }
  }
  
  public static String buildRectangle(int base, int height){
    String rectangle="";
    if(height == 0){
      return "";
    }
    rectangle = rectangle +  buildLine(base) + "\n" +  buildRectangle(base, height-1);
    return rectangle;
  }

  public  static  String buildLine(int quantity){
    String line = "";
    for(int i=0; i<quantity; i++){
      line += "*";
    }
    return line;
  }
}
