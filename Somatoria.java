public class Somatoria {
    public static void main(String[] args) {
        int n = 10;
        int soma = 0;
        for (int i = 1; i <= n; i++) {
            soma += i;
        }
        System.out.println("A somatória de 1 a " + n + " é: " + soma);
    }
}