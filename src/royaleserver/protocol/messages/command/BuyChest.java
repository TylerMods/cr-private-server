package royaleserver.protocol.messages.command;

import royaleserver.protocol.messages.Command;
import royaleserver.protocol.messages.CommandHandler;
import royaleserver.utils.DataStream;

public class BuyChest extends Command {
	public static final short ID = 516;

	public int tickStart;
	public int tickEnd;
	public long accountID;

	public byte unknown_0;

	public BuyChest() {
		super(ID);
	}

	@Override
	public void decode(DataStream stream) {
		super.decode(stream);

		tickStart = stream.getRrsInt32();
		tickEnd = stream.getRrsInt32();

		accountID = stream.getRrsLong();
		unknown_0 = stream.getByte();
	}

	@Override
	public boolean handle(CommandHandler handler) throws Throwable {
		return handler.handleBuyChestCommand(this);
	}
}
