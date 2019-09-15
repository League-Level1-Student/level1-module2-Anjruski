package _03_smurf;

public class Smolwalk {
public static void main(String[] args) {
	
	
	
	
	
	
	Smurf HandySmurf = new Smurf("Handy");
	HandySmurf.eat();
	String name1 = HandySmurf.getName();
	System.out.println(name1);
	Smurf PapaSmurf = new Smurf("Papa");
	String name2 = PapaSmurf.getName();
	System.out.println(name2);
	String hatcol1 = PapaSmurf.getHatColor();
	System.out.println(hatcol1);
	String GoB1 = PapaSmurf.isGirlOrBoy();
	System.out.println(GoB1);
	Smurf Smurfette = new Smurf("Papa");
	String name3 = PapaSmurf.getName();
	System.out.println(name3);
	String hatcol2 = PapaSmurf.getHatColor();
	System.out.println(hatcol2);
	String GoB2 = PapaSmurf.isGirlOrBoy();
	System.out.println(GoB2);

}
}
