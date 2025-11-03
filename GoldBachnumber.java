package com.pack1;

import java.util.*;
public class GoldBachnumber
{
	
	    public static void main(String[] args)
	    {
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        int count=0;
	        for(int i=3;i<n;i+=2)
	        {
	            int fc=0;
	            for(int j=1;j<=i;j++)
	            {
	                if(i%j==0)
	                {
	                    fc++;
	                }
	            }
	            if(fc==2)
	            {
	                int j=n-i;
	                int fc1=0;
	                for(int k=1;k<=j;k++)
	                {
	                    if(j%k==0)
	                    {
	                        fc1++;
	                    }
	                }
	                if(fc1==2 && j%2==1 && j!=i && i<j)
	                {
	                    System.out.println(i+" "+j);
	                    count++;
	                }
	            }
	        }    
	            if(count==0)
	              System.out.println("No pairs found");
	            else if(count==1)
	              System.out.println("only one pair found");
	            else
	              System.out.println("Goldbach Number");
	            
	        
	    }
	
	

}
