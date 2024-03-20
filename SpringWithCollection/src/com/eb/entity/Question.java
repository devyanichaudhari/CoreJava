package com.eb.entity;

import java.util.*;
import java.util.Map.Entry;

public class Question {
	private int qId;
	private String qName;
	private Map<String,String> answer;
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question(int qId, String qName, Map<String, String> answer) {
		super();
		this.qId = qId;
		this.qName = qName;
		this.answer = answer;
	}
	public void disp()
	{
		System.out.println("Question Number "+qId+"\nQuestion Name "+qName);
		System.out.println("Answers");
		Set<Entry<String,String>>set = answer.entrySet();
		Iterator<Entry<String, String>> i = set.iterator();
		while(i.hasNext())
		{
			Entry<String, String>entry = i.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
}
