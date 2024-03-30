package org.example.alaska;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;
import java.awt.*;

public class AlaskaApplication {

	public static void main(String[] args)
	{
		JFrame mainWindow = new JFrame("soobakaaaaa");
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWindow.setSize(900,900);

		JPanel pesPanel = new JPanel();
		pesPanel.setBackground(Color.ORANGE);
		mainWindow.add(pesPanel);
		JPanel sobakaPanel = new JPanel();
		pesPanel.setBackground(Color.CYAN);
		pesPanel.setPreferredSize(new Dimension(100,100));
		mainWindow.add(sobakaPanel);

		mainWindow.setVisible(true);
		//SpringApplication.run(AlaskaApplication.class, args);
	}

}
