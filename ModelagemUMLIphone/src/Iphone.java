public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet{

    @Override
    public void tocarMusica(){
        System.out.println("Tocando Música");
    }

    @Override
    public void pausarMusica(){
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica(String musica){
        System.out.println("Selecionando a Música " + musica);
    }

    @Override
    public void fazerLigacao(String numero){
        System.out.println("Fazendo ligação para " + numero);
    }

    @Override
    public void atender(){
        System.out.println("Atendendo a chamada");
    }

    @Override
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando Correio de Voz");
    }

    @Override
    public void exibirPagina(String url){
        System.out.println("Abrindo página na internet" + url);
    }

    @Override
    public void adicionarNovaAba(){
        System.out.println("Nova Aba aberta");
    }

    @Override
    public void atualizarPagina(){
        System.out.println("Página Atualizada");
    }
}
