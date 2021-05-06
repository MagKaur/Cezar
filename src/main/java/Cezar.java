public class Cezar {

    String text;
    int n;
    String encrypted = "";

    public void setText(String insert){
        text = insert;
    }
    public void setN(int insertINT){
        n = insertINT;
    }

    public String getText()
    {
        return text;
    }

    public int getN()
    {
        return n;
    }

    public String encrypt(){
        for(int i=0; i<text.length(); i++){
            char a = (char) (text.charAt(i)+n);
            encrypted += a;
        }
        return encrypted;
    }
}
