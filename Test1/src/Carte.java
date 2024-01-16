public class Carte {
    private String titlu;
    private Autor autor;

    private int id;
    private int copiiDisponibile;
    //constructor cu parametrii
    public  Carte(String titlu,Autor autor,int id,int copiiDisponibile){
        this.titlu=titlu;
        this.autor=autor;
        this.id=id;
        this.copiiDisponibile=copiiDisponibile;
    }
    //constructor fara parametrii
    public Carte(){
        this.titlu="";
        this.autor=new Autor();
        this.id=0;
        this.copiiDisponibile=0;
    }
    public int getId(){
        return id;
    }
    public Autor getAutor() {
        return autor;
    }
    public String getTitlu(){
        return titlu;
    }
    public int getCopiiDisponibile(){
        return copiiDisponibile;
    }
    public void setId(){
        this.id=id;
    }
    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCopiiDisponibile(int copiiDisponibile) {
        this.copiiDisponibile = copiiDisponibile;
    }
    public String toString(){
        return "Carte: "+getTitlu()+" "+autor.getVarsta()+" "+getId()+" "+getCopiiDisponibile();
    }

}
