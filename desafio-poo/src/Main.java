import smartPhone.iPhone;

public class Main {

	public static void main(String[] args) {
		iPhone iphone = new iPhone();
		
		iphone.tocar();
		iphone.pause();
		iphone.selecionarMusica("Musica A");
		iphone.ligar("987654321");
		iphone.atender();
		iphone.iniciarCorreioVoz();
		iphone.exibirPagina("www.google.com.br");
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();

	}

}
