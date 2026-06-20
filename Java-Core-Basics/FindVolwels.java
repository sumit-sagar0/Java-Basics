public class FindVolwels {

	public static int vowels (String str ) {
		
		int count = 0;
		String strins = "aeiouAEIOU";
		for(int i=0; i<str.length(); i++) {
			if(strins.indexOf(str.charAt(i)) != -1) {
				count++;
			}
		}
		return count;
	}


        public static void main(String[] args ) {

            System.out.println(vowels("Sumit Sagar"));

        }			
}