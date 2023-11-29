
public class Main {
    public static void main(String[] args) {
            // Crearea unui calendar de lucru
            CalendarLucru calendar = new CalendarLucru();

            // Crearea unui lucrator cu numele "rayan"
            Lucrator rayan = new Lucrator("rayan", calendar);

            try {
                // Pregatirea exemplului de rulare
                rayan.lucreaza("Luni");
                rayan.lucreaza("Marti");
                rayan.lucreaza("Miercuri");
                rayan.lucreaza("Duminia");
            } catch (ExceptieZiNelucratoare e) {
                System.out.println("Exceptie prinsa: " + e.getMessage());
            }

    }
}