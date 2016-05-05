package com.sam.example;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<String> addOperators(String num,int target){
		List<String> rst=new ArrayList<String>();
		if(num==null || num.length()==0){
			return rst;
		}
		stepCal(rst,"",num,target,0,0,0);
		return rst;
	}
	private void stepCal(List<String> rst,String path,String num,int target,int pos,long curSum,long prevVal){
		if(pos==num.length()){
			if(target==curSum){
				rst.add(path);
			}
			return;
		}
		for(int i=pos;i<num.length();i++){
			if(i!=pos && num.charAt(pos)=='0') break;
			long cur=Long.parseLong(num.substring(pos,i+1));
			if(pos==0){
				stepCal(rst,path+cur,num,target,i+1,cur,cur);
			}else{
				stepCal(rst,path+'+'+cur,num,target,i+1,curSum+cur,cur);
				stepCal(rst,path+'-'+cur,num,target,i+1,curSum-cur,-cur);
				stepCal(rst,path+'*'+cur,num,target,i+1,curSum-prevVal+prevVal*cur,prevVal*cur);
				
			}
		}
	}
}
