public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok sıcak.";
      /*  System.out.println(mesaj);
        System.out.println("Eleman Sayısı : " + mesaj.length());
        System.out.println("8. Eleman Sayısı : " + mesaj.charAt(8));
        System.out.println(mesaj.concat(" puffff"));
        System.out.println(mesaj.startsWith("A "));
        char[] karakterler = new char[5];
        mesaj.getChars(0,4, karakterler, 0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("a"));*/
        String yeniMesaj = mesaj.replace(' ','-');
        System.out.println(yeniMesaj);
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.toLowerCase());
    }
}