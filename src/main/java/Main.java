import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] numbers = new int[5];
    System.out.println("Podaj liczbe");
    for(int i = 0; i < 5; i++){
      numbers[i] = scanner.nextInt();
    }
    int min = numbers[0];
    for(int i = 1; i < 5; i++){
      if(numbers[i] < min){
        min = numbers[i];
      }
    }
    System.out.println("Najmniejsza liczba to: " + min);
  }
}