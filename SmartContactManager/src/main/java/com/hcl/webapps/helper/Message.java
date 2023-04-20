package com.hcl.webapps.helper;

import lombok.Data;

@Data
public class Message {

	private String type;
	private String content;
	public Message(String msg1, String msg2) {
    type = msg1;
    content= msg2;
	}
}
