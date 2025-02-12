package com.exceptionandcollection;

import java.util.Iterator;
import java.util.Stack;

public class StackQ5 {

	public static void main(String[] args) {
		Stack<Integer> st  = new Stack<Integer>();
		st.push(129);
		st.push(123);
		st.push(134);
		st.push(112);
		st.push(113);
		System.out.println(st);
		
		Iterator<Integer> it = st.iterator();
		while (it.hasNext()) {
			Integer inte = (Integer) it.next();
			System.out.println(inte);
		}
		
		
		
		System.out.println("Top node  value removed in stack  : " + st.pop());
		System.out.println(st);
		System.out.println("Top Node value in heap: " + st.peek());
		System.out.println("checking Value:  " + st.empty());
		
	}

}
