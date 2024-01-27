public class Livres implements Empruntable{
    private String titre;
    private String auteur;
    private boolean emprunte;

    public Livres(String titre, String auteur, boolean emprunte) {
        this.titre = titre;
        this.auteur = auteur;
        this.emprunte = emprunte;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public boolean isEmprunte() {
        return emprunte;
    }

    public void setEmprunte(boolean emprunte) {
        this.emprunte = emprunte;
    }

    @Override
    public void emprunter() {

    }

    @Override
    public void retourner() {

    }
}
