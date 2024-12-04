package effets;

import bandeau.Bandeau;

public class EffetJeuDuPendu extends Effet {
    @Override
    public void executer(Bandeau bandeau) {
        System.out.println("Effet : Jeu Du Pendu");
        String message = bandeau.getMessage();
        StringBuilder affichage = new StringBuilder();

        // Initialiser l'affichage avec des tirets (ou un autre symbole)
        for (int i = 0; i < message.length(); i++) {
            affichage.append("_");  // Tirets pour chaque caractère
        }

        // Afficher le texte caractère par caractère
        for (int i = 0; i < message.length(); i++) {
            affichage.setCharAt(i, message.charAt(i));  // Remplacer le tiret par la lettre correspondante
            bandeau.setMessage(affichage.toString());
            bandeau.sleep(500);
        }
    }
}
