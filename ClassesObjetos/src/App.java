public class App {
    public static void main(String[] args) throws Exception {
        Celular c1 = new Celular();
        c1.nome = "iPhone 11";
        c1.tamanhoDeTela = 6.1f;
        c1.armazenamento = 256;

        System.out.format("O nome do celular é %s! Possui %.1f polegadas com %d GB de armazenamento",
                c1.nome, c1.tamanhoDeTela, c1.armazenamento);
    }
}
