public class GeneradorPass {

    public String generaPassword(){

        char[] minusculas = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

        char[] mayusculas = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
                'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };

        char[] numeros = {'1','2','3','4','5','6','7','8','9','0'};

        //char signos[] = { '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '=', '+',
                //'[', ']', '{', '}', ';', ':', '\'', '\"', ',', '.', '<', '>', '/', '?' };

        StringBuilder gp = new StringBuilder();
        gp.append(minusculas);
        gp.append(mayusculas);
        gp.append(numeros);
        //gp.append(signos);

        StringBuilder pss = new StringBuilder();

        for (int i = 0; i  < 15; i++) {
            int cantidadCaracteres = gp.length();
            int numeroRandom = (int) (Math.random() * cantidadCaracteres);

            pss.append(gp.toString().charAt(numeroRandom));
        }

        return pss.toString();
    }
}
