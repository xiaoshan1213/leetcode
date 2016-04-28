
public class Solution3 {
	public String shortestPalindrome(String s) {
		if (s == null || s.length() <= 1){
			return s;
		}
		String res=null;
		int len=s.length();
		int mid=len/2;
		
		for(int i=mid;i>0;i--){
			if(i*2<len){
				if((res=scanFromCenter(s,i,i))!=null){
					return res;
				}
			}
			if(s.charAt(i)==s.charAt(i-1)){
				if((res=scanFromCenter(s,i-1,i))!=null){
					return res;
				}
			}
		}
		return scanFromCenter(s,0,0);
	}
	public String scanFromCenter(String s,int l,int r){
		int i=0;
		for(;l-i>=0;i++){
			if(s.charAt(l-i)!=s.charAt(r+i)){
				break;
			}
		}
		if(l-i>=0){
			return null;
		}
		StringBuilder builder=new StringBuilder(s.substring(r+i));
		builder.reverse();
		return builder.append(s).toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ab";
		String res="";
		Solution3 solution3=new Solution3();
		res=solution3.shortestPalindrome(s);
		System.out.print(res);

	}
}
