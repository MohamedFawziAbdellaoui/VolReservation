package compagnie;

import java.util.ArrayList;
import java.util.List;

import Vol.Vol;

public class CompagnieAerienne {
    private List<Vol> vols;

    public CompagnieAerienne() {
        this.vols = new ArrayList<>();
    }

    public void ajouterVol(Vol vol) {
        vols.add(vol);
    }

    public void retirerVol(Vol vol) {
        vols.remove(vol);
    }
}
