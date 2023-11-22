public class TestGhiozdan {
    public static void main(String[] args) {
        Ghiozdan ghiozdan = new Ghiozdan();
        ghiozdan.adauga(new Manual("Romana"));
        ghiozdan.adauga(new Manual("Mate"));
        ghiozdan.adauga(new Manual("Istorie"));
        ghiozdan.adauga(new Manual("Geografie"));
        ghiozdan.adauga(new Caiet("Engleza"));
        ghiozdan.adauga(new Caiet("Franceza"));
        ghiozdan.adauga(new Caiet("Germana"));
        ghiozdan.adauga(new Caiet("Japoneza"));
        Rechizita rechizita1 = new Manual("Limbi moderne");
        ghiozdan.adauga(rechizita1);
        ghiozdan.printelem();
    }
}