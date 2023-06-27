package aplicacoes.Iphone;

public class Navegador {
    private String endereco;

    public Navegador(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void  exbPagina(){
        System.out.println("www.google.com.br");
    }
    public   void  addNovaAba(){
        System.out.println("Nova Aba Aberta");
    }

  public void atualizaPafgina(){
        System.out.println("F5 "+"Página Atualizada");
    }


}
