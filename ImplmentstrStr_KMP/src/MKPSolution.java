
public class MKPSolution {
	public int strStr(String haystack, String needle) {
		if(haystack==null || needle==null || needle.length()==0){
        	return 0;
        }
        if(needle.length()>haystack.length()){
        	return -1;
        }
        int[] next=getNext(needle);
        int i=0;
        while(i<=haystack.length()-needle.length()){
        	boolean flag=true;
        	for(int j=0;j<needle.length();j++){
        		if(needle.charAt(0)!=haystack.charAt(i)){
        			flag=false;
        			i++;
        			break;
        		}else if(needle.charAt(j)!=haystack.charAt(i+j)){
        			flag=false;
        			i=i+j-next[j-1];
        			break;
        		}
        	}
        	if(flag==true){
        		return i;
        	}
        }
        return -1;
        
	}
	private int[] getNext(String needle){
		int[] next=new int[needle.length()];
		next[0]=0;
		for(int i=1;i<needle.length();i++){
			int index=next[i-1];
			while(index>0 && needle.charAt(index)!=needle.charAt(i)){
				index=next[index-1];
			}
			if(needle.charAt(index)==needle.charAt(i)){
				next[i]=next[i-1]+1;
			}else{
				next[i]=0;
			}
		}
		return next;
	}
	
}
