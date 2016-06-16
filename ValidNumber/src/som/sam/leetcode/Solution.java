/*
 * 1.valid number
 * 2. 2e10->true
 */
package som.sam.leetcode;

public class Solution {
	public boolean isNumber(String s){
		if(s==null) return false;
		int start=0;
		int end=s.length()-1;
		while(start<s.length()-1 && s.charAt(start)==' ')
			start++;
		while(end>=start+1 && s.charAt(end)==' ')
			end--;
		if(start-end==0 && (s.charAt(start)<'0' || s.charAt(start)>'9'))
			return false;
		if(s.charAt(start)=='+' || s.charAt(start)=='-'){
			if(s.charAt(start+1)=='.' && end-start==1)
				return false;
			start++;
		}
		int point=-1;
		int e=-1;
		for(int i=start;i<=end;i++){
			if(s.charAt(i)=='.'){
				if(point==-1) point=i;
				else return false;
			}
			if(s.charAt(i)=='e'){
				if(e==-1) e=i;
				else return false;
			}
			if(e==start || e==end) return false;
			if(point>e && e!=-1) return false;
			if(point==start && e==start+1) return false;
			if((s.charAt(i)<'0' || s.charAt(i)>'9') && s.charAt(i)!='.' && s.charAt(i)!='e'){
				if((s.charAt(i)=='+' || s.charAt(i)=='-') && e==i-1 && i!=end){
					
				}else return false;
			}
		}
		return true;
	}
}
