package aplicacoes.Iphone;

public class Telefone {
     private String lista, contato,nome;

    public Telefone(String lista, String contato, String nome) {
        this.lista = lista;
        this.contato = contato;
        this.nome = nome;
    }

    public String getLista() {
        return lista;
    }

    public String getContato() {
        return contato;
    }

    public String getNome() {
        return nome;
    }

    public void  ligar(){
         System.out.println("...Ligando...");
         }
         public void atenderLigacao(){
             System.out.println("Recebendo Ligação....");
             System.out.println("....Ligação Atendida...");
         }

         public void correioVoz (){
             System.out.println("...Mensagem Gravada...");

         }


}
