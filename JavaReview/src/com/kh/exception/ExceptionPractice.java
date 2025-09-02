package com.kh.exception;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExceptionPractice {
	//파일 경로를 저장할 변수
	private final static String FILE_PATH = "todos.txt";

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		// 파일에 저장된 내용이 있을 경우
		//	파일 ---> 프로그램 (입력) 데이터를 읽어와서 List 에 추가
		
		lodadTodos(list);
		
		
		
		
		while(true) {
		System.out.println("===== TODO LIST =====");
		System.out.println("1. 할 일 추가");
		System.out.println("2. 전체보기");
		System.out.println("3. 파일에 저장");
		System.out.println("9. 종료하기");
		
		System.out.print(" 선택 : ");
		int menu = sc.nextInt();
		sc.nextLine();		// 버퍼 비운다는 뜻
		
		
		switch(menu) {
		case 1:
			System.out.print("추가할 할일 입력 : ");
			String todo = sc.nextLine();
			
			list.add(todo);		//리스트에 할일 추가
			break;
		case 2:
			System.out.println("---- 전체 목록 ----");
			
			for(int i=0; i<list.size(); i++) {
				System.out.println(list.get(i));
				
			}
			break;
		case 3:
			//List 에 저장된 할 일 목록을 파일에 저장
			//	프로그램 ---> 파일 : 출력
			saveTodos(list);
			
			
			
		case 9:
			System.out.println("종료합니다");
			//break; //=> switch 만 빠져나옴. 종료X
			return;		//메소드 자체를 종료시킴
			default:
				System.out.println("없는 메뉴입니다. 다시 선택해주세요.");
		}

	}

	}
	/**
	 * 파일에 할 일 목록 저장
	 * 
	 * @param todos 저장할 할 일 목록
	 */
	public static void saveTodos(List<String> todos) {
		
		// * 출력용 스트림 : FileWriter, BufferedWriter
		
		//* try with resources 구문 => 자원 해제를 자동으로 (알아서) 해주는 구문
		// String filepath = "todos.txt";
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(filepath))) {
			
			// 반복문을 사용하여 리스트 안에 저장된 할 일들을 하나씩 파일로 출력
			for(String todo : todos) {
				
				bw.write(todo);
				bw.newLine();
			}
			
			System.out.println("파일에 저장이 완료되었습니다.");
			
		} catch (IOException e) {
			e.printStackTrace(); //오류 확인용
		}
		
	}
	
	/**
	 * 파일에 저장된 내용을 읽어오는 메소드
	 * 
	 * @param todos 읽어온 내용을 저장할리스트
	 * 
	 */
	public static void loadTodos(List<String> todos) {
		
		//파일이 있는 경우에 읽어오기
		
		//* 파일이 없는 경우에는 메소드 종료 File객체. exists()
		File file = new File(FILE_PATH);
		if(!file.exists()) {
			return;
		}
		
		//*파일에서 데이터를 읽어오기 위해 입력용 스트림
		//	FileReader : 기반스트림, BufferedReader : 보조스트림
		
		try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
			
			String line;
			while( (line = br.readLine()) != null) {
				todos.add(line);
				
			}
			System.out.println("파일에 저장된 내용을 모두 읽어왔습니다.");
			
		}catch (FileNotFoundException e) {
			System.out.println("읽어올 내용이 없습니다.");
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
