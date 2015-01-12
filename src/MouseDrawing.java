/*
 * ZADATAK: Nacrtati panel da kada se klikne misem iscrta se krug
 * 
 */

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


import javax.swing.JFrame;
import javax.swing.JPanel;

public class MouseDrawing {
	public static void main(String[] args) {
		
		JFrame window = new JFrame("Window");
		JPanel panel = new JPanel();
		MouseHandler handler = new MouseHandler();
		panel.addMouseListener(handler);
		window.add(panel);
		window.setSize(400, 400);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}

private static class MouseHandler implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {//iz nekog razloga je sporije kada se implementira ovde ???
		
		}

	@Override
	public void mousePressed(MouseEvent e) {
		Component source = (Component) e.getSource();
		Graphics g = source.getGraphics();
		g.setColor(Color.BLUE);
		g.fillOval(e.getX(),e.getY(), 30, 30);//uzima koordinate ispod kursora misa prilikom klika 
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
	}
}
