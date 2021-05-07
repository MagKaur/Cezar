public class Cezar {

    String text = "";
    int n;
    String encrypted = "";

    public void setText(String insert){
        text = insert;
    }
    public void setN(int insertINT){
        n = insertINT;
    }


    public String encrypt(){
        for(int i=0; i<text.length(); i++){
            char a = (text.charAt(i));
            if (a > 'Z')
            {
                a -= 26;
            }else if (a > 'A' && a < 'Z' ) {
                a = (char) (text.charAt(i) + n);
            }
            encrypted += a;
        } return encrypted;
    }

    public void show () {
        System.out.println(encrypted);
    }
}
