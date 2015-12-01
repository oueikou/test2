package test.util.entity;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

@XStreamAlias("data")
public class XmlBaseResult {
	@XStreamOmitField
	private XmlMessage xmlMessage;

	public XmlMessage getXmlMessage() {
		return xmlMessage;
	}

	public void setXmlMessage(XmlMessage xmlMessage) {
		this.xmlMessage = xmlMessage;
	}

}
