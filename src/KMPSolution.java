
public class KMPSolution {
	public String shortestPalindrome(String s) {
		String rev=(new StringBuilder(s)).reverse().toString();
		String combine=s+"#"+rev;
		int[] partial=new int[combine.length()];
		getPartial(combine,partial);
		int remove=partial[partial.length-1];
		String preAdd=rev.substring(0, rev.length()-remove);
		return preAdd+s;
	}
	private void getPartial(String s,int[] partial){
		int j=0,i=1;
		partial[0]=0;
		while(i<s.length()){
			if(s.charAt(i)==s.charAt(j)){
				partial[i]=j+1;
				i++;
				j++;
			}else{
				if(j>0){
					j=partial[j-1];
				}else{
					partial[i]=0;
					i++;
				}
			}
		}
	}
}
