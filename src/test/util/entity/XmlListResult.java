package test.util.entity;

import java.util.List;

import com.google.common.collect.Lists;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

@XStreamAlias("chinaTelecomUnicomInfos")
public class XmlListResult<T> extends XmlBaseResult{
	@XStreamOmitField
	private List<T> infos = Lists.newArrayList();
	
	public List<T> getInfos() {
		return infos;
	}

	public void setInfos(List<T> infos) {
		this.infos = infos;
	}
}
