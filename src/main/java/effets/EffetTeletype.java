package effets;

import bandeau.Bandeau;

public class EffetTeletype extends Effet {
    @Override
    public void executer(Bandeau bandeau) {
        System.out.println("Effet : Teletype");
        String message = bandeau.getMessage();

        for (int i = 0; i < message.length(); i++) {
            bandeau.setMessage(message.substring(0, i + 1));  // Afficher le texte caractère par caractère
            bandeau.sleep(150);
        }
    }
}
