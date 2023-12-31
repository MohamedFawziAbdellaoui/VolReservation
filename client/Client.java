package client;

public class Client {
    private String nom;
    private String email;
    private String type;

    public Client(String nom, String email, String type) {
        this.nom = nom;
        this.email = email;
        this.type = type;
    }

    public String getNom() {
        return nom;
    }
}