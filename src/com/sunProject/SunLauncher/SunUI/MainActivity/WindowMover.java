package com.sunProject.SunLauncher.SunUI.MainActivity;

import java.awt.Cursor;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

	public class WindowMover extends MouseAdapter {

	    private Point click;

	  
	    private JFrame Activity;

	    public WindowMover(JFrame window) {
	        this.Activity = window;
	    }

	    @Override
	    public void mouseDragged(MouseEvent e) {
	        // If the initial click point isn't null (can happen sometimes)
	        if (click != null) {
	            // Get the dragged point
	            Point draggedPoint = MouseInfo.getPointerInfo()
	                    .getLocation();

	            // And move the window
	            Activity.setLocation(new Point((int) draggedPoint.getX()
	                    - (int) click.getX(), (int) draggedPoint
	                    .getY() - (int) click.getY()));
	        }
	    }

	    @Override
	    public void mousePressed(MouseEvent e) {
	        click = e.getPoint();
	        Activity.setCursor(Cursor.MOVE_CURSOR);
	        
	    }

	}

