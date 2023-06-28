package test;

import java.util.ArrayList;
import java.util.Scanner;

public class SinhVien {
	//attributes
	private String idSV;
	private String name;
	private ArrayList<String> subject = new ArrayList<String>(); 
	
	//constructor all attributes
	public SinhVien(String idSV, String name, ArrayList<String> subject) {
		this.idSV = idSV;
		this.name = name;
		this.subject = subject;
	}
	
	//constructor
	public SinhVien() {
	}
	
	//get&set attributes
	public String getIdSV() {
		return idSV;
	}
	public void setIdSV(String idSV) {
		this.idSV = idSV;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setall(String idSV, String name, ArrayList<String> subject) {
		this.idSV = idSV;
		this.name = name;
		this.subject = subject;
	}
	
	//input 
	public void input() {
		Scanner sc = new Scanner(System.in);
		idSV = sc.nextLine();
		name = sc.nextLine();
		while(true) {
			String st = new Scanner(System.in).nextLine();
			if(st==null || st=="") break;
			this.subject.add(st);
		}
	}
	public void output() {
		System.out.println("ID Student: " + getIdSV());
		System.out.println("Name: " + getName());
		for(int i=0; i<this.subject.size(); i++) {
			System.out.println("Subject: " + this.subject.get(i));
		}
	}
}
