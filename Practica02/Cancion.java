public class Cancion{

	public static void main(String[] args){

		String primerDia = "a partridge in a pear tree";
		String firstDay = "and a partridge in a pear tree";
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

		for (int i = 1; i <= 12; i++){

			for (int j = i; j >= 1; j--){

				switch(j){

			case 1:

				if(i == 1){

					System.out.println("On the first day of Christmas, my true love sent to me \n" + primerDia);


				} else {

					System.out.println(firstDay);

				}

				break;

			case 2:

				if(i == 2){

					System.out.println("On the second day of Christmas, my true love sent to me");

				}

				System.out.println(secondDay);

				break;

			case 3:

				if(i == 3){

					System.out.println("On the third day of Christmas, my true love sent to me");

				}

				System.out.println(thirdDay);

				break;

			case 4:

				if(i == 4){

					System.out.println("On the fourth day of Christmas, my true love sent to me");

				}

				System.out.println(fourthDay);

				break;

			case 5:

				if(i == 5){

					System.out.println("On the fifth day of Christmas, my true love sent to me");

				}

				System.out.println(fifthDay);

				break;

			case 6:

				if(i == 6){

					System.out.println("On the sixth day of Christmas, my true love sent to me");

				}

				System.out.println(sixthDay);

				break;

			case 7:

				if(i == 7){

					System.out.println("On the seventh day of Christmas, my true love sent to me");

				}

				System.out.println(seventhDay);

				break;

			case 8:

				if(i == 8){

					System.out.println("On the eighth day of Christmas, my true love sent to me");

				}

				System.out.println(eighthDay);

				break;

			case 9:

				if(i == 9){

					System.out.println("On the ninth day of Christmas, my true love sent to me");

				}

				System.out.println(ninthDay);

				break;

			case 10:

				if(i == 10){

					System.out.println("On the tenth day of Christmas, my true love sent to me");

				}

				System.out.println(tenthDay);

				break;

			case 11:

				if(i == 11){

					System.out.println("On the eleventh day of Christmas, my true love sent to me");

				}

				System.out.println(eleventhDay);

				break;

			case 12:

				if(i == 12){

					System.out.println("On the twelveth day of Christmas, my true love sent to me");
					System.out.println(twelvethDay);

				} else {

					System.out.println(twelvethDay);

				}

				break;

			}//Fin switch
              
             }

             if(i == 12){

             	System.out.print("!");
             	System.out.println();

             } else {

             	System.out.println();

             }

         }

	}

}//Fin class
