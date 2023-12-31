package reservation;

import Vol.Vol;
import client.Client;

public class Reservation {
    private Vol vol;
    private Client client;
    private boolean estConfirmee;

    public Reservation(Vol vol, Client client) {
        this.vol = vol;
        this.client = client;
    }

    public void confirmerReservation() {
        if (vol.verifierDisponibilite()) {
            estConfirmee = true;
        } else {
            // Gérer le cas où la réservation ne peut pas être confirmée
        }
    }

    public void annulerReservation() {
        estConfirmee = false;
    }

    // ... (autres méthodes nécessaires)
}