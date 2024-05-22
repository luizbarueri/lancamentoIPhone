public class Iphone {
    private String modelo;
    private int anoFrabricacao;

    public Iphone(String modelo, int anoFrabricacao) {
        this.modelo = modelo;
        this.anoFrabricacao = anoFrabricacao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFrabricacao() {
        return anoFrabricacao;
    }

    public void setAnoFrabricacao(int anoFrabricacao) {
        this.anoFrabricacao = anoFrabricacao;
    }
    //********** Metodos ************************************
    public  void fazChamada() {
        System.out.println("ligando para...");
    }
    public  void recebeChamada() {
        System.out.println("recebendo ligação de...");
    }
    public void tocarMusica() {
        System.out.println("Tocando musica...");
    }
    public void conectarInternet() {
        System.out.println("acessando a internet...");
    }
    //****************************************************
    @Override
    public String toString() {
        return "Iphone{" +
                "modelo='" + modelo + '\'' +
                ", anoFrabricacao=" + anoFrabricacao +
                '}';
    }
}
