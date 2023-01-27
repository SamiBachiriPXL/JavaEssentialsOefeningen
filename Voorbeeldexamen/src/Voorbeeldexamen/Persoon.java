package Voorbeeldexamen;

public abstract class Persoon {
        private String id;
        private String naam;

    public Persoon(String id, String naam) {
        StringBuilder new_id = new StringBuilder();
        for (int i=0; i<id.length() && new_id.length()<3; i++){
            if ((id.charAt(i) >= 'A' && id.charAt(i) <= 'Z') ||
                    (id.charAt(i) >= 'a' && id.charAt(i) <= 'z') ||
                    (id.charAt(i) >= '0' && id.charAt(i) <= '9')) {
                new_id.append(id.charAt(i));
            }
        }
        this.id = new_id.toString().toUpperCase();
        this.naam = naam;
    }

    public String getId() {
        return id;
    }

    public String getNaam() {
        return naam;
    }

    public String toString(){
        return "[" + id + "]" + " " + naam;
    }
}
