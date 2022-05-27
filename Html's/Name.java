import java.util.regex.Pattern;

import javax.swing.JOptionPane;

 class Name{


    public static void main(String[] args) {
        String input = "Duck";
       if(isWord(input)){
            JOptionPane.showMessageDialog(null, "Valid");
       }
       else{
           JOptionPane.showMessageDialog(null, "Invalid");
       }
    }
    public static boolean isWord(String in){
        return Pattern.matches("[a-zA-Z[0-9]]+", in);
    }
}