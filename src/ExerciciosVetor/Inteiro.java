
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

public class Inteiro {
    /*Crie um programa que leia 5 números inteiros,
armazene-os em um vetor e, ao final, mostre a soma
total e qual foi o maior número digitado.*/

    public static void main(String[] args) {
        ArrayList<Integer> vetor = new ArrayList<>();
        Scanner sfc = new Scanner(System.in);

        System.out.println("Digite 5 valores: ");
            
        addValor(vetor, sfc);

        somar(vetor);

        acharMaior(vetor);

    }

    private static void somar(ArrayList<Integer> vetor) {
        int sum = 0;
        for(Integer bernardo : vetor) {
            sum += bernardo;
        }
        System.out.println("Soma: " + sum);

    }

    private static void addValor(ArrayList<Integer> vetor, Scanner sfc) {
        for(int i = 0; i < 5; i++) {
            boolean burro = false;
            
            while(!burro) {
                try {
                int numero = sfc.nextInt();
                vetor.add(numero);
                burro = true;
                System.out.println("Valor adicionado: "+ vetor.get(i));
                } catch (InputMismatchException e) {
                    System.out.println("O valor não é valido.");
                    sfc.nextLine();
                }
            }
        
        } 
        
    }
    
    private static void acharMaior(ArrayList<Integer> vetor) {
        if(vetor.isEmpty()) return;
        
        int maior = vetor.get(0);
        
        for (int i = 1; i < vetor.size(); i++) {
            int atual = vetor.get(i);
            
            if(atual > maior) {
                maior = atual;
            }
        }
        
        System.out.println("O maior numero é: " + maior);
    }


}
