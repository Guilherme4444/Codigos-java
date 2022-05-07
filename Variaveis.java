public class Variaveis {

    public static void main(String[] args) {
        //NUMEROS INTEIROS
        int idade = 20;
        long idade02 = 22;
        
        //DENTRO DE ''ASPAS'', PODE-SE USAR QUALQUER ***SEQUENCIA*** CARACTERES (EX = 1234ABC)
        String nome = "Irineu";
        
        //VALORES QUEBRADOS(COM VIRGULA)
        double valorPassagem = 2.90;
        float valorCebola = 1.90f;

        //DENTRO DE ''ASPAS'', PODE-SE USAR UM CONJUNTO DE CARACTERES' (EX = 123-ABC-00)
        char o = 'o';
        char i = 'i';
        char interrogacao = 0x00E1;




        System.out.println("Idade = " + idade);
        System.out.println("Idade 02 = " + idade02);
        System.out.println("Nome = " + nome);
        System.out.println("Valor da passagem = " + valorPassagem);
        System.out.println("Valor da cebola = " + valorCebola);
        System.out.println("" + o + i + interrogacao);

    }
}
