public class Main {
    public static void main(String[] args) {
        GeneradorPass np = new GeneradorPass();
        System.out.println("Password generado: ");
        System.out.println("****************************************");
        System.out.println(np.generaPassword());
        System.out.println("****************************************");

    }
}