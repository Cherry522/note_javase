package com.cherry.note.note_javase.arithmetic;

import org.apache.commons.lang3.ArrayUtils;

import com.cherry.note.note_javase.common.Utils;

/** 
 * <p>Copyright: All Rights Reserved</p>  
 * <p>Company: 北京荣之联科技股份有限公司   http://www.ronglian.com</p> 
 * <p>Description: 选择排序（选择排序是冒泡排序的优化） </p> 
 * <p>Author:chenyan/陈燕</p>
 */
public class SelectSort{
	
	public static int[] selectSort(int[] array){
		if(ArrayUtils.isEmpty(array)){
			return null;
		}else{
			for(int i = 0;i < array.length;i ++ ){
				//最小值的坐标
				int minSubscript = i;
				for(int j = i+1;j<array.length;j++){
					if(array[minSubscript] > array[j]){
						minSubscript = j;
					}				
				}
				if(minSubscript != i){
					int temp = array[i];
					array[i] = array[minSubscript];
					array[minSubscript] = temp;
				}
			}
			return array;
		}
	}

	public static void main(String[] args){
		int[] array = {3,6,2,4,1,9,7,8};
		Utils.printIntArray(array);
		array = SelectSort.selectSort(array);
		Utils.printIntArray(array);
	}

}
