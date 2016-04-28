
public class Solution {

	/**
	 * @param args
	 */
	
	public String longestPalinDrome(String s){
		
		String longestPalinDromeString=s.substring(0, 1);
		String tempString="";
		for(int i=0;i<s.length();i++){
			
			//aba
			tempString=getSubPalinDrome(s, i, i+1);
			if(tempString.length()>longestPalinDromeString.length()){
				longestPalinDromeString=tempString;
			}
			
			//abba
			tempString=getSubPalinDrome(s, i, i);
			if(tempString.length()>longestPalinDromeString.length()){
				longestPalinDromeString=tempString;
			}
				
		}
		
		return longestPalinDromeString;
	}
	
	public String getSubPalinDrome(String s,int begin,int end){
		String reString="";
		
		while(begin>=0 && end<=s.length()-1 && s.charAt(begin)==s.charAt(end)){
			begin--;
			end++;
		}
		
		reString=s.substring(begin+1, end);//从begin后一个开始，到end前一个结束
		return reString;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-a method stub
		String string="abcde";
		//String string2="aba";
		Solution solution = new Solution();
		System.out.println(solution.longestPalinDrome(string));
		//System.out.print(string.substring(1,3));
	}

}
