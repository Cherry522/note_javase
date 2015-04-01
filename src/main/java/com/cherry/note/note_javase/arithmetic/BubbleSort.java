package com.cherry.note.note_javase.arithmetic;

import org.apache.commons.lang3.ArrayUtils;

import com.cherry.note.note_javase.common.Utils;

/** 
 * <p>Copyright: All Rights Reserved</p>  
 * <p>Company: Cherry的测试项目   https://github.com/Cherry522/</p> 
 * <p>Description: 冒泡排序 </p> 
 * <p>Author:chenyan/陈燕</p>
 */
public class BubbleSort {

	/**
	 * <br/>Description:冒泡排序
	 * <p>Author:chenyan/陈燕</p>
	 * @param array
	 * @return
	 */
	public static int[] bubbleSort(int[] array){
		if(ArrayUtils.isEmpty(array)){
			return null;
		}else{
			//2.外层循环，决定比较的次数
			for(int j = array.length-1;j>0;j--){
				//临时变量
				int temp;
				//1.实现内层循环，获取所有值中的最大值，并冒泡找出来
//				for(int i = 0;i<array.length-1;i++){
				for(int i = 0;i<j;i++){
					//如果前面的值大于后面的值，就交换位置
					if(array[i] > array[i+1]){
						temp = array[i];
						array[i] = array[i+1];
						array[i+1] = temp;
					}
				}
				
			}
			return array;
		}
	}
	
	public static void main(String[] args) {
		int[] array = {5,2,7,1,3,10,4,8,9,6};
		Utils.printIntArray(array);
		BubbleSort.bubbleSort(array);
		Utils.printIntArray(array);
	}
}
