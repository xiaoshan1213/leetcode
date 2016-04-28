
public class Solution2 {
	public String shortestPalindrome(String s) {
		if(s==null || s.length()==0 || s.length()==1){
			return s;
		}
		StringBuilder builder=new StringBuilder();
		int len=s.length();
		int end=len;
		while(end>1){
			if(isPalindrome(s.substring(0, end))){
				builder=builder.append(s.substring(end, len)).reverse();
				break;
			}
			end--;
		}
		if(builder.length()==0){
			builder=builder.append(s.substring(end, len)).reverse();
		}
		return builder.append(s).toString();
	}
	
	public boolean isPalindrome(String s){
		int len=s.length();
		for(int i=0;i<len/2;i++){
			if(s.charAt(i)!=s.charAt(len-i-1)){
				return false;
			}
		}
		return true;
	}
}
