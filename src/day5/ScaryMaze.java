package day5;

import java.applet.AudioClip;
import java.awt.AWTException;
import java.awt.Dimension;

import java.awt.Graphics;
import java.awt.Robot;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class ScaryMaze extends JPanel implements Runnable, MouseMotionListener {

	BufferedImage maze;
	final int frameWidth = 800;
	final int frameHeight = 600;

	ScaryMaze() throws Exception {
		// 1. Use this online tool to make a maze image and drop it into your
		// day5 package: http://pixlr.com/editor/
		maze = ImageIO.read(getClass().getResource("maze.png"));
		// 2. set the mouse pointer to the start of your maze using:
		new Robot().mouseMove(60, 110);

		// 3. add a mouse motion listener using:
		addMouseMotionListener(this);

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		int mouseX = e.getX();
		int mouseY = e.getY();
		int mouseColor = maze.getRGB(mouseX, mouseY);
		System.out.println(mouseColor);
		int blue = -16773633;
		int black = -16777216;
		int pink = -65298;
		int white = -1;
		if (mouseColor == blue) {
			System.out.println("Blue");
		} else if (mouseColor == black) {
			System.out.println("Black");
		} else if (mouseColor == pink) {
			System.out.println("Pink");
			JOptionPane.showMessageDialog(null, "YOU WON");
		} else if (mouseColor == white) {
			scare();

		}
	}
	public void playGame(){
		
		
	}

	private void scare() {
		System.out.println("BOO!");

		AudioClip sound = JApplet.newAudioClip(getClass().getResource("scream.wav"));

		sound.play();

		String Phil = "unicorn.hi.png";
		showScaryImage(Phil);

	}

	private void showScaryImage(String imageName) {
		try {
			maze = ImageIO.read(getClass().getResource(imageName));
		} catch (Exception e) {
			System.err.println("Couldnt find this image...");
		}
		repaint();
	}

	public static void main(String[] args) throws Exception {
		SwingUtilities.invokeLater(new ScaryMaze());
	}

	@Override
	public void run() {
		JFrame frame = new JFrame("June's Scary Maze");
		frame.add(this);
		setPreferredSize(new Dimension(frameWidth, frameHeight));
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
	}

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(maze, 0, 0, null);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
	}

}
