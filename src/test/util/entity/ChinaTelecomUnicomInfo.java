package test.util.entity;

public class ChinaTelecomUnicomInfo extends XmlBaseInfo {
	public ChinaTelecomUnicomInfo() {

	}

	public ChinaTelecomUnicomInfo(String telInput) {
		super();
		this.telInput = telInput;
	}

	// private String telNum;
	// private String name;
	// private String address;
	// private String version;
	private String telInput;

	// private String nameInput;
	// private String addressInput;

	/*
	 * public String getTelNum() { return telNum; }
	 * 
	 * public void setTelNum(String telNum) { this.telNum = telNum; }
	 * 
	 * public String getName() { return name; }
	 * 
	 * public void setName(String name) { this.name = name; }
	 * 
	 * public String getAddress() { return address; }
	 * 
	 * public void setAddress(String address) { this.address = address; }
	 * 
	 * public String getVersion() { return version; }
	 * 
	 * public void setVersion(String version) { this.version = version; }
	 */

	public String getTelInput() {
		return telInput;
	}

	public void setTelInput(String telInput) {
		this.telInput = telInput;
	}

	/*
	 * public String getNameInput() { return nameInput; }
	 * 
	 * public void setNameInput(String nameInput) { this.nameInput = nameInput; }
	 * 
	 * public String getAddressInput() { return addressInput; }
	 * 
	 * public void setAddressInput(String addressInput) { this.addressInput = addressInput; }
	 */
}
