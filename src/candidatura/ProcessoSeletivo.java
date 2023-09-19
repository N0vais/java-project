package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        // esta selecao chama o metodo para rodar*/
       //imprimirSelecionados();
       //selecaoCandidatos();
       String [] candidatos = {"DANIEL", "FELIPE", "MARCOS", "PAULO", "MONICA"};
       for(String candidato: candidatos){
        entrandoEmContato(candidato);
       }
    }
    //metodo que faz a ligaçao//
    static void entrandoEmContato(String candidato){
        int tentativasRealizadas =1;
        boolean continuaTentando = true;
        boolean atendeu = false;

        //do faça pelo menos uma vez , se nao atender continua 
        do {
            atendeu = atender();
            continuaTentando = !atendeu;

            //se não atender ,continuar tentando incrementado com as tentativas// 
            if(continuaTentando)
                tentativasRealizadas++;
            else
                System.out.println("Contato realizado com sucesso ");    

        }while(continuaTentando && tentativasRealizadas < 3);

            if (atendeu)
                System.out.println("Consegumos contato com : " + candidato + " NA " + tentativasRealizadas + " tentativas ");
            else
                System.out.println("Não consegimos contato com : " + candidato + " , numero maximo de tentativas : " +  tentativasRealizadas + " realizadas ");
    }
    // metodo que axilia o atendimento//
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }
    //metodo para imprimir os candidatos selecionados*/
    static void imprimirSelecionados(){
        String [] candidatos ={"DANIEL", "FELIPE", "MARCOS", "PAULO", "MONICA"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for (int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato de n " + (indice+1) + " é o " + candidatos[indice]);
        }

        System.out.println("Forma abreviada de interação foi  for each " );

        for (String candidato: candidatos){
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    //metodo de seleçao dos candidatos*/
    static void selecaoCandidatos(){

        //esta é a lista de candidatos*/
        String [ ] candidatos = {"DANIEL", "FELIPE", "MARCIA", "JULIA", "PAULA", "AUGUSTO", "MONIQUE", "JOAO", "DIEGO", "DAYANE", "ALICE", "JAOPAULO","VITORIA"};
        
        int candidatosSelecionados = 0 ;
        int candidatosAtual = 0 ;
        double salarioBase = 2000.0;

        // while enquanto tiver candidatos na lista o while continua buscando*/
        while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();
            
            //syatem out imprimi o candidato e valor selecionado*/
            System.out.println("O candidato " + candidato + " > Solicitou este valor : " + salarioPretendido );

            //if verifica se o salario pedido e equivalente ao proposto pelo contratante*/
            if (salarioBase >= salarioPretendido){
                System.out.println("O candidato "+ candidato + " > foi selecionado para vaga : ");

                //esta parte é adicionada para pesquisar o proximo candidato Selecionado*/
                candidatosSelecionados++;
            }
            //esta parte é adicionada para pesquisar o proximo candidato */
            candidatosAtual++;
        }
    }

    static double valorPretendido(){

        // retorna salarios pretendidos aleatorios atravez de uma biblioteca chamada import java.util.concurrent.ThreadLocalRandom;*/
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato : ");
        }else if(salarioBase == salarioPretendido)
            System.out.println("Ligar para o candidato com contra prosposta : ");
        else{
            System.out.println("Aguardandoo o resultado dos demais candidatos : ");
        }
    }
}

