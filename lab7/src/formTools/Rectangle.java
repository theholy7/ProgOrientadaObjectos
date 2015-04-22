package formTools;

public class Rectangle extends Form {
	
	int xPos;
	int yPos;
	int rHeight;
	int rWidth;
	
	public Rectangle(int xPos, int yPos, int rHeight, int rWidth) {
		super();
		this.xPos = xPos;
		this.yPos = yPos;
		this.rHeight = rHeight;
		this.rWidth = rWidth;
	}

	@Override
	public int[] intersection(int yLine) {
		
		
		if(yLine == yPos){
			int[] lineIntersection = new int[rWidth];
			for(int i = 0; i < rWidth; i++)
				lineIntersection[i] = xPos + i;
			return lineIntersection;
		}
		else if(yLine > yPos && yLine < yPos + rHeight - 1){
			int[] lineIntersection = new int[2];
			lineIntersection[0] = xPos;
			lineIntersection[1] = xPos + rWidth - 1;
			return lineIntersection;
		}
		else if(yLine == yPos + rHeight -1){
			int[] lineIntersection = new int[rWidth];
			for(int i = 0; i < rWidth; i++)
				lineIntersection[i] = xPos + i;
			return lineIntersection;
		}
		
		return new int[0];
	}
	
	
	

}
