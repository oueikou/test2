package test.util.entity;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("xmlMessage")
public class XmlMessage {
	private String status;
	private String value;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
