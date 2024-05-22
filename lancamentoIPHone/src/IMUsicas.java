public interface IMUsicas {
    String album(String cantor, String separador, String musica);

    default void tocarMusica(String album) {
        System.out.println("Reproduzindo musica..." + album);
    }
}
