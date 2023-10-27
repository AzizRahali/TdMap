public class Main {
    public static void main(String[] args) {
        Enseignant enseignant1 = new Enseignant(1, "Aziz", "Rahali");
        Enseignant enseignant2 = new Enseignant(2, "Arij", "Arfaoui");

        EspritHashSet espritHashSet = new EspritHashSet();
        espritHashSet.ajouterEnseignant(enseignant1);
        espritHashSet.ajouterEnseignant(enseignant2);
        espritHashSet.displayEnseignants();

        System.out.println("Recherche 1 : " + espritHashSet.rechercherEnseignant(enseignant1));
        System.out.println("Recherche 3 : " + espritHashSet.rechercherEnseignant(3));

        EspritTreeSet espritTreeSet = new EspritTreeSet();
        espritTreeSet.ajouterEnseignant(enseignant2);
        espritTreeSet.displayEnseignants();

        System.out.println("Recherche 1 : " + espritTreeSet.rechercherEnseignant(enseignant1));
        System.out.println("Recherche 2 : " + espritTreeSet.rechercherEnseignant(2));
    }
}
