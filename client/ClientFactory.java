package client;

public class ClientFactory {
    public Client creerClient(String nom, String email, String type) {
        return new Client(nom, email, type);
    }

}