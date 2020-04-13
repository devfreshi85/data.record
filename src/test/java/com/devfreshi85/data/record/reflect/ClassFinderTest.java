package com.devfreshi85.data.record.reflect;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import com.devfreshi85.data.record.model.HeaderModel;
import com.devfreshi85.data.record.model.ReqeustModel;

/**
 * ClassFinder Test Class
 * 
 */
public class ClassFinderTest {

	final String headerModelStr = "com.devfreshi85.data.record.model.HeaderModel";
	final String reqeustModelStr = "com.devfreshi85.data.record.model.ReqeustModel";

	/**
	 * 부모객체 탐색 size 체크
	 */
	@Test
	public void testGetClassListSize() {
		ReqeustModel reqeustModel = new ReqeustModel();
		List<Class<?>> classList = ClassFinder.getClassList(reqeustModel.getClass());
		assertTrue(classList.size() == 2);
	}

	/**
	 * 부모클래스와 자신클래스 체크
	 */
	@Test
	public void testGetClassListSuperClass() {
		ReqeustModel reqeustModel = new ReqeustModel();
		List<Class<?>> classList = ClassFinder.getClassList(reqeustModel.getClass());
		assertEquals(classList.get(0).getName(), headerModelStr);
		assertEquals(classList.get(1).getName(), reqeustModelStr);
	}

	/**
	 * 부모가 없는 클래스 체크
	 */
	@Test
	public void testGetClassListThis() {
		HeaderModel headerModel = new HeaderModel();
		List<Class<?>> classList = ClassFinder.getClassList(headerModel.getClass());
		assertEquals(classList.get(0).getName(), headerModelStr);
	}

}