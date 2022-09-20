public class Main {
    public static void main(String[] args) {
        int sayi1 = 20 ;
        int sayi2 = 40;
        int sayi3 = 30;
        int buyukSayi = sayi1;

        if(buyukSayi < sayi2){
            buyukSayi = sayi2;

        }
        if(buyukSayi<sayi3){
            buyukSayi = sayi3;
        }

        System.out.println(buyukSayi);
    }
}