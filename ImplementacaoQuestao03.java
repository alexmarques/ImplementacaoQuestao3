/**
 * Created by Alex on 01/04/17.
 */
public class ImplementacaoQuestao03 {

    public static void main(String[] args) {

        StringStream ss = new StringStream("aAbBABacafeafe");

        // chars que devo ter controle para poder implementar a questao
        // criacão de variáveis
        char primeiro, segundo, terceiro;

        //inicialização de variáveis
        primeiro = segundo = terceiro = Character.UNASSIGNED;

        char charPadraoEncontrado = Character.UNASSIGNED;

        while(ss.hasNext()) {

            char next = ss.getNext();
            primeiro = segundo;
            segundo = terceiro;
            terceiro = next;

            if(isVogal(primeiro) && isConsoante(segundo) && isVogal(terceiro)) {
                if(terceiro == charPadraoEncontrado) {
                    charPadraoEncontrado =  Character.UNASSIGNED;
                } else {
                    charPadraoEncontrado = terceiro;
                }
            }
        }

        if(charPadraoEncontrado == Character.UNASSIGNED) {
            System.out.println("Nenhum padrão encontrado");
        } else {
            System.out.println("Padrão encontrado: " + charPadraoEncontrado);
        }
    }

    public static boolean isVogal(char c) {
        c = Character.toLowerCase(c);
        return "aeiou".indexOf(c) != -1;
    }

    public static boolean isConsoante(char c) {
        c = Character.toLowerCase(c);
        return "bcdfghjklmnpqrstvwxyz".indexOf(c) != -1;
    }
}