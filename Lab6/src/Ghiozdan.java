import java.util.Arrays;

public class Ghiozdan {
    Rechizita[] rechizite=new Rechizita[100];
    private int nrManuale=0;
    private int nrCaiete=0;

    public void add(Rechizita r){
        if(r.getClass()==Caiet.class)
            addCaiet((Caiet) r);
        else
            addManual((Manual)r);
    }
    public void addCaiet(Caiet rechizita){
        rechizite[nrCaiete++ + nrManuale]=rechizita;
    }
    public void addManual(Rechizita rechizita){
        rechizite[nrCaiete + nrManuale++]=rechizita;
    }
    public void listItems() {
        for (int i = 0; i < nrCaiete + nrManuale; i++)
            System.out.println(rechizite[i].getNume());
    }

    public void listManual() {
        for (int i = 0; i < nrCaiete + nrManuale; i++)
            if (rechizite[i].getClass() == Manual.class)
                System.out.println(rechizite[i].getNume());
    }

    public void listCaiet() {
        for (int i = 0; i < nrCaiete + nrManuale; i++)
            if (rechizite[i].getClass() == Caiet.class)
                System.out.println(rechizite[i].getNume());
    }
    public int getNrManuale() {
        return nrManuale;
    }

    public int getNrCaiete() {
        return nrCaiete;
    }
}
