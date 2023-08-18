package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo seletivo");
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};
        for (String candidato: candidatos ) {
            entrandoEmContato(candidato);
        }

    }
    // metodos

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender(); // verifica com o metodo atender que retorna boolean
            continuarTentando = !atendeu; // recebe valor atendeu invertido
            if(continuarTentando){
                tentativasRealizadas++;
            } else {
                System.out.println("Contato realizado");
            }
        }while(continuarTentando && tentativasRealizadas < 3); // faca enquanto continuar for true e tentativas for menor que 3

        if(atendeu){
            System.out.println("Conseguimos contato com " + candidato + " NA " + tentativasRealizadas);
        } else {
            System.out.println("Não conseguimos contato com " + candidato + " Número maximo tentativas " + tentativasRealizadas + "Realizada");
        }
    }
    static boolean atender(){ // metodo gera um numero aleatorio de 0 - 3 e se esse numero for 1 retorna true se fora 0, 2 ou 3 da false
        return new Random().nextInt(3) == 1;
    }
    // Metodos

    static void imprimirSelecionados(){
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};
        System.out.println("imprimindo a lista de candidatos informando o indice do elemento");
        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("O candidato de n " + (i + 1) + " é " + candidatos[i]);
        }

    }

    static void selecaoCandidatos() {
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("o candidato " + candidato + " Solicitou este valor de salário " + salarioPretendido);
            if (salarioBase > salarioPretendido) {
                System.out.println("o candidato " + candidato + " foi selecionando para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200); // cria numeros aleatorios entre 1800 a 2200
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato!!");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta");
        } else {
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }
}
