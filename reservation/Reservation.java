package reservation;

import Vol.Vol;
import client.Client;

public class Reservation {
    private Vol vol;
    private Client client;
    private boolean annulee;
    private boolean confirmee;

    public Vol getVol() {
        return vol;
    }

    public void setVol(Vol vol) {
        this.vol = vol;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public boolean isConfirmee() {
        return confirmee;
    }

    public void setConfirmee(boolean confirmee) {
        this.confirmee = confirmee;
    }

    public Reservation(Vol vol, Client client) {
        this.vol = vol;
        this.client = client;
        this.annulee = false;
        this.confirmee = false;
    }

    public void annulerReservation() {
        annulee = true;
    }

    public void confirmReservation() {
        confirmee = true;
    }

    public boolean isAnnulee() {
        return annulee;
    }

    public boolean isConfirmed() {
        return confirmee;
    }

}
