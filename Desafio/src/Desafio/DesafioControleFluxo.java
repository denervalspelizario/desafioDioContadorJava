package Desafio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DesafioControleFluxo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Olá, digite o primeiro numero");
        int primeiroNumero = sc.nextInt();
        System.out.println("Olá, digite o primeiro numero");
        int segundoNumero = sc.nextInt();

        try {
            // metodo contar que recebe 2 parametro
            contar(primeiroNumero, segundoNumero);

        }catch(ParametrosInvalidosException e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

    }

    // Metodo Verificando se parâmetro 2 é valido
    static void contar(int numero01, int numero02) throws ParametrosInvalidosException {

        if(numero01 >= numero02){ // Parametro 1 nao pode ser maior que parametro 2 se for lancar erro
            throw new ParametrosInvalidosException();
        }

        int contagem = numero02 - numero01;
    }
}

