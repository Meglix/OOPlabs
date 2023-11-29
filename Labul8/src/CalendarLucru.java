public class CalendarLucru {
    private Zi[] zile;

    public CalendarLucru() {
        // Implicit, toate zilele sunt nelucratoare
        zile = new Zi[]{
                new Zi("Luni", true),
                new Zi("Marti", true),
                new Zi("Miercuri", true),
                new Zi("Joi", true),
                new Zi("Vineri", true),
                new Zi("Sambata", false),
                new Zi("Duminica", false)
        };
    }

    public Zi getZi(String numeZi) {
        for (int i = 0; i < zile.length; i++) {
            Zi zi = zile[i];
            if (zi.getNume().equalsIgnoreCase(numeZi)) {
                return zi;
            }
        }
        return null;
    }
}
