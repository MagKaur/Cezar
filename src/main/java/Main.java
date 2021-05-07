import java.util.Locale;
import java.util.Scanner;
public class Main {


    public static void main(String[] args){

        Cezar cezar = new Cezar();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wiadomość do zaszyfrowania: ");
        String insert = scanner.nextLine().toLowerCase();
        cezar.setText(insert);
        Scanner scannerINT = new Scanner(System.in);
        System.out.println("Podaj klucz: ");
        int insertINT = scannerINT.nextInt();
        cezar.setN(insertINT);


        cezar.encrypt();
        cezar.show();
        /*cezar.getEncrypted();*/
    }
}
