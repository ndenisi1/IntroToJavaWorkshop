import java.io.IOException;

import javax.swing.JOptionPane;

public class stevehawking {
public static void main(String[] args) {
	

   
// 2. ask the user for a sentence

    // 4. repeat steps 2 and 3 a lot of times
	for (int i = 0; i < 50; i++) {
		
	String wonderwoman= JOptionPane.showInputDialog("Type a sentence");
	speak(wonderwoman);}
}
/* Don’t change this…. */
static void speak(String words) {
   	 try {
   		 Runtime.getRuntime().exec("say " + words).waitFor();
   	 } catch (Exception e) {
   		 e.printStackTrace();
   	 }
    }

}

// Copyright Wintriss Technical Schools 2014






