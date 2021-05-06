public class Cezar {

    String text;
    int n;
    String encrypted;

    public String setText(String insert){
        return text;
    }
    public int setN(int insertINT){
        return n;
    }

    public void encrypt(){
        for(int i=0; i<text.length(); i++){
            char a = (char) (text.charAt(i)+n);
            encrypted += a;
        }
    }
}
