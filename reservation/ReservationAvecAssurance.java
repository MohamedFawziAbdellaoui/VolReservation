package reservation;

public class ReservationAvecAssurance extends ReservationDecorator {
    
    private boolean assuranceIncluse;

    public ReservationAvecAssurance(Reservation reservation) {
        super(reservation);
    }
    public ReservationAvecAssurance(Reservation reservation, boolean assuranceIncluse) {
        super(reservation);
        this.assuranceIncluse = assuranceIncluse;
    }

    public void inclureAssurance() {
        assuranceIncluse = true;
    }

    public boolean isAssuranceIncluse() {
        return assuranceIncluse;
    }
}
