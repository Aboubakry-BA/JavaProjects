public class Point {
    private int Abscisse;
    private int Origine;

    public Point(int vAbscisse) {
        Abscisse = vAbscisse;
        Origine = 0;
    };

    public void Affiche(){
        System.out.println("L’abscisse de l’origine courante est "+getOrigine());
        int abs = (this.Abscisse - getOrigine());
        System.out.println("L’abscisse du point par rapport à cette origine est "+abs);
        System.out.println();
    }

    public void setOrigine(int vOrigine) {
        this.Origine = vOrigine;
    }
    public int getOrigine(){
        return this.Origine;
    }   
}