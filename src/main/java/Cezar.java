public class Cezar {

    private String text = "";
    private int n;
    private String encrypted = "";


    public Cezar() {}

    public void setText(String insert){

        String insertlow = insert.toLowerCase();
        this.text = insertlow;
    }
    public void setN(int insertINT){
        this.n = insertINT;
    }


    public String getEncrypted (){

        return encrypted;
    }


    public void encrypt() {

        for (int i = 0; i < text.length(); i++) {
            char a = text.charAt(i);
                if (a >= 'a' && a <='z') {
                    a = (char) (text.charAt(i) + n);

                    if (a > 'z') {
                        a -= 26;
                    }
                }
                if (a >= '0' && a <= '9') {
                    a = (char) (text.charAt(i) + n);

                        if (a > '9'){
                           a -= 10;
                       }
                   }
                encrypted += a;

        }
    }
        public void show() {
            System.out.println(encrypted);
        }


    }



