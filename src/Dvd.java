public class Dvd implements Empruntable{
    private String titre;
    private String realisateur;
    private boolean emprunte;

    public Dvd(String titre, String realisateur, boolean emprunte) {
        this.titre = titre;
        this.realisateur = realisateur;
        this.emprunte = emprunte;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(String realisateur) {
        this.realisateur = realisateur;
    }

    public boolean isEmprunte() {
        return emprunte;
    }

    public void setEmprunte(boolean emprunte) {
        this.emprunte = emprunte;
    }

    @Override
    public void emprunter() {
        if (!emprunte) {
            emprunte = true;
            System.out.println("Le DVD :"+ titre + " a été emprunté.");
        } else {
            System.out.println("Le DVD :"+ titre + " est déjà emprunté.");
        }
    }

    @Override
    public void retourner() {
        if (emprunte) {
            emprunte = false;
            System.out.println("Le DVD :"+titre+" a été retourné.");
        } else {
            System.out.println("Le DVD :"+titre+" n'a pas été emprunté.");
        }
    }
}
