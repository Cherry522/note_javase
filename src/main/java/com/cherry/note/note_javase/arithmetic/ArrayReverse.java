package com.cherry.note.note_javase.arithmetic;

import org.apache.commons.lang3.ArrayUtils;

import com.cherry.note.note_javase.common.Utils;

/** 
 * <p>Copyright: All Rights Reserved</p>  
 * <p>Company: Cherry的测试项目   https://github.com/Cherry522/</p> 
 * <p>Description: 数组反转(颠覆)(java中只对Collection下的类实现了反转，没有对数组实现反转，这里自己写一个实现) </p> 
 * <p>Author:chenyan/陈燕</p>
 */
public class ArrayReverse{
	
	public static int[] arrayReverse(int[] array){
		if(ArrayUtils.isEmpty(array)){
			return null;
		}else{
			//临时变量
			int temp;
			//数组长度，因为多处用到，所以单独定义
			int arrayLength = array.length;
			//两边一起交换位置，所以只需要循环(array.length/2)次
			for(int i = 0;i<arrayLength/2;i++){
				temp = array[i];
				array[i] = array[arrayLength-1-i];
				array[arrayLength-1-i] = temp;
			}
			return array;
		}
	}

	public static void main(String[] args){
//		int[] array = {1,2,3,4,5,6,7,8};
		int[] array = {1,5,3,4,0,6,9,8};
		Utils.printIntArray(array);
		array = ArrayReverse.arrayReverse(array);
		Utils.printIntArray(array);
	}

}
