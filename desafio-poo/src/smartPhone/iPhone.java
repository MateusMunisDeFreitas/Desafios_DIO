package smartPhone;

import aplicativos.AparelhoTelefonico;
import aplicativos.NavegadorInternet;
import aplicativos.ReprodutorMusical;

public class iPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

	@Override
	public void tocar() {
		System.out.println("Tocar musica!");
	}

	@Override
	public void pause() {
		System.out.println("Pause musicar!");
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Selecionado musica: "+ musica);
	}

	@Override
	public void exibirPagina(String URL) {
		System.out.println("Exibir pagina web: "+ URL);
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Nova pagina adicionada!");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Pagina atualizada!");
	}

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para: "+ numero);
	}

	@Override
	public void atender() {
		System.out.println("Atender chamada!");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciar correio de voz!");
	}
	
}
