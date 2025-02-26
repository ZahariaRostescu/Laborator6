package laborator6;

import java.time.LocalDate;

public class Angajat {
    private String nume;
    private String postul;
    private LocalDate dataAngajarii;
    private float salariul;

    public Angajat(String nume, String postul, LocalDate dataAngajarii, float salariul) {
        this.nume = nume;
        this.postul = postul;
        this.dataAngajarii = dataAngajarii;
        this.salariul = salariul;
    }

    public Angajat() {
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPostul() {
        return postul;
    }

    public void setPostul(String postul) {
        this.postul = postul;
    }

    public LocalDate getDataAngajarii() {
        return dataAngajarii;
    }

    public void setDataAngajarii(LocalDate dataAngajarii) {
        this.dataAngajarii = dataAngajarii;
    }

    public float getSalariul() {
        return salariul;
    }

    public void setSalariul(float salariul) {
        this.salariul = salariul;
    }

    @Override
    public String toString()
    {
        return "Nume: " + nume + "\n" +
                "Post: " + postul + "\n" +
                "Data angajarii: " + dataAngajarii + "\n" +
                "Salariu: " + salariul + "\n";
    }

    public int compareTo(Angajat b)
    {
        if (salariul < b.salariul)
        {
            return -1;
        }
        if (salariul == b.salariul)
        {
            return 0;
        }
        return 1;
    }
}
