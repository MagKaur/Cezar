public class Cezar {

    String text;
    int n;
    String encrypted = "";

    public void setText(String insert){
        text = text;
    }
    public void setN(int insertINT){
        n = n;
    }

    public void encrypt(){
        for(int i=0; i<=text.length(); i++){
            char a = (char) (text.charAt(i)+n);
            if (a>'Z')
                a-=26;
            encrypted += a;
        }
    }
}
