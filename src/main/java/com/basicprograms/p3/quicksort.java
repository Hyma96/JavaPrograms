package com.basicprograms.p3;

public class quicksort {
     int partition(int arr[], int start, int end) {
    	 int pivote=arr[end];
    	 int i=(start-1);
    	 for(int j=start;j<=end;j++) {
    		 if(arr[j]<pivote) {
    			 i++;
    			 int t=arr[i];
    			 arr[i]=arr[j];
    			 arr[j]=t;
    			 return(i+1);
    			 }
    	 }
    	 return 0;
     }
     void quicksort(int arr[], int start, int end) {
    	 if(start<end) {
    		 int p=partition(arr,start,end);
    		 quicksort(arr,start,p-1);
    		 quicksort(arr,p+1,end);
    	 }
     }
     void print(int arr[],int n) {
    	 for(int i=0;i<n;i++) {
    		 System.out.println(arr[i]+" ");
    	 }
     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
