package effets;

import bandeau.Bandeau;

public class EffetZoom extends Effet {
    @Override
    public void executer(Bandeau bandeau) {
        String message = bandeau.getMessage();  // Récupérer le message à afficher

        // Afficher le nom de l'effet avant l'animation
        System.out.println("Effet : Zoom");

        // Afficher le message pendant l'animation
        bandeau.setMessage(message);

        // Appliquer un zoom (agrandissement)
        for (int i = 1; i <= 10; i++) {
            double scale = 1 + (i * 0.1); // Zoom progressif de 10% à chaque itération
            bandeau.setFont(bandeau.getFont().deriveFont(30 * (float) scale));  // Augmenter la taille de la police
            bandeau.sleep(50); // Attendre un peu entre chaque étape du zoom
        }

        // Rétablir la taille de police à sa valeur initiale
        bandeau.setFont(bandeau.getFont().deriveFont(30f)); // Remettre la taille initiale de la police

        // Rétablir le zoom (réduire à la taille initiale)
        for (int i = 10; i >= 1; i--) {
            double scale = 1 + (i * 0.1); // Réduction progressive du zoom
            bandeau.setFont(bandeau.getFont().deriveFont(30 * (float) scale));  // Réduire la taille de la police
            bandeau.sleep(50); // Attendre un peu entre chaque étape de réduction du zoom
        }
    }
}
