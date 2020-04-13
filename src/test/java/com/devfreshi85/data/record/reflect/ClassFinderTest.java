package com.devfreshi85.data.record.reflect;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import com.devfreshi85.data.record.model.HeaderModel;
import com.devfreshi85.data.record.model.ReqeustModel;

public class ClassFinderTest {

	@Test
	public void testGetClassListSize() {
		ReqeustModel reqeustModel = new ReqeustModel();
		List<Class<?>> classList = ClassFinder.getClassList(reqeustModel.getClass());
		assertTrue(classList.size() == 2);
		assertEquals(classList.get(0).getName(), "com.devfreshi85.data.record.model.HeaderModel");
		assertEquals(classList.get(1).getName(), "com.devfreshi85.data.record.model.ReqeustModel");
	}
	
	@Test
	public void testGetClassListSuperClass() {
		ReqeustModel reqeustModel = new ReqeustModel();
		List<Class<?>> classList = ClassFinder.getClassList(reqeustModel.getClass());
		assertEquals(classList.get(0).getName(), "com.devfreshi85.data.record.model.HeaderModel");
		assertEquals(classList.get(1).getName(), "com.devfreshi85.data.record.model.ReqeustModel");
	}
	
	@Test
	public void testGetClassListThis() {
		HeaderModel headerModel = new HeaderModel();
		List<Class<?>> classList = ClassFinder.getClassList(headerModel.getClass());
		assertEquals(classList.get(0).getName(), "com.devfreshi85.data.record.model.HeaderModel");
	}

}
