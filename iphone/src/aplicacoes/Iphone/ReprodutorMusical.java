package aplicacoes.Iphone;

import org.w3c.dom.ls.LSOutput;

public class ReprodutorMusical {
    private String musica, album,lista;

    public ReprodutorMusical(String musica, String album, String lista) {
        this.musica = musica;
        this.album = album;
        this.lista = lista;
    }

    public String getMusica() {
        return musica;
    }

    public String getAlbum() {
        return album;
    }

    public String getLista() {
        return lista;
    }

    public void tocarmusica(){
        System.out.println("Yellon//Coodplay");
    }
    public void pausarMusica(){
        System.out.println("Música Pausada...........");
    }

    public void selecaoArtista(){
        System.out.println("Albuns...");System.out.println("Play List...");System.out.println("Musica Selecionada...");
    }


}
