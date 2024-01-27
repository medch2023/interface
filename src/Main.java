public class Main {
    public static void main(String[] args) {

        Dvd d = new Dvd("Tom and jerry" ,"Jack",true);
        Livres l = new Livres("Condide","Ahmed",false);

        d.emprunter();
        d.retourner();
    }
}