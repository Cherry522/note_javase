package com.cherry.note.note_javase.arithmetic;

import org.apache.commons.lang3.ArrayUtils;

import com.cherry.note.note_javase.common.Utils;

/** 
 * <p>Copyright: All Rights Reserved</p>  
 * <p>Company: Cherry的测试项目   https://github.com/Cherry522/</p> 
 * <p>Description: 二分法查找(自己实现对数组的二分法查找) </p> 
 * <p>Author:chenyan/陈燕</p>
 */
public class BinarySearch{

	/**
	 * <br/>Description:二分法查找
	 * <p>Author:chenyan/陈燕</p>
	 */
	public static int binarySearch(int[] array,int num){
		if(ArrayUtils.isEmpty(array)){
			return -1;
		}else{
			int beginIndex = 0;
			int endIndex = array.length - 1;
			while(beginIndex <= endIndex ){
				int midIndex = (beginIndex + endIndex)/2;
				if(array[midIndex] == num){
					return midIndex;
				}else if(array[midIndex] > num){
					endIndex = midIndex -1;
				}else{
					beginIndex = midIndex + 1;
				}			
			}
			return -1;
		}
	}
	
	
	public static void main(String[] args){
		int[] array = {1,2,3,4,5,6,7,8,9};
		Utils.printIntArray(array);
		int searchNum = 10;
		System.out.println("searchNum-->"+searchNum);
		int index = BinarySearch.binarySearch(array,searchNum);
		System.out.println("index-->"+index);
	}

}
