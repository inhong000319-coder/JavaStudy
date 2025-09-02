package com.kh.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.io.model.Product;

public class IO003_FileStream {

	public static void main(String[] args) {
		//fileSave();
		//fileRead();
		//objectSave();
		objectRead();

	}
	
	//프로그램 ----> 파일 : 출력
	public static void fileSave() {
		// * 기반 스트림 : FileWriter. 파일을 직접적으로 연결하여 2바이트씩 출력하는 스트림
		// * 보조 스트림 : BufferedWriter. 속도 향상을 도와주는 보조 스트림
		
		System.out.println(" ********* file save *********");
		
		/*
		BufferedWriter bw = null;
		try {
		// 1. 기반 스트림 생성
		FileWriter fw = new FileWriter("file1.txt");
		
		//2.보조 스트림 생성
		BufferedWriter bw = new BufferedWriter(fw);
		// => 보조 스트림 개개체 생성 시 기반 스트림 객체를 전달
		*/
		
		
		
		//try with resources 구문 => 자원을 알아서 해제해주는 구문
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("file1.txt")))
		{
		
		bw.write("기반 스트림으로 출력");
		bw.write("입출력 재밌다");
		bw.write("오늘은 비가 왔다");
		bw.newLine();		// 줄바꿈 처리
		
				
		bw.flush();
		
//		bw.close();
	
		} catch (IOException e) {
			e.printStackTrace();
		} /*finally {
			
			if (bw != null) {
				bw.close();
			}
				
			} catch(IOException e) { 
				e.printStacTrace():
			}
			*/
			
		}
	
		public static void fileRead() {
			//파일 ------> 프로그램 : 입력
			
			// * FileReader : 기반스트림
			// * BufferedReader : 보조스트림. 한 줄씩 데이터를 읽어오도록 도와줌
			
			System.out.println(" **** file read ****");
			
			try(BufferedReader br = new BufferedReader(new FileReader("file1.txt"))) {
				
				// * 파일 내용 읽어오기
				/*
				System.out.println(br.readLine());
				System.out.println(br.readLine());
				System.out.println(br.readLine());
				*/
				// => 읽어올 내용이 없을 땐 null로 반환됨
				
				String data;
				while((data = br.readLine()) != null) {
					System.out.println(data);
					
				}
				
			} catch(FileNotFoundException e) {
				// => 파일이 존재하지 않을 경우 발생
				e.printStackTrace();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		public static void objectSave() {
			//프로그램 ---> 파일 : 출력. 객체에 저장된 데이터
			
			// * 출력할 데이터
			Product p1 = new Product("스피커", 50000);
			Product p2 = new Product("키보드", 77000);
			Product p3 = new Product("노트", 5000);
			
			// * 기반 스트림 : FileOUtputStream. 1바이트 단위로 파일에 출력하는 스트림
			// * 보조 스트림 : ObjcectOutputStream. 객체 단위로 출력을 도와주는 스트림
			
			try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file2.txt"))) {
				
				
				oos.writeObject(p1);
				oos.writeObject(p2);
				oos.writeObject(p3);
				
			} catch(IOException e) {
				e.printStackTrace();
			}
			
		}

		
		public static void objectRead() {
			// 파일 ---> 프로그램 : 입력. 객체 데이터를 입력
			
			// * 기반 스트림 : FileInputStream
			// * 보조 스트림 : ObjectInputStream
			
			try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("file2.txt"))) {
				
				System.out.println(ois.readObject());
				System.out.println(ois.readObject());
				System.out.println(ois.readObject());
				/*
				System.out.println(ois.readObject());
				*///=> 더 이상 읽어올 데이터가 없을 경우
				
				while(true) {
					System.out.println(ois.readObject());
				}
				} catch(EOFException e) {
				//e.printStackTrace();
			}
			 catch (IOException | ClassNotFoundException e) {
				e.printStackTrace();
		}
			
	
			
		}
}

		



