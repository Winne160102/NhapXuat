package API;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;

public class People {

	public String id;
	public String name;
	public String birthday;
	public String phoneNum;
	public String address;
	
	public People() {
	}
	
	public People(String id, String name, String birthday, String phoneNum, String address) {
		super();
		this.id = id;
		this.name = name;
		this.birthday = birthday;
		this.phoneNum = phoneNum;
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setall(String id, String name, String birthday, String phoneNum, String address) {
		this.id = id;
		this.name = name;
		this.birthday = birthday;
		this.phoneNum = phoneNum;
		this.address = address;
	}
	
	public void output() {
		System.out.println("ID: " + getId());
		System.out.println("Name: " + getName());
		System.out.println("Birthday: " + getBirthday());
		System.out.println("Phone Number: " + getPhoneNum());
		System.out.println("Address: " + getAddress());
	}
	
	public static void inputFile(ArrayList<People> list) {
		try {
			FileReader fReader = new FileReader("C:\\Users\\Admin\\Desktop\\lib java\\Java\\TLQA.txt");
			BufferedReader bReader = new BufferedReader(fReader);
			while(true) {
				String st = bReader.readLine();
				if(st =="" || st == null)break;
				String dt[] = st.split("[;]");
				People data = new People(dt[0], dt[1], dt[2], dt[3], dt[4]);
				list.add(data);
			}
			bReader.close();
			fReader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void outputFile(ArrayList<People> list) {
		try {
			FileWriter fWriter = new FileWriter("C:\\Users\\Admin\\Desktop\\lib java\\Java\\TLQA1.txt");
			BufferedWriter bWriter = new BufferedWriter(fWriter);
			for(People dt:list) {
				String st = dt.getId() + ";" + dt.getName() + ";" + dt.getBirthday() + ";" + dt.getPhoneNum() + ";" + dt.getAddress();
			}
			bWriter.close();
			fWriter.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		ArrayList<People> list = new ArrayList<People>();
		inputFile(list);
		outputFile(list);
	}
}
