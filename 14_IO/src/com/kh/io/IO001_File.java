package com.kh.io;

import java.io.File;
import java.io.IOException;

public class IO001_File {

	/*
	 * 파일을 다루는 객체 : File (java.util)
	 */
	public static void main(String[] args) {
//		test1();
		test2();

	}
	
	public static void test1() {
		//File 객체 생성
		File f1 = new File("test1.txt");
			// => 파일명만 전달하여 객체 생성(존재하지 않는 파일)
		
		//=> 존재하는 파일명으로 객체 생성
		File f2 = new File("D:\\test2.txt");
		
		//=> 특정 경로에 존재하지 않는 파일명으로 생성
		File f3 = new File("D:\\test3.txt");
		
		//=> 존재하지 않는 경로로 생성
//		File f4 = new File("D:\\tmp\\test4.txt");
		File f4_folder = new File("D:\\tmp");
		File f4 = new File("d:\\tmp\\test4.txt");
		
		//파일 존재하는 지 유뮤 확인
		File f5 = new File("test5.txt");
		
		try {
		// 파일 생성
		f1.createNewFile();
		f2.createNewFile();	// => 존재하는 파일에 대해서는 따로 처리 x
		f3.createNewFile();
//		f4.createNewFile();
		//=> 존재하지 않는 경로에 파일을 생성하려고 하면 예외 발생
		//	폴더를 먼저 생성하고, 그 다음에 파일을 생성
		
		// * 폴더 생성 : mkdir
		f4_folder.mkdir();
		f4.createNewFile();
		//---------------
		
		// * 파일이 존재하는 지 학인 : exists() :boolean
		System.out.println("test1.txt 파일이 존재하는 가?" + f1.exists());
		System.out.println("test5.txt 파일이 존재하는 가?" + f5.exists());
		
		//* 파일인지 확인 : isFile():boolean
		System.out.println("f4 는 파일인가:" + f4.isFile());
		System.out.println("f4_folder 는 파일인가?"+ f4_folder.isFile());
		
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void test2() {
		// * sample 폴더를 생성한 후 myDiary.txt. 파일을 만들어보기
		// sample 폴더 생성
		File folder= new File("sample");
		
		//폴더가 존재하지 않을 경우 생성
		if(folder.exists()) {
			folder.mkdir();
		}
		
		//sample 폴더에 myDiary.txt. 파일 생성
		File file = new File("sample\\myDiary.txt");
		
		try {
			//파일도 존재하지 않을 경우 생성하도록 처리
			if(!file.exists()) 
		file.createNewFile();
			
			//*파일 객체를 통해 파일 정보 조회
			System.out.println("*파일명 : " + file.getName());
			System.out.println("*파일경로 : " + file.getAbsolutePath());
			System.out.println("*파일용량 : " + file.length());
			System.out.println("* 파일상위폴더 : " + file.getParent());
		} catch(IOException e)
		{
			e.printStackTrace();
		}
		
		
		
	}

}
