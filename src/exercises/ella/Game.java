package exercises.ella;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Game implements MouseListener, ActionListener {

	Timer timer = new Timer(1000, this);
	int time = 0;
	JFrame frame = new JFrame();
	PicturePanel panel = new PicturePanel();
	SideBar bar = new SideBar();
	JPanel mainPanel = new JPanel();
	Emojis emoji = new Emojis();
	int gameNumber = 0;
	boolean checkMe = false;
	boolean checkMe2 = false;
	boolean checkMe3 = false;
	boolean checkMe4 = false;
	boolean checkMe5 = false;
	boolean checkMe6 = false;
	boolean checkMe7 = false;
	boolean checkMeL2 = false;
	boolean checkMeL22 = false;
	boolean checkMeL23 = false;
	boolean checkMeL24 = false;
	boolean checkMeL25 = false;
	boolean checkMeL26 = false;
	boolean checkMeL27 = false;
	JButton imgButton;
	JButton baloonButton;
	JButton sparklesButton;
	JButton backpackButton;
	JButton diamondButton;
	JButton pawprintsButton;
	JButton snakeButton;
	JButton ringButton;
	JButton appleButton;
	JButton bowButton;
	JButton keyButton;
	JButton cloudButton;
	JButton chickenButton;
	JButton roseButton;
	JButton earthButton;
	JButton cactusButton;

	public static void main(String[] args) {

		Game ellasGame = new Game();

	}

	Game() {

		setup();
		timer.start();

	}

	void setup() {

		// System.out.println(xList);
		frame.setSize(1800, 1000);
		// mainPanel.setPreferredSize(new Dimension(500, 500));
		frame.setLayout(new BorderLayout());
		mainPanel.add(panel, BorderLayout.WEST);
		mainPanel.add(bar, BorderLayout.EAST);
		frame.add(mainPanel);
		panel.setPreferredSize(new Dimension(1500, 1000));
		frame.setVisible(true);
		frame.addMouseListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createLevelOneButtons();

	}

	private void addButton(JButton imgButton, String fileName, int xPosition, int yPosition) throws IOException {
		Image img = ImageIO.read(getClass().getResource(fileName));
		imgButton = new JButton(new ImageIcon(img));
		panel.setLayout(null);
		panel.add(imgButton);
		imgButton.addMouseListener(this);
		imgButton.setBorder(null);
		imgButton.setBounds(xPosition, yPosition, 30, 30);
	}

	void createLevelOneButtons() {
		try {
			addButton(baloonButton, "balloon.png", 698, 336);
		} catch (Exception ex) {
			System.out.println(ex);
		}

		try {
			addButton(diamondButton, "diamond.png", 315, 900);

		} catch (Exception ex) {
			System.out.println(ex);
		}

		try {
			addButton(pawprintsButton, "pawprints.png", 1079, 782);

		} catch (Exception ex) {
			System.out.println(ex);
		}
		try {
			addButton(ringButton, "WeddingRing.png", 1460, 500);

		} catch (Exception ex) {
			System.out.println(ex);
		}
		try {
			addButton(snakeButton, "snake.png", 1100, 420);

		} catch (Exception ex) {
			System.out.println(ex);
		}
		try {
			addButton(backpackButton, "backpack.png", 840, 770);

		} catch (Exception ex) {
			System.out.println(ex);
		}
		try {
			addButton(sparklesButton, "sparkles.png", 680, 756);

		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

	void levelTwoButtons() {

		try {
			addButton(appleButton, "apple.png", 503, 931);

		} catch (Exception ex) {
			System.out.println(ex);
		}
		try {
			addButton(bowButton, "bow.png", 953, 903);

		} catch (Exception ex) {
			System.out.println(ex);
		}
		try {
			addButton(cloudButton, "cloud.png", 460, 529);

		} catch (Exception ex) {
			System.out.println(ex);
		}
		try {
			addButton(roseButton, "rose.png", 719, 664);

		} catch (Exception ex) {
			System.out.println(ex);
		}
		try {
			addButton(chickenButton, "chicken.png", 351, 575);

		} catch (Exception ex) {
			System.out.println(ex);
		}
		try {
			addButton(keyButton, "key.png", 953, 903);

		} catch (Exception ex) {
			System.out.println(ex);
		}
		try {
			addButton(earthButton, "earth.png", 1224, 879);

		} catch (Exception ex) {
			System.out.println(ex);
		}
		try {
			addButton(cactusButton, "cactus.png", 578, 588);

		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getX());
		System.out.println(e.getY());
		// if(e.getX() <= 10){
		// ringName.setText("Found me!");
		// ringName.setBounds(foundMeX, findMeY + 40, foundMeWidth,
		// foundMeHeight);

		// }
		// if (e.getX() >= sparklesX - 15 && e.getX() <= sparklesX + 15 &&
		// e.getY() <= sparklesY + 15 && e.getY() >= sparklesY - 15) {
		// bar.foundSparkles();
		// checkMe4 = true;
		// } else if (e.getX() >= ringX - 15 && e.getX() <= ringX + 15 &&
		// e.getY() <= ringY + 15 && e.getY() >= ringY - 15) {
		// bar.foundRing();
		// checkMe2 = true;
		// } else if (e.getX() >= backpackX - 15 && e.getX() <= backpackX + 15
		// && e.getY() <= backpackY + 15 && e.getY() >= backpackY - 15) {
		// bar.foundBackpack();
		// checkMe3 = true;
		// } else if (e.getX() >= pawprintX - 15 && e.getX() <= pawprintX + 15
		// && e.getY() <= pawprintY + 15 && e.getY() >= pawprintY - 15) {
		// bar.foundPawprint();
		// checkMe5 = true;
		// } else if (e.getX() >= diamondX - 15 && e.getX() <= diamondX + 15 &&
		// e.getY() <= diamondY + 15 && e.getY() >= diamondY - 15) {
		// bar.foundDiamond();
		// checkMe6 = true;
		// } else if (e.getX() >= snakeX - 15 && e.getX() <= snakeX + 15 &&
		// e.getY() <= snakeY + 15 && e.getY() >= snakeY - 15) {
		// bar.foundSnake();
		// checkMe = true;
		// }
		// if (checkMe == true && checkMe2 == true && checkMe3 == true &&
		// checkMe4 == true && checkMe5 == true && checkMe6 == true) {
		// JOptionPane.showMessageDialog(null, "Congratulations! You found all
		// the pictures! \n Ready for level 2?");
		// panel.nextLevelPicture();
		// bar.nextLevelBar();
		// gameNumber += 1;
		// }

	}

	void removeButtonFromSideBar(JButton button, boolean check) {

		button.setVisible(false);
		bar.foundBalloon();
		check = true;
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == (baloonButton)) {
			removeButtonFromSideBar(baloonButton, checkMe);
		}
		if (e.getSource() == (pawprintsButton)) {
			removeButtonFromSideBar(pawprintsButton, checkMe2);

		}
		if (e.getSource() == (ringButton)) {
			removeButtonFromSideBar(ringButton, checkMe3);

		}
		if (e.getSource() == (snakeButton)) {
			removeButtonFromSideBar(snakeButton, checkMe4);

		}
		if (e.getSource() == (backpackButton)) {
			removeButtonFromSideBar(backpackButton, checkMe5);

		}
		if (e.getSource() == (sparklesButton)) {
			removeButtonFromSideBar(sparklesButton, checkMe6);

		}
		if (e.getSource() == (diamondButton)) {
			removeButtonFromSideBar(diamondButton, checkMe7);

		}

		if (checkFoundAll()) {
			timer.stop();
			JOptionPane.showMessageDialog(null,
					"Congratulations! You found all the pictures! \n You finished the puzzle in: " + time
							+ " seconds. \n Ready for level 2?");
			panel.nextLevelPicture();
			bar.nextLevelBar();
			gameNumber += 1;
			checkMe = false;
			checkMe2 = false;
			checkMe3 = false;
			checkMe4 = false;
			checkMe5 = false;
			checkMe6 = false;
			checkMe7 = false;
			levelTwoButtons();
			time = 0;
			timer.restart();

		}

		if (e.getSource() == (appleButton)) {
			removeButtonFromSideBar(appleButton, checkMeL2);

		}
		if (e.getSource() == (bowButton)) {
			removeButtonFromSideBar(bowButton, checkMeL22);

		}
		if (e.getSource() == (roseButton)) {
			removeButtonFromSideBar(roseButton, checkMeL23);

		}
		if (e.getSource() == (cloudButton)) {
			removeButtonFromSideBar(cloudButton, checkMeL24);

		}
		if (e.getSource() == (chickenButton)) {
			removeButtonFromSideBar(chickenButton, checkMeL25);

		}
		if (e.getSource() == (earthButton)) {
			removeButtonFromSideBar(earthButton, checkMeL26);

		}
		if (e.getSource() == (cactusButton)) {
			removeButtonFromSideBar(cactusButton, checkMeL27);

		}

		if (checkFoundAllL2()) {
			timer.stop();
			JOptionPane.showMessageDialog(null,
					"Congratulations! You found all the pictures! \n You finished the puzzle in: " + time
							+ " seconds.");
			System.exit(0);
		}
	}

	private boolean checkFoundAll() {
		return checkMe == true && checkMe2 == true && checkMe3 == true && checkMe4 == true && checkMe5 == true
				&& checkMe6 == true && checkMe7 == true;
	}

	private boolean checkFoundAllL2() {
		return checkMeL2 == true && checkMeL22 == true && checkMeL23 == true && checkMeL24 == true && checkMeL25 == true
				&& checkMeL26 == true && checkMeL27 == true;
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		time += 1;
		bar.showTime(time);
	}

}