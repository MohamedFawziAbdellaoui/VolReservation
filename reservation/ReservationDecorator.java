package reservation;


public abstract class ReservationDecorator extends Reservation {
    private Reservation reservation;

    public ReservationDecorator(Reservation reservation) {
        super(reservation.getVol(), reservation.getClient());
        this.reservation = reservation;
    }

    @Override
    public void confirmReservation() {
        reservation.confirmReservation();
    }

    @Override
    public boolean isConfirmed() {
        return reservation.isConfirmed();
    }

}
