import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe elementów tablicy:");
        
        int n = scanner.nextInt();
      int[] tablica = new int[n];
      System.out.println("Wprowadź liczby cakowite do tablicy");
        
      for (int i = 0; i < n; i++) {
          tablica[i] = scanner.nextInt();
      }
        
        System.out.println("Tablica przed odwróceniem: " + Arrays.toString(tablica));
                for (int i = 0; i < n / 2; i++) {
                    int temp = tablica[i];
                    tablica[i] = tablica[n - 1 - i];
                    tablica[n - 1 - i] = temp;
                }
        
              System.out.println("Tablica po odwróceniu: " + Arrays.toString(tablica));
          }
      }
