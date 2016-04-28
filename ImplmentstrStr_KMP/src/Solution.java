
public class Solution {
	public int strStr(String haystack, String needle) {
        if(haystack==null || needle==null || needle.length()==0){
        	return 0;
        }
        if(needle.length()>haystack.length()){
        	return -1;
        }
        for(int i=0;i<=haystack.length()-needle.length();i++){
        	boolean flag=true;
        	for(int j=0;j<needle.length();j++){
        		if(haystack.charAt(i+j)!=needle.charAt(j)){
        			flag=false;
        			break;
        		}
        	}
        	if(flag){
            	return i;
            }
        }
        return -1;
        
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
