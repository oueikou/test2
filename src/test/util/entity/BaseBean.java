package test.util.entity;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

public class BaseBean {
	private List<Person> userList;

	public BaseBean() {
		userList = new ArrayList<Person>();
	}

	public List<Person> getUserList() {
		return userList;
	}

	public void setUserList(List<Person> userList) {
		this.userList = userList;
	}

}
