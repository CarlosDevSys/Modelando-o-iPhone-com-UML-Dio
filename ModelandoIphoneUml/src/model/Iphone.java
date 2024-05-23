package model;

public class Iphone implements ReprodutorMusical,AparelhoTelefonico,NavegadorInternet{

	@Override
	public void exibirPagina(String url) {
	   System.out.println("Exibindo Pagina.");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova Aba.");		
	}

	@Override
	public void atualizarPagina() {
       System.out.println("Atualizando a pagina.");		
	}

	@Override
	public void ligar(String numero) {
		System.out.println("Realizando ligação.");
		
	}

	@Override
	public void atender() {
       System.out.println("Atendendo ligação.");		
	}

	@Override
	public void iniciarCorreioVoz() {
       System.out.println("Iniciando correio de voz.");		
	}

	@Override
	public void tocar() {
      System.out.println("Tocando musica selecionada.");		
	}

	@Override
	public void pausar() {
      System.out.println("Pausando musica.");		
	}

	@Override
	public void selecionarMusica(String musica) {
      System.out.println("Selecionando musica.");		
	}

}
