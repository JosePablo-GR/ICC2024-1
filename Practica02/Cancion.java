public class Cancion{

	public static void main(String[] args){

		String vacio = "";
		String numbers = "0123456789";

		String firstDay = "a partridge in a pear tree";
		String secondDay = "Two turtle doves";
		String thirdDay = "Three French hens,";
		String fourthDay = "Four calling birds,";
		String fifthDay = "Five golden rings,";
		String sixthDay = "Six geese a-laying,";
		String seventhDay = "Seven swans a-swimming,";
		String eighthDay = "Eight maids a-milking,";
		String ninthDay = "Nine ladies dancing,";
		String tenthDay = "Ten lords a-leaping,";
		String eleventhDay = "Eleven pipers piping,";
		String twelvethDay = "Twelve drummers drumming,";

		int valorChar;

		System.out.println("long: " + numbers.length());

		for(int i = 9; i < numbers.length(); i--){

			char c = numbers.charAt(i);
			valorChar = Character.getNumericValue(c);

			switch(valorChar){

			case 1:

				System.out.println(firstDay);

				break;

			case 2:

				System.out.println(secondDay);

				break;

			case 3:

				System.out.println(thirdDay);

				break;

			case 4:

				System.out.println(fourthDay);

				break;

			case 5:

				System.out.println(fifthDay);

				break;

			case 6:

				System.out.println(sixthDay);

				break;

			case 7:

				System.out.println(seventhDay);

				break;

			case 8:

				System.out.println(eighthDay);

				break;

			case 9:

				System.out.println(ninthDay);

				break;

			case 10:

				break;

			case 11:

				break;

			case 12:

				break;

			}

			/*
			if(valorChar == i){

				//System.out.println("valor i: " + i);
				//System.out.println("valor char: " + valorChar);
				//System.out.println(valorChar);

			}
			*/

		}

	}

}//Fin class
