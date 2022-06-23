package RAJU;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "My Name is Rajkumar";

		String rev = " ";
		

		char a[] = str.toCharArray();
		int len = a.length;
		for (int i = len - 1; i >= 0; i--) 
		{
			rev = rev + a[i];
		}
		System.out.println("Reveresed string is:" + rev);

		
		/* String str = "My Name is Rajkumar"; 
		 String splitArray[] = str.split(" "); 
		 for
		  (int i = splitArray.length - 1; i >= 0; i--)
        {
		  System.out.print(" "+splitArray[i]);
		  }
		 
	
		//String str = "My Name is Rajkumar";
		// StringBuffer sb=new StringBuffer(str);
		// System.out.println(sb.reverse());
		*/
		}
}
