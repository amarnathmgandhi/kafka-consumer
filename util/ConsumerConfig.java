package org.searchindex.util;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ConsumerConfig")
public class ConsumerConfig {

	@XmlElement(name = "ConsumerInit")
	public ConsumerInit consumerInit;
	
	@XmlElementWrapper(name = "ConsumerGroups")
	@XmlElement(name = "ConsumerGroup")
	public List<ConsumerGroup> consumerGroups;
	
}
