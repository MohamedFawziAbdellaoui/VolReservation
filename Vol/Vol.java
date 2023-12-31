package Vol;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Vol {
    private String aeroportDepart;
    private String aeroportArrivee;
    private Date heureDepart;
    private Date heureArrivee;
    private List<Escale> escales;
    private int nombrePlaces;

    public Vol(String aeroportDepart, String aeroportArrivee, Date heureDepart, Date heureArrivee, int nombrePlaces, List<Escale> escales) {
        this.aeroportDepart = aeroportDepart;
        this.aeroportArrivee = aeroportArrivee;
        this.heureDepart = heureDepart;
        this.heureArrivee = heureArrivee;
        this.nombrePlaces = nombrePlaces;
        this.escales = escales != null ? escales : new ArrayList<>();
    }

    public void ajouterEscale(Escale escale) {
        escales.add(escale);
    }

    public void retirerEscale(Escale escale) {
        escales.remove(escale);
    }

    public int getNombrePlacesDisponibles() {
        // Logique pour calculer le nombre de places disponibles
        return nombrePlaces - escales.size();
    }

    public boolean verifierDisponibilite() {
        // Logique pour vérifier la disponibilité du vol
        return getNombrePlacesDisponibles() > 0;
    }
}