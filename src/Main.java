import java.util.*;

public class Main {

    public static void main(String[] args) {

        displayOperation(loadData());
        reverse(loadData());
        maximal(loadData());
        minimal(loadData());

    }

    private static List loadData() {
        List<Integer> listaLiczb = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Podaj liczbe: ");
            n = scanner.nextInt();
            if (n > 0) {
                listaLiczb.add(n);
            }
        } while (n > 0);
        return listaLiczb;
    }

    private static int sum(List listaLiczb) {
        Set<Integer> nowySet = new HashSet<>(listaLiczb);
        Iterator<Integer> iter = nowySet.iterator();
        int sum = 0;
        for (int i = 0; i < listaLiczb.size(); i++) {
            sum = sum + iter.next();
        }
        return sum;
    }

    private static void reverse(List listaLiczb) {
        for (int i = listaLiczb.size() - 1; i >= 0; i--) {
            System.out.println(listaLiczb.get(i));
        }
    }

    private static void displayOperation(List listaLiczb) {
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
    }

    private static int maximal(List listaLiczb) {
        Set<Integer> nowySet = new HashSet<>(listaLiczb);
        TreeSet<Integer> pomocniczySet = new TreeSet<>(nowySet);
        return pomocniczySet.last();
    }

    private static int minimal(List listaLiczb) {
        Set<Integer> nowySet = new HashSet<>(listaLiczb);
        TreeSet<Integer> pomocniczySet = new TreeSet<>(nowySet);
        return pomocniczySet.first();
    }
}
