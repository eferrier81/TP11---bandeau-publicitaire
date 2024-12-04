package effets;

import bandeau.Bandeau;
import java.awt.Color;

public class EffetCouleurs extends Effet {
    private final Color[] couleurs;

    public EffetCouleurs(Color[] couleurs) {
        this.couleurs = couleurs;
    }

    @Override
    public void executer(Bandeau bandeau) {
        System.out.println("Effet : Changement de Couleurs");
        String message = bandeau.getMessage();

        // Sauvegarder la couleur de base du texte
        Color couleurInitiale = bandeau.getForeground();

        // Appliquer les couleurs dans l'ordre
        for (Color couleur : couleurs) {
            bandeau.setForeground(couleur);  // Changer la couleur du texte
            bandeau.setMessage(message);  // Réafficher le message
            bandeau.sleep(500);
        }

        // Revenir à la couleur de base
        bandeau.setForeground(couleurInitiale);
        bandeau.setMessage(message);  // Réafficher le message avec la couleur initiale
    }
}
