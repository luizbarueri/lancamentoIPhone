public class Principal {
    public static void main(String[] args) {

        Iphone iphone = new Iphone("IP2024",2024);
        System.out.println("*********** Meu IPhone *************");
        System.out.println(iphone);
        System.out.println("************************************");

        iphone.tocarMusica();
        iphone.fazChamada();
        iphone.recebeChamada();
        iphone.conectarInternet();;
    }
}
