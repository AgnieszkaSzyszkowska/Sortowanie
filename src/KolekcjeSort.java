import java.util.*;

public class KolekcjeSort {

    public static void przekazParametry(Osoba o) {
        System.out.println("Podaj imię: ");
        o.setImie(getUserInput());
        System.out.println("Podaj nazwisko: ");
        o.setNazwisko(getUserInput());
        System.out.println("Podaj wiek: ");
        o.setWiek(Integer.parseInt(getUserInput()));
        System.out.println("Podaj wagę: ");
        o.setWaga(Double.parseDouble(getUserInput()));
        System.out.println("Podaj wzrost: ");
        o.setWzrost(Integer.parseInt(getUserInput()));
    }


    private static Comparator<Osoba> imieOrder = (Osoba o1, Osoba o2) -> o2.getImie().compareTo(o1.getImie());

    private static Comparator<Osoba> wiekOrder = new Comparator<Osoba>() {
        @Override
        public int compare(Osoba o1, Osoba o2) {
            return Integer.compare(o2.getWiek(), (o1.getWiek()));
        }
    };
    private static final Comparator<Osoba> wzrostOrder = new Comparator<Osoba>() {
        @Override
        public int compare(Osoba o1, Osoba o2) {
            return Integer.compare(o2.getWzrost(), (o1.getWzrost()));
        }
    };
    private static final Comparator<Osoba> wagaOrder = new Comparator<Osoba>() {
        @Override
        public int compare(Osoba o1, Osoba o2) {
            return Double.compare(o2.getWaga(), (o1.getWaga()));
        }
    };


    public static void main(String[] args) {

        List<Osoba> osoby = new ArrayList<>();
        System.out.println("Dodajmy 3 osoby do listy w uproszczonej wersji");

        Osoba o1 = new Osoba();
        przekazParametry(o1);
        Osoba o2 = new Osoba();
        przekazParametry(o2);
        Osoba o3 = new Osoba();
        przekazParametry(o3);

        osoby.add(o1);
        osoby.add(o2);
        osoby.add(o3);

        System.out.println("Wybierz rodzaj sortowania: 1-wg nazwiska, 2-wg imienia, 3-wg wieku, 4-wg wagi, 5-wg wzrostu. Właściwy numer zatwierdź Enterem.");
        String userInput = getUserInput();
        switch (userInput) {
            case "1":
                Collections.sort(osoby);
                Collections.sort(osoby, Collections.reverseOrder());
                break;
            case "2":
                Collections.sort(osoby, imieOrder);
                Collections.sort(osoby, Collections.reverseOrder());
                break;
            case "3":
                Collections.sort(osoby, wiekOrder);
                System.out.println("Najstarsza osoba to: " + osoby.get(0));
                break;
            case "4":
                Collections.sort(osoby, wagaOrder);
                System.out.println("Najcięższa osoba to: " + osoby.get(0));
                break;
            case "5":
                Collections.sort(osoby, wzrostOrder);
                System.out.println("Najwyższa osoba to: " + osoby.get(0));
                break;

        }
        System.out.println(osoby);
    }

    private static Scanner sc = new Scanner(System.in);

    private static String getUserInput() {
        return sc.nextLine().trim();
    }

}
