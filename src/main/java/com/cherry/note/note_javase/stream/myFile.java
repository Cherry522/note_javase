package com.cherry.note.note_javase.stream;

import java.io.File;

/** 
 * <p>Copyright: All Rights Reserved</p>  
 * <p>Company: Cherry的测试项目   https://github.com/Cherry522/</p> 
 * <p>Description: 文件的一些操作 </p> 
 * <p>Author:chenyan/陈燕</p>
 */
public class myFile{

	public static void main(String[] args){
		String filePath = "C:\\Users\\chenyan\\Desktop\\02-JavaSE";
		StringBuilder sb = myFile.listFile(new File(filePath),0,new StringBuilder());
		System.out.println(sb.toString());
	}
	
	/**
	 * <br/>Description:列出所有文件名
	 * <p>Author:chenyan/陈燕</p>
	 * @param file
	 */
	public static StringBuilder listFile(File file,int level,StringBuilder sb){
		level++;
		if(sb.length() > 0){
			for(int i = 0;i<level;i++){
				sb.append(" ");
			}
		}
		sb.append("--");
		sb.append(file.getName());
		sb.append("\n");
		
		if(file.isDirectory()){
			File[] files = file.listFiles();
			for(File file2:files){
				myFile.listFile(file2,level,sb);
			}
		}
		
//		for(File file2:files){
//			if(file.isDirectory()){
//				sb.append("  ");
//				myFile.listFile(file2);
//			}
//		}
		return sb;
	}

}
