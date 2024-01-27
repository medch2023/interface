public class Utilisateur {
    private String nomUtilisateur;

    public Utilisateur(String nomUtilisateur) {
        this.nomUtilisateur = nomUtilisateur;
    }

    public String getNomUtilisateur() {
        return nomUtilisateur;
    }

    public void setNomUtilisateur(String nomUtilisateur) {
        this.nomUtilisateur = nomUtilisateur;
    }

    public void emprunterObjet(Empruntable objet){
        objet.emprunter();
    }
}
