package com.tarik02.clashroyale.server.protocol.messages.client;

import com.tarik02.clashroyale.server.protocol.Info;
import com.tarik02.clashroyale.server.protocol.messages.Message;
import com.tarik02.clashroyale.server.protocol.messages.MessageFactory;
import com.tarik02.clashroyale.server.utils.DataStream;

public class Login extends Message {
	public static final short ID = Info.LOGIN;

	public Login() {
		super(ID);
	}

	@Override
	public void encode(DataStream stream) {
		super.encode(stream);
	}

	@Override
	public void decode(DataStream stream) {
		super.decode(stream);
	}
}
