package reservation;

import Vol.Vol;
import client.Client;

public class ReservationFactory {
    public Reservation creerReservation(Vol vol, Client client) {
        return new Reservation(vol, client);
    }
}