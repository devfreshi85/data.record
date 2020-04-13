package com.devfreshi85.data.record.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.devfreshi85.data.record.stream.RecordType;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Record {

	RecordType recordType();

	int length();

	int order();

	int arraySizeTarget();

	String charset() default "UTF-8";

}
