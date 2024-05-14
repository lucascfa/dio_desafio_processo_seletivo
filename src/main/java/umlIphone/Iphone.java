package umlIphone;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, Navegador{
    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica");
    }
    @Override
    public void tocar(){
        System.out.println("Tocando musica");
    }
    @Override
    public void pausar(){
        System.out.println("Musica pausada");
    }

    @Override
    public void exibirPagina() {

    }

    @Override
    public void adicionarNovaAba() {

    }

    @Override
    public void atualizarPagina() {

    }

    @Override
    public void ligar() {

    }

    @Override
    public void atender() {

    }

    @Override
    public void iniciarCorreioVoz() {

    }
}
