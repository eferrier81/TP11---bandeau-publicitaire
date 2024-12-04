package effets;

import bandeau.Bandeau;

public class EffetClignotant extends Effet {
    @Override
    public void executer(Bandeau bandeau) {
        System.out.println("Effet : Clignotant");
        String message = bandeau.getMessage();  // Récupérer le message à afficher

        // Effectuer le clignotement
        bandeau.setMessage("");  // Effacer le message
        bandeau.sleep(500);
        bandeau.setMessage(message);  // Réafficher le message
        bandeau.sleep(500);
    }
}
