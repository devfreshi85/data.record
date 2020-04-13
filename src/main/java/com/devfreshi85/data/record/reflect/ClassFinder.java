package com.devfreshi85.data.record.reflect;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ClassFinder {

	/**
	 * 파라메타로 전달된 클래스의 부모클래스를 탐색하여, 최상위 클래스부터 자기 자신까지의 클래스 리스트를 반환합니다.
	 * 
	 * @param 자기자신과
	 *            부모클래스를 리스트로 전달 받은 class
	 * @return
	 */
	public static List<Class<?>> getClassList(Class<?> clazz) {
		List<Class<?>> classList = new LinkedList<Class<?>>();
		Class<?> packetClass = clazz;
		// 전체 Class를 조회하고 저장
		for (; packetClass != null; packetClass = packetClass.getSuperclass()) {
			if(!Object.class.equals(packetClass)) {
				classList.add(packetClass);
			}
		}

		// 상속 받은 부모 객체부터 읽을 수 있도록 역순으로 정렬
		Collections.reverse(classList);
		return classList;
	}

}
