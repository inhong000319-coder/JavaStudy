package com.kh.collection.map.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.collection.map.model.vo.Snack;

public class Run {

	public static void main(String[] args) {

		HashMap<String, Snack> hm = new HashMap<>();
		
		//List, Set 계열의 클래스들은 Collection 을 구현한 클래스
		//=> 데이터를 추가할 때 공통적으로 add 메소드 사용
		
		//Map 계열은 Collection 을 구현한 클래스가 아님
		//=> 데이터를 추가할 때 put 메소드 사용 키-밸류 세트로 저장해야 함
		
		// 1. put(K key, V value) : Map 에 키-밸류 세트로 추가해주는 메소드
		hm.put("새우깡", new Snack("고소", 500));
		hm.put("프링글스", new Snack("짠맛", 2000));
		hm.put("먹태깡", new Snack("먹태맛", 600));
		
		hm.put("고소미", new Snack("고소", 500));
		
		System.out.println(hm);
		// => 저장 순서 유지 x, value 값이 중복되도 key 값이 중복되지 않으면 잘 저장됨.
		
		hm.put("새우깡", new Snack("매운맛",777));
		
		System.out.println(hm);
		//=> 동일한 key 값으로 데이터를 추가하는 경우, value 값이 덮어씌워짐.
		
		//2. get(Object key) : V => Map 에서 해당 key 값을 가지는 value 값을 반환
		
		Snack s = hm.get("먹태깡");
		System.out.println(s/*.toString()*/);
		
		// 3. size() =>Map 에 저장된 데이터 개수 반환
		System.out.println("저장된 데이터 수 : " + hm.size());
		
		//4. replace(K key, V value)
		//	=> Map 에서 해당 key 값을 찾아서
		hm.replace("프링글스", new Snack("갈릭맛", 800));
		System.out.println(hm.get("프링글스"));
		
		// 5. remove(Object key)
		//	=> Map 에서 해당 key 값을 찾아서 key-value 세트를 삭제
		hm.remove("새우깡");
		System.out.println(hm);
		//--------------------------------
		
		//Map 에 저장된 모든 데이터를 출력하고자 할 때
		//for each 문 (향상된 for 문)-> x
		/*
		 * for( : hm) { 	//선언할 변수를 특정할 수 없음
		 * 
		 * }
		 */
		
		//ArrayList 변환 => x
		//ArrayList list = new ArrayList(hm);
		// => Map 은 Collection 기반이 아니기 때문에 불가
		
		//Iterator 사용 => x
		// Iteratior it = hm.iterator();	//Map 은 iterator() 메소드 x
		
		//Map -> Set 바꿔주는 메소드 이용
		//Map -> Set -> Iterator
		
		//1. keySet()	-> 키값들로만 Set 형태로 반환
		
		//	1) Map 에 있는 키들만 Set 에 담기
		Set<String> kSet = hm.keySet();
		//	2) kSet 을 Iterator 담기
		Iterator<String> itKey = kSet.iterator();
		
		// 3) 반복문 사용하여 데이터 접근
		while(itKey.hasNext()) {
			String key = itKey.next();
			
			Snack value = hm.get(key);
			
			System.out.println(key + ":" + value);
		}
		
		// 2. entrySet() 	-> 키-밸류 데이터를 Entry 로 감싼 Set 반환
		
		//	1) hm.entrySet() : Set
		Set< Entry <String, Snack>> entrySet = hm.entrySet();
		
		//	2) entrySet.iterator():Iterator
		Iterator<Entry<String, Snack>> itEntry = entrySet.iterator();
		
		//	3) 반복문
		while(itEntry.hasNext()) {
			Entry<String, Snack> entry= itEntry.next();
			
			String key = entry.getKey();
			Snack value = entry.getValue();
			
			System.out.println(key + ": :" + value);
			
		}
		
	}

}
