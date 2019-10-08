package exercises.ella;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class SideBar extends JPanel implements ActionListener, KeyListener {

	JLabel barTitle = new JLabel("FIND:");
	JLabel snakeName = new JLabel("snake");
	JLabel ringName = new JLabel("ring");
	JLabel backpackName = new JLabel("backpack");
	JLabel sparkleName = new JLabel("sparkles");
	JLabel pawprintName = new JLabel("pawprints");
	JLabel diamondName = new JLabel("diamond");
	JLabel balloonName = new JLabel("balloon");
	JLabel appleName = new JLabel("apple");
	JLabel bowName = new JLabel("bow");
	JLabel roseName = new JLabel("rose");
	JLabel cloudName = new JLabel("cloud");
	JLabel chickenName = new JLabel("chicken");
	JLabel earthName = new JLabel("earth");
	JLabel cactusName = new JLabel("cactus");
	JLabel timeName = new JLabel("Time: 0");

	int foundMeX = 76;
	int foundMeWidth = 275;
	int foundMeHeight = 75;
	int findMeY = 90;
	int findMeY2 = findMeY + 40;
	int findMeY3 = findMeY + 80;
	int findMeY4 = findMeY + 120;
	int findMeY5 = findMeY + 160;
	int findMeY6 = findMeY + 200;
	int findMeY7 = findMeY + 240;
	final int BAR1 = 0;
	final int BAR2 = 1;
	int currentBar = BAR1;

	SideBar() {
		setPreferredSize(new Dimension(285, 700));
		// bar.setBounds(1800, 900, 500, 500);
		add(barTitle);
		barTitle.setFont(new Font("Serif", Font.PLAIN, 45));
		setLayout(null);
		barTitle.setBounds(84, 20, 200, 100);
		placingObjectNames();
		setOpaque(true);
		setBackground(Color.PINK);
		repaint();

	}

	private void placeButton(JLabel buttonName, int xPos, int yPos, int width) {
		add(buttonName);
		buttonName.setFont(new Font("Serif", Font.PLAIN, 30));
		buttonName.setBounds(xPos, yPos, width, 75);
	}

	void placingObjectNames() {

		placeButton(snakeName, 102, findMeY, 100);
		placeButton(ringName, 113, findMeY2, 100);
		placeButton(backpackName, 83, findMeY3, 275);
		placeButton(sparkleName, 90, findMeY4, 250);
		placeButton(pawprintName, 83, findMeY5, 275);
		placeButton(diamondName, 87, findMeY6, 250);
		placeButton(balloonName, 95, findMeY7, 250);
		placeButton(timeName, 95, 850, 250);

	}

	void objectNamesLevelTwo() {
		placeButton(appleName, 102, findMeY, 100);
		placeButton(bowName, 109, findMeY2, 90);
		placeButton(roseName, 110, findMeY3, 100);
		placeButton(cloudName, 101, findMeY4, 100);
		placeButton(chickenName, 92, findMeY5, 250);
		placeButton(earthName, 101, findMeY6, 100);
		placeButton(cactusName, 101, findMeY7, 100);

	}

	void nextLevelBar() {
		currentBar += 1;
		if (currentBar > BAR2) {
			currentBar = BAR1;
		}
		if (currentBar == BAR1) {
			setBackground(Color.PINK);

		}
		System.out.println(currentBar);
		if (currentBar == 1) {
			setBackground(Color.BLUE);
			objectNamesLevelTwo();
		}
		repaint();

	}

	void foundSparkles() {

		sparkleName.setVisible(false);

	}

	void foundRing() {

		ringName.setVisible(false);

	}

	void foundBackpack() {

		backpackName.setVisible(false);

	}

	void foundPawprint() {

		pawprintName.setVisible(false);

	}

	void foundDiamond() {

		diamondName.setVisible(false);

	}

	void foundSnake() {

		snakeName.setVisible(false);

	}

	void foundBalloon() {

		balloonName.setVisible(false);

	}

	void foundApple() {

		appleName.setVisible(false);

	}

	void foundBow() {

		bowName.setVisible(false);

	}

	void foundRose() {

		roseName.setVisible(false);

	}

	void foundCloud() {

		cloudName.setVisible(false);

	}

	void foundChicken() {

		chickenName.setVisible(false);

	}

	void foundEarth() {

		earthName.setVisible(false);

	}

	void foundCactus() {

		cactusName.setVisible(false);

	}

	void showTime(int time) {

		timeName.setText("Time: " + time);

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
