public class Main {
    public static void main(String[] args) {
        String[][] sehirler = new String[3][3];
        sehirler[0][0] = "izmir 1";
        sehirler[0][1] = "izmir 2";
        sehirler[0][2] = "izmir 3";
        sehirler[1][0] = "ankara 1";
        sehirler[1][1] = "ankara 2";
        sehirler[1][2] = "ankara 3";
        sehirler[2][0] = "istanbul 1";
        sehirler[2][1] = "istanbul 2";
        sehirler[2][2] = "istanbul 3";


        for( int i = 0 ; i<=2 ; i++) {
            System.out.println("--------------------------------------------------------------------");
            for(int j = 0; j<=2 ; j++){
                System.out.println(sehirler[i][j]);
            }
        }
    }
}