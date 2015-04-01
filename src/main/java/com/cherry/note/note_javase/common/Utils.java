package com.cherry.note.note_javase.common;

import org.apache.commons.lang3.ArrayUtils;

/** 
 * <p>Copyright: All Rights Reserved</p>  
 * <p>Company: Cherry的测试项目   https://github.com/Cherry522/</p> 
 * <p>Description: 工具类 </p> 
 * <p>Author:chenyan/陈燕</p>
 */
public class Utils{
	
	public static void printIntArray(int[] array){
		if(ArrayUtils.isEmpty(array)){
			return;
		}else{
			for(int i:array){
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
