public class Main {
    public static void main(String[] args) {
        Rettangolo nientePitagora = new Rettangolo(5, 12);
        Triangolo hoDiviso = new Triangolo(3.6, 1.2);

        System.out.println(nientePitagora.calcolaArea());
        System.out.println(hoDiviso.calcolaArea());
    }
}