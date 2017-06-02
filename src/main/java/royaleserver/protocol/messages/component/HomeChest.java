package royaleserver.protocol.messages.component;

import royaleserver.logic.Chest;
import royaleserver.protocol.messages.Component;
import royaleserver.utils.DataStream;

public class HomeChest extends Component {
	public static final byte STATUS_STATIC = 0;
	public static final byte STATUS_OPENED = 1;
	public static final byte STATUS_OPENING = 8;

	public boolean first;
	public int slot;
	public Chest chest;
	public byte status;
	public int ticksToOpen; // Remains ticks to open

	public HomeChest() {
		first = false;
		slot = 0;
		chest = Chest.by("Silver");
		status = STATUS_STATIC;
		ticksToOpen = 0;
	}

	@Override
	public void encode(DataStream stream) {
		super.encode(stream);

		stream.putRrsInt32(0);
		stream.putRrsInt32(4);

		if (first) {
			stream.putRrsInt32(slot + 1);
		}

		stream.putSCID(chest.getScid());

		stream.putByte(status);
		if (status == STATUS_OPENING) {
			stream.putRrsInt32(ticksToOpen);
			stream.putRrsInt32(chest.getOpenTicks());

			stream.putRrsInt32((int)System.currentTimeMillis());
		}

		stream.putRrsInt32(slot);

		stream.putRrsInt32(1);
		stream.putRrsInt32(slot);
		stream.putRrsInt32(0);
	}

	@Override
	public void decode(DataStream stream) {
		super.decode(stream);
	}
}

