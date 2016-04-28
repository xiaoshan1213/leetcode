
public class Solution1 {

	public String shortestPalindrome(String s) {
		
		if(s==null || s.length()==0 || s.length()==1){
			return s;
		}
		//StringBuilder builder=new StringBuilder();
		String res="";
		int end=s.length()-1;
		while(end>=1 && res==""){
			int begin=0;
			int tempL=0;
			while(s.charAt(end)==s.charAt(begin)){
				tempL+=2;
				if(end==begin+1){
					if(tempL==s.length()){
						return s;
					}
					for(int j=s.length()-1;j>=tempL;j--){
						res+=s.charAt(j);
					}
					break;
				}else if(end==begin){
					tempL--;
					if(tempL==s.length()){
						return s;
					}
					for(int j=s.length()-1;j>=tempL-1;j--){
						res+=s.charAt(j);
					}
					break;
				}
				end--;
				begin++;
				
			}
			end--;
		}
		if(res==""){
			for(int j=s.length()-1;j>=1;j--){
				res+=s.charAt(j);
			}
			return res+=s;
		}else{
			return res+=s;
		}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="";
		String res="";
		Solution1 solution1=new Solution1();
		res=solution1.shortestPalindrome(s);
		System.out.print(res);

	}

}
