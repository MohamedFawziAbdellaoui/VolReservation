package Vol;

import java.util.Date;

class Escale {
    private String aeroport;
    private Date heureDepart;
    private Date heureArrivee;

    public Escale(String aeroport, Date heureDepart, Date heureArrivee) {
        this.aeroport = aeroport;
        this.heureDepart = heureDepart;
        this.heureArrivee = heureArrivee;
    }
}