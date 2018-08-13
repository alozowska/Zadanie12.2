import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Kolejka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.println("podaj liczbę");
        int liczba;
        Queue<Integer> liczby = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            System.out.println("podaj liczbę");
            liczba = scanner.nextInt();
            liczby.offer(liczba);
        }
        sumaLiczb(liczby);
    }

    public static void sumaLiczb(Queue<Integer> liczby) {
        int suma = 0;
        int i = 0;
        Iterator<Integer> iterator = liczby.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.print(next);
            i++;
            if (i < liczby.size()) {
                System.out.print("+");
            }
            suma = suma + next;
        }
        System.out.println("=" + suma);
    }
}


