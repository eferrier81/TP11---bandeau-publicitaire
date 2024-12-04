package effets;

import bandeau.Bandeau;

public class EffetRotation extends Effet {
    @Override
    public void executer(Bandeau bandeau) {
        System.out.println("Effet : Rotation");
        String message = bandeau.getMessage();

        // Rotation de 360 degrés
        for (int i = 0; i < 360; i++) {
            bandeau.setRotation(i);  // Faire tourner le texte
            bandeau.setMessage(message);
            bandeau.sleep(10);
        }

        // Revenir à la position initiale (rotation à 0)
        bandeau.setRotation(0);
    }
}
