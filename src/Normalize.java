import java.util.ArrayList;


public class Normalize {

	public static void main(String[] args) {
		String inputPath = args[0];
		String[] strArr = inputPath.split("/");
		ArrayList<String> strList = new ArrayList<String>();
		
		// put str in the array list if it is not equal to either "." or "..",
		// remove the prior str if the current one is "..".
		for(int i=0; i<strArr.length; i++) {
			String str = strArr[i];
			if(!str.equals(".") && !str.equals("..")) {
				strList.add(str);
			} 
			if(str.equals("..")) {
				strList.remove(i-1);
			}
			
		}
		
		// print out the normalized path.
		String normalizedString = "";
		for(String s: strList) {
			normalizedString += (s + "/");
		}
		System.out.println(normalizedString.substring(0, normalizedString.length()-1));
	}

}
