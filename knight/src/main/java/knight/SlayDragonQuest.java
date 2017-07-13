package knight;

import java.io.PrintStream;

public class SlayDragonQuest implements Quest {
	private PrintStream PrintStream;
	
	public SlayDragonQuest(PrintStream printStream) {
		PrintStream = printStream;
	}

	@Override
	public void embark() {
		PrintStream.println("Embarking on quest to slay the dragon!!");
	}

}
