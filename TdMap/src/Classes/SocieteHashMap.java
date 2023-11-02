package Classes;

import java.util.HashMap;
import java.util.Map;

class SocieteHashMap implements InterfaceSociete {
    private Map<Employe, Departement> employeDepartementMap = new HashMap<>();

    @Override
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        employeDepartementMap.put(e, d);
    }

    @Override
    public void supprimerEmploye(Employe e) {
        employeDepartementMap.remove(e);
    }

    @Override
    public void afficherLesEmployesLeursDepartements() {
        for (Map.Entry<Employe, Departement> entry : employeDepartementMap.entrySet()) {
            System.out.println(entry.getKey() + " travaille dans le département " + entry.getValue());
        }
    }

    @Override
    public void afficherLesEmployes() {
        for (Employe e : employeDepartementMap.keySet()) {
            System.out.println(e);
        }
    }

    @Override
    public void afficherLesDepartements() {
        for (Departement d : employeDepartementMap.values()) {
            System.out.println(d);
        }
    }

    @Override
    public void afficherDepartement(Employe e) {
        if (rechercherEmploye(e)) {
            Departement d = employeDepartementMap.get(e);
            System.out.println(e + " travaille dans le département " + d);
        }
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        return employeDepartementMap.containsKey(e);
    }

    @Override
    public boolean rechercherDepartement(Departement d) {
        return employeDepartementMap.containsValue(d);
    }
}
