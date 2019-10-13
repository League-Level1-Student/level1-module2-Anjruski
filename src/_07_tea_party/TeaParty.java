package _07_tea_party;

public class TeaParty {

	public String welcome(String name, boolean isWoman, boolean isKnighted) {
		String Welcome = "";
		if (isWoman) {
			if (isKnighted) {
				Welcome = "Hello Lady " + name;
			} else {
				Welcome = "Hello Ms. " + name;
			}
		} else {
			if (isKnighted) {
				Welcome = "Hello Sir " + name;
			}

			else {
				Welcome = "Hello Mr. " + name;
			}
		}

		return Welcome;
	}
}
