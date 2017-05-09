import java.util.Timer;
import java.util.TimerTask;
import java.io.*;

public class TimeDefinedInput {
	private static String inputStr = "";

	TimerTask task = new TimerTask() {
		public void run() {
			if (inputStr.equals("")) {
				System.out.println("you input nothing. exit...");
				System.exit(0);
			}
		}
	};

	public void getInput() throws Exception {
		Timer timer = new Timer();
		timer.schedule(task, 5000);

		System.out.println("Input within 5 seconds");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		inputStr = in.readLine();
		timer.cancel();
		System.out.println("you have entered: " + inputStr);

	}

	public static void main(String[] args) {
		try {
			(new TimeDefinedInput()).getInput();

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
