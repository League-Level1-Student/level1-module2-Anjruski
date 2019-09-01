package _01_getters_and_setters;

public class PERSON {
public static void main(String[] args) {

}
String name;
String superpower;

String getName() {
	return name;
}

String getSuperpower() {
	return superpower;
}

void setName(String RealName) {
	name = RealName;
}

void setSuperpower(String Quirk) {
	superpower = Quirk;
}

public String toString() {
	return name + " has mad " + superpower + " skills.";
	
}





}
