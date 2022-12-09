package week1.day2assignmts;

public class ReverseEvenWords {
	
	public static void main(String[] args) {
		String test = "I am a software tester"; 
		String[] splitArray = test.split(" ");
		String newText = "";
		String alteredEvenWord = "";
		for (int i = 0; i < splitArray.length; i++) {
			if(i%2 != 0)
			{
				String evenWord = splitArray[i];
//				System.out.println("even Word " + splitArray[i]);
				char[] charArray = evenWord.toCharArray();
				for (int j = charArray.length - 1; j >= 0; j--) {
					
					alteredEvenWord = alteredEvenWord + charArray[j];
//					System.out.println("reverse even word " + alteredEvenWord);
				}	
				
				newText = newText + alteredEvenWord + " " ;
				alteredEvenWord = "";
				
			}			
			else
			{
				newText = newText + splitArray[i] + " " ; 
			}
			
		}	
		
		System.out.println(newText);
	}

}
