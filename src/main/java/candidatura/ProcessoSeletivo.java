package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class ProcessoSeletivo {

    double salarioBase = 2000.0;


    public String [] selecaoCandidato (String[] candidato){

        int candidatosChamados = 0;
        int candidatoAtual = 0;
        String[] candidatosSelecionadosNoProcesso= {"Vazio", "Vazio", "Vazio", "Vazio", "Vazio",};

        while (candidatosChamados < 5 && candidatoAtual < candidato.length){
            System.out.println("O candidato " + candidato[candidatoAtual] + " solicitou este valor de salário: " + valorPretendidoRandom());
            if(salarioBase >= valorPretendidoRandom()){
                System.out.println("O candidato " + candidato[candidatoAtual] + " foi selecionado para vaga");
                candidatosSelecionadosNoProcesso[candidatosChamados] = candidato[candidatoAtual];
                candidatosChamados ++;
            }
            candidatoAtual ++;
        }
        return candidatosSelecionadosNoProcesso;
    }

    static double valorPretendidoRandom() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    static boolean atender(){
        return new Random().nextInt(3) == 1;
    }
   public void  entrandoEmContato(String candidato){
        int tentativaRealizada = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativaRealizada++;
            } else {
                System.out.println("Contato realizado com sucesso");
            }
        }
        while (continuarTentando && tentativaRealizada < 3);

            if (atendeu) {
                System.out.println("Conseguimos contato com " + candidato + " na " + tentativaRealizada + " tentativa realizada.");
            }else{
                System.out.println("Não conseguimos contato com " + candidato + ", número de tentativas máxima esgotada");
            }

    }

}
