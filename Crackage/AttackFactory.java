public class AttackFactory {
    
    public Attack getAttack(String attackType) {
        if (attackType == null) {
            return null;
        }
        if (attackType.equalsIgnoreCase("Brute force")) {
            return new BruteForce();
        } else if (attackType.equalsIgnoreCase("Dictionnaire")) {
            return new Dictionnaire();
        }
        return null;
    }
}
