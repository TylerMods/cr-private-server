package com.tarik02.clashroyale.server.protocol.messages.client;

import com.tarik02.clashroyale.server.protocol.Handler;
import com.tarik02.clashroyale.server.protocol.Info;
import com.tarik02.clashroyale.server.protocol.messages.Message;
import com.tarik02.clashroyale.server.utils.DataStream;

public class AskForAvatarRankingList extends Message {
	public static final short ID = Info.ASK_FOR_AVATAR_RANKING_LIST;

	public byte unknown_0;

	public AskForAvatarRankingList() {
		super(ID);

		unknown_0 = 0;
	}

	@Override
	public void encode(DataStream stream) {
		super.encode(stream);

		stream.putByte(unknown_0);
	}

	@Override
	public void decode(DataStream stream) {
		super.decode(stream);

		unknown_0 = stream.getByte();
	}

	public boolean handle(Handler handler) throws Throwable {
		return handler.handleAskForAvatarRankingList(this);
	}
}
