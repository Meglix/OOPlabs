public class Autor {
    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    private String nume;
    private String prenume;
    private int varsta;

    public Autor(String nume,String prenume,int varsta){
        this.nume=nume;
        this.prenume=prenume;
        this.varsta=varsta;
    }
    public Autor(){
        this.nume="ab";
        this.prenume="sa";
        this.varsta=20;
    }
    public String toString(){
        return "Autor "+nume+" "+prenume+" "+varsta;
    }
}
