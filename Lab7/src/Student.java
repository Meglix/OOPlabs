public class Student implements Cloneable{
    String nume;
    String prenume;
    Masina masina;

    public Student(String nume, String prenume, Masina masina) {
        this.nume = nume;
        this.prenume = prenume;
        this.masina = masina;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", masina=" + masina +
                '}';
    }
    //shallow copy
    public Student clone(){
        try {
            Student clone=(Student) super.clone();
            clone.masina= masina.clone();
            return clone;
        }
        catch (CloneNotSupportedException e){
            throw new AssertionError();
        }
    }

}
