package com.sam.example;

import java.util.ArrayList;
import java.util.List;

public class FastSolution {
	public List<String> addOperators(String num,int target){
		List<String> res=new ArrayList<>();
		StringBuilder sb=new StringBuilder();
		stepCal(res,sb,num,target,0,0,0);
		return res;
	}
	private void stepCal(List<String> res,StringBuilder sb,String num,int target,int pos,long curSum,long preVal){
		if(pos==num.length()){
			if(target==curSum){
				res.add(sb.toString());
			}
			return;
		}
		for(int i=pos;i<num.length();i++){
			if(num.charAt(pos)=='0' && i!=pos) break;
			long cur=Long.parseLong(num.substring(pos,i+1));
			int len=sb.length();
			if(pos==0){
				stepCal(res,sb.append(cur),num,target,i+1,cur,cur);
				sb.setLength(len);
			}else{
				stepCal(res,sb.append("+").append(cur),num,target,i+1,curSum+cur,cur);
				sb.setLength(len);
				stepCal(res,sb.append('-').append(cur),num,target,i+1,curSum-cur,cur);
				sb.setLength(len);
				stepCal(res,sb.append('*').append(cur),num,target,i+1,curSum-preVal+preVal*cur,preVal*cur);
				sb.setLength(len);
			}
		}
	}
}
