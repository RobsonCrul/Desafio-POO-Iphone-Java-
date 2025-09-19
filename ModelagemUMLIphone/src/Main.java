public class Main {
    public static void main(String[] args){
        Iphone meuIphone = new Iphone();

        meuIphone.selecionarMusica("Locust - Machine Head");
        meuIphone.tocarMusica();
        meuIphone.pausarMusica();

        meuIphone.fazerLigacao("9999-9999");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        meuIphone.exibirPagina("www.apple.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}