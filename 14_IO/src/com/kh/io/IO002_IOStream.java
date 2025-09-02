package com.kh.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IO002_IOStream {
	/*
	 * 입출력(IO, Input Output)
	 *  : 프로그램 상의 데이터를 외부 매체로 출력하거나
	 *  	반대로 외부 매체로부터 프로그램으로 데이터를 입력받고자 할 때
	 *  
	 *   - 스트림 : 프로그램과 외부 매체 사이에 데이터를 주고 받는 통로(단방향)
	 *   
	 *   * 특징
	 *   	- 단방향 : 입력용 스트림, 출력용 스트림이 나눠져 있음
	 *   		=> 입력과 출력을 동시에 하고자 한다면
	 *   			입력용 스트림과 출력용 스트림을 각각 사용해야 함
	 *   
	 *   	- 선입선출(FIFO)
	 *   		: 먼저 들어온 데이터가 먼저 처리됨
	 *   
	 *    * 구분
	 *    	> 사이즈 : 바이트(1byte) / 문자(2byte)
	 *    		- 바이트 스트림 : 1byte씩 데이터가 왔다갔다하는 통로
	 *    		  => 입력용 : InputStream
	 *    	  	  => 출력용 : OUtputStream
	 *    		- 문자 스트림 : 2byte씩 데이터가 왔다갔다하는 통로
	 *    		  => 입력용 : Reader
	 *    		  => 출력용 : Writer
	 *    
	 *    	> 외부 매체와 직접 연결유무
	 *    		- 기반 스트림 : 외부 매체와 직접적으로 연결되는 통로, 필수로 사용해야 함
	 *    		- 보조 스트림 : 기반 스트림을 보조하는 통로
	 *    						속도를 빠르게 하거나, 유용한 기능을 제공하기 위한 스트림
	 *    						단독 사용 불가  반드시 기반 스트림과 함께 사용
	 */

	public static void main(String[] args) {
		//IO Stream을 사용하여 키보드로 입력받고
		//						콘솔창(모니터)에 출력
		
		//  키보드 입력 -----> 프로그램 ------> 콘솔창 출력
		
		InputStream in = System.in; //표준 입력 스트림
		OutputStream out = System.out; //표준 출력 스트림
		
		byte[] buf = new byte[1024];
		// => 입출력 시 버퍼의 데이터를 저장하기 위한 변수
		int len = 0;	//데이터의 길이를 저장할 변수
		
		try {
		while((len = in.read(buf)) != -1) {	
			//값을 계속 읽어오기 위해 반복문 사용
			
			//콘솔창에 입력받은 값을 출력
			out.write(buf, 0, len);
			// write(출력값, 시작위치, 길이)
			out.flush();
			
		}
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			//=> 예외 발생유뮤 상관없이 무조건 실행하는 내용
			
			//=> * 사용한 스트림객체(자원)을 해제(사용 완료처리)
			try {
			in.close();
			out.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}
