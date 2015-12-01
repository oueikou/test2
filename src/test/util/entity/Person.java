package test.util.entity;

import java.io.Serializable;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("person")
public class Person implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6590914720751515246L;
	private String name;
	private int age;
	private int age2;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
