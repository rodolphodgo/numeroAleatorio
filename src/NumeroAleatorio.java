import java.util.Random;
public class NumeroAleatorio {
    public static void main(String[] args) {

        Random random = new Random();

        int numeroAleatorio = random.nextInt(100);
        int numeroDigitado = 0;

        //System.out.println(numeroAleatorio);

        while (numeroAleatorio != numeroDigitado) {

            System.out.print("Advinhe o número inteiro entre 0 e 100: ");
            numeroDigitado = Integer.parseInt(System.console().readLine());

            if (numeroDigitado > 100 || numeroDigitado < 0)
                System.out.println("Número fora da escala. Digite um valor inteiro entre 0 e 100.");
            else if (numeroAleatorio > numeroDigitado)
                System.out.println("Número digitado é menor, tente mais uma vez.");
            else if (numeroAleatorio < numeroDigitado)
                System.out.println("Número digitado é maior, tente mais uma vez.");
            else
                System.out.println("Parabéns! Você acertou o número!");
        }

        //System.out.println("Número inteiro aleatório de 0 até 100: " + numeroAleatorio);
    }
}
