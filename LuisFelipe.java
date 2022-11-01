package tecProg;

import robocode.AdvancedRobot;
import robocode.ScannedRobotEvent;

public class LuisFelipe extends AdvancedRobot {

	public void run() {

		while (true) {
			setTurnGunRight(360);
			ahead(200);
			turnLeft(120);
			
		}
	}
	
	public void onScannedRobot(ScannedRobotEvent event) {
		
		fireBullet(3);
	}


	

}
