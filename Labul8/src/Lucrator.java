public class Lucrator {
    private final String nume;
    private final CalendarLucru calendarLucru;
    public Lucrator(String nume, CalendarLucru calendarLucru) {
        this.nume = nume;
        this.calendarLucru = calendarLucru;
    }
    public void lucreaza(String zi) throws ExceptieZiNelucratoare {
        Zi ziuaCurenta = calendarLucru.getZi(zi);

        if (ziuaCurenta != null) {
            if (ziuaCurenta.esteLucratoare()) {
                System.out.println("Lucratorul " + nume + " lucreaza " + zi);
            } else {
                System.out.println(zi + " nu este o zi lucratoare");
                throw new ExceptieZiNelucratoare("Exceptie: lucru in zi nelucratoare");
            }
        }
    }
}
