package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	/*
	 Given a sorted array of distinct integers and a target value, return the index
	 if the target is found. If not, return the index where it would be if it were
	 inserted in order.

     You must write an algorithm with O(log n) runtime complexity.

     Example 1:
     Input: nums = [1,3,5,6], target = 5
     Output: 2
     Example 2:
     Input: nums = [1,3,5,6], target = 2
     Output: 1
     Example 3:
     Input: nums = [1,3,5,6], target = 7
     Output: 4
	 */
    int[] arr = {1,3,5,6};
    int ans = search(arr,4);
        System.out.println(ans);
    }
    public static int search(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        int result = 0;
        while (start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                return mid;

            }
            else if(arr[mid]>target){
                end = mid-1;
            }
            else if(arr[mid]<target){
                start = mid+1;
            }
            else{
                return mid+1;
            }
        }
        return start;
    }
}
// It si similar as ceiling of a number.