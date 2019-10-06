package _07_tea_party;

import javax.swing.JOptionPane;

public class TeaParty {
      
		public String welcome(String name, boolean isWoman, boolean isKnighted) {
			String Welcome = "";
			if(isWoman) {
				if(isKnighted) {
				Welcome = "Hello Lady " + name;
				}
				else {
					Welcome = "Hello Ms." + name;
				}
			}
			else {
				Welcome = "Hello Mr." + name;
			}
			
			
			
			
			
			
			return Welcome;
        }
}

