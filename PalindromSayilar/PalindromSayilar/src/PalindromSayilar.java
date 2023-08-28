public class PalindromSayilar {

		static boolean number(int i) {
			int lastNumber,reverseNumber=0,temp;
			temp=i;
			while(temp!=0) {
				lastNumber=temp%10;
				reverseNumber=(reverseNumber*10)+lastNumber;
				temp=temp/10;
			}
			return true;
		}
		
		public static void main(String[] args) {
			if(number(101)== true) {
				System.out.print("Sayı Polindrom sayıdır.");
			}
			else {
				System.out.print("Sayı Polindrom sayı değildir.");
			}
	    }

	}


