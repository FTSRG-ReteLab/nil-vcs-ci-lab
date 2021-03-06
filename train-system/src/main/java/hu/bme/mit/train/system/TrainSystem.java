package hu.bme.mit.train.system;

import hu.bme.mit.train.controller.TrainControllerImpl;
import hu.bme.mit.train.interfaces.TrainController;
import hu.bme.mit.train.interfaces.TrainSensor;
import hu.bme.mit.train.interfaces.TrainUser;
import hu.bme.mit.train.sensor.TrainSensorImpl;
import hu.bme.mit.train.user.TrainUserImpl;

import java.util.Timer;
import java.util.TimerTask;


public class TrainSystem {



	private TrainController controller = new TrainControllerImpl();
	private TrainUser user = new TrainUserImpl(controller);
	private TrainSensor sensor = new TrainSensorImpl(controller, user);
	private Timer timer = new Timer();
	private TimerTask task;


	public TrainController getController() {
		return controller;
	}

	public TrainSensor getSensor() {
		return sensor;
	}

	public void setUpTimer(){
		 task = new TimerTask() {
			@Override
			public void run() {
				controller.followSpeed();
			}
		};

	}

	public TrainUser getUser() {
		return user;
	}

	public void startSystem() {
		timer.scheduleAtFixedRate(task,1000,1000);
	}

}
