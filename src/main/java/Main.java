import java.util.Scanner;
public class Main {


    public static void main(String[] args){

        Cezar Cezar = new Cezar();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wiadomość do zaszyfrowania: ");
        String insert = scanner.nextLine().toUpperCase();
        Cezar.setText(insert);
        Scanner scannerINT = new Scanner(System.in);
        System.out.println("Podaj klucz: ");
        int insertINT = scannerINT.nextInt();
        Cezar.setN(insertINT);
        Cezar.encrypt();
        Cezar.show();
    }
}
