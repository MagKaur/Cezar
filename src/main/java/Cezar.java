public class Cezar {

    private String text = "";
    private int n;
    private String encrypted = "";



    public void setText(String insert){
        this.text = insert;
    }
    public void setN(int insertINT){
        this.n = insertINT;
    }


    public String getText(){
        return text;
    }

    public int getN(){
      return n;
    }

    public String getEncrypted (){
        System.out.println(encrypted);
        return encrypted;
    }


    public void encrypt() {

        for (int i = 0; i < text.length(); i++) {
            char a = text.charAt(i);
                if (a >= 'a' && a <='z')
                    a = (char) (text.charAt(i) + n);
                    if (a > 'z') {
                        a -= 26;
                    }
                   if (a >= '1' && a <= '9'){
                       a = (char) (text.charAt(i) + n);
                       if (a > '9'){
                           a -=9;
                       }
                   }
                encrypted += a;

        }
    }
        public void show() {
            System.out.println(encrypted);
        }


    }



