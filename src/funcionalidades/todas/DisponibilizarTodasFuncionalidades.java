package funcionalidades.todas;

import funcionalidades.internet.NavegadorInternet;
import funcionalidades.musica.ReprodutorMusical;
import funcionalidades.telefone.AparelhoTelefonico;

public class DisponibilizarTodasFuncionalidades  implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico {
    @Override
    public void ligar() {
        System.out.println("Ligando de um Iphone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo de um Iphone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz de um Iphone");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica de um Iphone");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica de um Iphone");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica de um Iphone");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina de um Iphone");
    }

    @Override
    public void abrirNovaAba() {
        System.out.println("Abrindo nova aba de um Iphone");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina de um Iphone");
    }
}
