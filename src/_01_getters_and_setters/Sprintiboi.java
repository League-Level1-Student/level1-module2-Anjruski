package _01_getters_and_setters;

public class Sprintiboi {
public static void main(String[] args) {
	PERSON Person_1 = new PERSON();
	PERSON Person_2 = new PERSON();
	PERSON Person_3 = new PERSON();
	Person_1.setSuperpower("Flying");
	Person_2.setSuperpower("Invisibility");
	Person_3.setSuperpower("Power of Yeet");
	Person_1.setName("James");
	Person_2.setName("Cody");
	Person_3.setName("Charles");
System.out.println(Person_1.toString());
System.out.println(Person_2.toString());
System.out.println(Person_3.toString());




}
}
