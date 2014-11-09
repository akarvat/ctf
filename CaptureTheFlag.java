

import zen.core.Zen;

public class CaptureTheFlag {

	public static void main(String[] args) {
		Zen.connect("capture the flag");
		
		Zen.write("aakashx", 250);
		Zen.write("aakashy", 250);
		Zen.write("aakashteam", "red");
		
		Zen.create(1000, 500);
		player me = new player("aakash");
		game g = new game();
		team redTeam = new team("red");
		redTeam.addPlayer(new player("keshav"));
		redTeam.addPlayer(new player("divya"));
		redTeam.addPlayer(new player("ruchi"));
		redTeam.addPlayer(new player("alejandro"));
		redTeam.addPlayer(new player("nathan"));
		redTeam.addPlayer(me);
		g.teams.add(redTeam);
		
		team blueTeam = new team("blue");
		blueTeam.addPlayer(new player("nicolas"));
		blueTeam.addPlayer(new player("anoop"));
		blueTeam.addPlayer(new player("amogh"));
		blueTeam.addPlayer(new player("rishi"));
		blueTeam.addPlayer(new player("rohan"));
		g.teams.add(blueTeam);
		
		while (true) {
			Zen.setBackground("green");
			Zen.setColor("white");
			Zen.drawLine(500, 0, 500, 500);
			
			if (Zen.isKeyPressed("left") && getX() > 0) {
				Zen.write("aakashx", getX() - 10);
			}
			if (Zen.isKeyPressed("right") && getX() < 1000) {
				Zen.write("aakashx", getX() + 10);
			}
			if (Zen.isKeyPressed("up") && getY() > 0) {
				Zen.write("aakashy", getY() - 10);
			}
			if (Zen.isKeyPressed("down") && getY() < 500) {
				Zen.write("aakashy", getY() + 10);
			}
			if (getX()>500 && blueTeam.isTouching(me)){
				Zen.write("aakashx",  250);
				Zen.write("aakashy", 250);
			}
			
			g.draw();
			g.move();
			Zen.buffer(33);
		}
	}

	private static int getY() {
		return Zen.readInt("keshavy");
	}

	private static int getX() {
		return Zen.readInt("keshavx");
	}

}
