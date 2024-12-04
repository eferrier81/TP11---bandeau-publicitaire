package exemple;

import bandeau.Bandeau;
import effets.*;

public class Main {
    public static void main(String[] args) {
        // Créer un objet Bandeau
        Bandeau bandeau = new Bandeau();

        // Définir le message à afficher
        bandeau.setMessage("Enzo Ferrier");

        // Créer un scénario avec différents effets
        Scenario scenario = new Scenario();

        // Ajouter des effets au scénario avec leurs répétitions
        scenario.ajouterEffet(new EffetClignotant(), 5);
        scenario.ajouterEffet(new EffetZoom(), 1);
        scenario.ajouterEffet(new EffetCouleurs(new java.awt.Color[]{java.awt.Color.RED, java.awt.Color.GREEN, java.awt.Color.BLUE}), 1);
        scenario.ajouterEffet(new EffetMiroir(), 1);
        scenario.ajouterEffet(new EffetJeuDuPendu(), 1);
        scenario.ajouterEffet(new EffetRotation(), 1);
        scenario.ajouterEffet(new EffetTeletype(), 1);

        // Exécuter le scénario
        scenario.executer(bandeau);
    }
}


