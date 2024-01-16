public class Biblioteca {
    private Carte[] carti;
    private int nrCarti;
    private int ok=0;
    public Biblioteca(){
        this.carti=new Carte[100];
        this.nrCarti=0;
    }
    public void adaugaCarte(Carte carte){
        if(nrCarti==0){
            carti[nrCarti]=carte;
        }
        for(int i=0;i<nrCarti;i++){
            if(carte.getId()!=carti[i].getId()&&carte.getCopiiDisponibile()>0){
                ok=1;
            }
            if(carte.getId()==carti[i].getId()){
                ok=0;
                break;
            }
        }
        if(ok==1){
            carti[nrCarti]=carte;
        }
        nrCarti++;
    }
    public void afiseaza(){
        for(int i=0;i<nrCarti;i++)
            System.out.println(carti[i]);
    }
    int oko=0;
    public void gaseste(String titlu) {
        for (int i = 0; i < nrCarti; i++) {
            if (carti[i].getTitlu().equals(titlu)) {
                oko = 1;
                break;
            }
        }
        if (oko == 1) {
            System.out.println("Gasita");
        } else {
            System.out.println("Negasita");
        }
    }

}
