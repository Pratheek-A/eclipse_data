package com.companies;

public class Demo {
public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5};
		int k=2;
		int ans[] = new int[arr.length+1];
		
		int l=0;
		for(int i=0;i<arr.length; i++) {
			ans[i]=Math.abs(arr[l++]-k);
		}
		
		for(int mm:ans) {
			System.out.println(mm);
		}	
		
}
}
