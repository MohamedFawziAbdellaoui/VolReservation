package Vol;

import java.util.Date;
import java.util.List;

public class VolFactory {
    public Vol creerVol(String aeroportDepart, String aeroportArrivee, Date heureDepart, Date heureArrivee, int nombrePlaces, List<Escale> escales) {
        return new Vol(aeroportDepart, aeroportArrivee, heureDepart, heureArrivee, nombrePlaces, escales);
    }

}