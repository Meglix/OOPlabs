public class Ghiozdan {
    private static int nrmanual;
    private static int nrcaiet;
    Rechizita[] rechizita = new Rechizita[100];
    public int getnrmanual() {
        return nrmanual;
    }
    public int getnrcaiet() {
        return nrcaiet;
    }
    public int getnrrechizita() {
        return nrmanual + nrcaiet;
    }
    public void adauga(Rechizita a) {
        if (a.getClass() == Manual.class)
            adauga((Manual) a);
        else
            adauga((Caiet) a);
    }
    public void adauga(Caiet b) {
        rechizita[nrcaiet++ + nrmanual] = b;
    }
    public void adauga(Manual m) {
        rechizita[nrmanual++ + nrcaiet] = m;
    }
    public void printelem() {
        for (int i = 0; i < nrcaiet + nrmanual; i++)
            System.out.println(rechizita[i].getNume());
    }

    public void listManual() {
        for (int i = 0; i < nrcaiet + nrmanual; i++)
            if (rechizita[i].getClass() == Manual.class)
                System.out.println(rechizita[i].getNume());
    }
    public void listCaiet() {
        for (int i = 0; i < nrcaiet + nrmanual; i++)
            if (rechizita[i].getClass() == Caiet.class)
                System.out.println(rechizita[i].getNume());
    }
}