package stringTask;

public class English {

	public static void printOne(String message) {

		String[] splited = message.split("\\s+");

		for (int i = splited.length - 1; i >= 0;  i--) {

			System.out.println(splited[i]);

		}

	}

	public static void find(String find, String message) {

		int count = 0;	
		String[] splited = message.split("\\s+");

		for (int i = 0; i < splited.length;  i++) {

			if(splited[i].equals(find)) {
				count++;
			}
		}

		System.out.println( "The word \"" + find + "\" occurs " + count + " times");
	}

	public static void findAndReplace(String find, String replace, String message) {

		String[] splited = message.split("\\s+");

		for (int i = 0; i < splited.length;  i++) {

			if(splited[i].equals(find)) {
				splited[i] = replace;
			}

			System.out.print(splited[i] + " ");
		}

	}

	public static void main(String[] args) {

		String message = "I am going going to London";
		String find = "going";
		String replace = "***";

		English.printOne(message);
		English.find(find, message);
		English.findAndReplace(find, replace, message);

	}

}
