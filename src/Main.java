import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> userNumbers = loadData();

        displayOperation(userNumbers);
        reverse(userNumbers);
        System.out.println("Maksymalna liczba to: " + maximal(userNumbers));
        System.out.println("Minimalna liczba to: " + minimal(userNumbers));

    }

    private static List<Integer> loadData() {
        List<Integer> listaLiczb = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Podaj liczbe: ");
            n = scanner.nextInt();
            if (n >= 0) {
                listaLiczb.add(n);
            }
        } while (n >= 0);
        return listaLiczb;
    }

    private static int sum(List<Integer> listaLiczb) {
        Set<Integer> nowySet = new HashSet<>(listaLiczb);
        Iterator<Integer> iter = nowySet.iterator();
        int sum = 0;
        for (int i = 0; i < listaLiczb.size(); i++) {
            sum = sum + iter.next();
        }
        return sum;
    }

    private static void reverse(List<Integer> listaLiczb) {
        System.out.println("Kolejnosc odwrotna:");
        for (int i = listaLiczb.size() - 1; i >= 0; i--) {
            System.out.println(listaLiczb.get(i));
        }
    }

    private static void displayOperation(List<Integer> listaLiczb) {
        int sum = sum(listaLiczb);
        Set<Integer> nowySet = new HashSet<>(listaLiczb);
        Iterator<Integer> iter = nowySet.iterator();
        for (int i = 0; i < nowySet.size(); i++) {
            if (i < nowySet.size() - 1) {
                System.out.print(iter.next() + " + ");
            } else {
                System.out.print(iter.next() + " = " + sum);
            }

        }
        System.out.println();
    }

    private static int maximal(List<Integer> listaLiczb) {
        TreeSet<Integer> pomocniczySet = new TreeSet<>(listaLiczb);
        return pomocniczySet.last();
    }

    private static int minimal(List<Integer> listaLiczb) {
        TreeSet<Integer> pomocniczySet = new TreeSet<>(listaLiczb);
        return pomocniczySet.first();
    }
}
