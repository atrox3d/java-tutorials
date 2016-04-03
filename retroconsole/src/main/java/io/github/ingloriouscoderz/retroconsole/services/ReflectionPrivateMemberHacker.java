package io.github.ingloriouscoderz.retroconsole.services;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionPrivateMemberHacker {

	public static Field getPublicVersionOfField(Object obj, String fieldName) {
		Field field = null;
		
		try {
			field = obj.getClass().getDeclaredField(fieldName);
			field.setAccessible(true);
		} catch (NoSuchFieldException e1) {
			e1.printStackTrace();
		} catch (SecurityException e1) {
			e1.printStackTrace();
		} catch (IllegalArgumentException e1) {
			e1.printStackTrace();
		} 
		return field;
	}
	
	public static void setPrivateFieldValue(Object object, Field field, Object value) {
		try {
			field.set(object, value);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
	
	public static <R> R getPrivateFieldValue(Object object, Field field) {
		R result = null;
		
		try {
			result = (R) field.get(object);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public static <R,P> R invokePrivateMethod(Object obj, Method method, P... params) {
		R value = null;
		try {
			value = (R)method.invoke(obj, params);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return value;
	}

	public static Method getPublicVersionOfMethod(Object obj, String methodName, Class... params) {
		Method method = null;
		try {
			method = obj.getClass().getDeclaredMethod(methodName, params);
			method.setAccessible(true);
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		return method;
	}
}



