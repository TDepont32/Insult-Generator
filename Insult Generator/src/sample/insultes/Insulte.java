package sample.insultes;

public class Insulte {
    private String determinant;
    private String adjectif;
    private String nom;

    public Insulte(){
        determinant = "you";
        adjectif ="";
        nom = "";
    }
    public Insulte(String adj, String nm){
        determinant = "you";
        adjectif =adj;
        nom = nm;
    }

    public void setNom(String nm){
        nom = nm;
    }
    public void setAdjectif(String adj){ adjectif=adj; }
    public String toString(){
        String retour= determinant;
        retour+=" ";
        retour += adjectif;
        retour +=" ";
        retour +=nom;
        return retour;

    }

}
