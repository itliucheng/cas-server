package com.cas.global;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jasig.services.persondir.IPersonAttributes;
import org.jasig.services.persondir.support.AttributeNamedPersonImpl;
import org.jasig.services.persondir.support.StubPersonAttributeDao;

public class CustomUserMessage extends StubPersonAttributeDao{
	
	@Override
	public IPersonAttributes getPerson(String uid) {
		Map<String,List<Object>> attributes = new HashMap<String,List<Object>>();
		attributes.put("uid", Collections.singletonList((Object)uid));
		attributes.put("cnblogUsername", Collections.singletonList((Object)"itliucheng"));
		return new AttributeNamedPersonImpl(attributes);
	}

}
