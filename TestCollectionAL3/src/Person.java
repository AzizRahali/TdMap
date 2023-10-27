public class Person {
    private int id;
    private int age;
    private String nom;
    private String prenom;

    public Person() {
    }

    public Person(int id, int age, String nom, String prenom) {
        this.id = id;
        this.age = age;
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Personne{" +
                "id=" + id +
                ", age=" + age +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object obj) {
        if(obj==this)
            return true;
        if(obj==null)
            return false;
        if(obj.getClass()!=this.getClass())
            return false;
        Person pe = (Person) obj;
        if(pe.id == id && pe.nom==nom && pe.prenom==prenom && pe.age == age)
            return true;
        return false;
    }
}