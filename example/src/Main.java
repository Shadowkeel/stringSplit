import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

             String s12="1yo1ur; ro2ckst2ar;i2nn1er. us6, come  unl1eash 2wi2th1";

        getNumberOnString(s12);
    }
    public static void getNumberOnString(String text){

        HashMap<Integer,String> hashMap=new HashMap<>();
        String[] stringarray = text.split("[ ,;'/*&$#|@!]+");
        for (String sender:stringarray) {
            StringBuilder rawText2=new StringBuilder();
            int rawNumber2=0;
            for (char c: sender.toCharArray()) {
                if(Character.isDigit(c)){
                    rawNumber2+=Character.getNumericValue(c);

                }else if(Character.isAlphabetic(c)){
                    rawText2.append(c);
                }
            }
            hashMap.put(rawNumber2,rawText2.toString());

            }
        for (String words:  hashMap.values()  ) {
            System.out.print(words+" ");
        }

    }
    }
