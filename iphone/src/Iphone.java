import aplicacoes.Iphone.Navegador;
import aplicacoes.Iphone.ReprodutorMusical;
import aplicacoes.Iphone.Telefone;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Iphone{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("...BEM VINDO...");
        System.out.println("---------------\n");
        System.out.println("Spotfy: 1\n"+"Mozila:  2\n"+"Agenda:  3\n");
        System.out.println("---------------");

        int opcao = sc.nextInt();
        switch (opcao){
            case 1: ReprodutorMusical rep =new ReprodutorMusical("Yellon", "Coodplay","As Mais Tocadas");
            rep.selecaoArtista();rep.tocarmusica();rep.pausarMusica();

            case 2:
                Navegador navegador = new Navegador("www.google.com.br");
                navegador.addNovaAba();navegador.atualizaPafgina();navegador.exbPagina();

            case 3:
                Telefone telefone = new Telefone("Exibe Contatos","Add Novo Contato","Fulano");
                telefone.atenderLigacao();telefone.ligar();telefone.correioVoz();
        }






    }
}