package compagnie;

import java.util.Observable;
import java.util.Observer;


public class ObservateurPlacesDisponibles implements Observer {
    private int placesDisponibles;

    public ObservateurPlacesDisponibles(int placesDisponibles) {
        this.placesDisponibles = placesDisponibles;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof Integer) {
            int nouvellesPlaces = (int) arg;
            if (nouvellesPlaces < placesDisponibles) {
                System.out.println("Mise à jour : Places disponibles réduites à " + nouvellesPlaces);
                placesDisponibles = nouvellesPlaces;
            }
        }
    }
}
