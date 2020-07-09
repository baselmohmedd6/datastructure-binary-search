/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;

import java.util.Scanner;

/**
 *
 * @author Inkall
 */
public class Binarysearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Binarysearch b=new Binarysearch();
        Scanner sc=new Scanner(System.in);
        int arr[]={2,5,6,8,11,13,18,20,23,25,27,30,32,35,37,40, 42 , 44 ,47 , 49};
        int n=arr.length;
        int num;
        int counter=0;
        num=sc.nextInt();
       int result=b.binarysearch(arr, 0, arr.length-1, num);
       if(result==-1)
       {
           System.out.print(num+"not found");
       }
       else
       {
           System.out.print(arr[result]+"found in" +result+" "+counter++);
       }
        
               
    }
    int binarysearch(int[]arr,int l,int h,int key)
    {
        while(l<h)
        {
            int m=(l+h)/2;
            if(arr[m]==key)
            {
                return m;
            }
            else if(arr[m]<key)
            {
              l=m+1;
            }
            else 
            {
                h=m-1;
            }
        }
        return -1;
    }
}
