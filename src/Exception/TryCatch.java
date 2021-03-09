package Exception;

public class TryCatch {
    public static void main(String [] args) {

        String nome = null;

        try {
            nome.toUpperCase();

        } catch (NullPointerException e) {

            e.printStackTrace();

        } finally {
            nome = "Agora deu certo!";

            System.out.println(nome.toUpperCase());
        }
    }
}