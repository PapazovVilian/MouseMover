package mouseMover;

import java.awt.*;
import javax.swing.*;

class MouseMover {

	public static void main(String args[]) {
		int x = 350;
		int y = 200;
		String getTime = JOptionPane.showInputDialog(null, "Enter time inverval in sec: ");
		int sec = Integer.parseInt(getTime) * 1000;
		try {

			Robot r = new Robot();

			while (true) {
				for (int i = 1; i <= 10; i++) {
					r.mouseMove(x, y);
					Thread.sleep(200);
					x = x + 10;
				}
				x = 350;
				Thread.sleep(sec);
			}

		} catch (Exception e) {

		}

	}

}