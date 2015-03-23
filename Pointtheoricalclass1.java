package point;
import java.util.HashSet;/*posto para fazer a func HasSet<Point>...*/

public class Point {
	/*fields*/
	int x, y;
	public Point(){
		this(0,0);
		/*default initialization of int's*
		x=0;
		y=0; 
		*/
	}
	public Point ( int x){
		this(x,0);
	}

	public Point ( int xx, int yy){
		x=xx;
		y=yy;
	}
	
	public String toString() { /* java cria isto automaticamente, so tens de ir a 'source' e escolher a função que queres. é bom para confirmar se a nossa funçao ta bem feita*/
		return "(" + x + "," + y + ")";
	}
	public static void main(String[] args){
		Point p00_1= new Point();/*new Point(0); new Point(0,0)*/
		Point p00_2= new Point();
		Point p23= new Point(2,3);
		System.out.println("Point (0,0):" + p00_1);
		System.out.println("Point (0,0):" + p23);
		
		System.out.println("identity: "+ (p00_1=p00_1));
		System.out.println("identity between (0,0): " + ( p00_1==p00_2));
		System.out.println("identity between (0,0) and (2,3): " + ( p00_1==p23));
		
		/* when we override equals, we should override hash table too*/
		
		System.out.println("equality: " + p00_1.equals(p00_1));
		System.out.println("equality: between (0,0): " + p00_1.equals(p00_2));
		System.out.println("equality: (0,0) and(2,3) : " + p00_1.equals(p23));
	
		
		HashSet<Point> hsp = new HashSet<Point>();
		hsp.add(p00_1);
		hsp.add(p00_2);
		hsp.add(p23);
		
		System.out.println("Hash Set: " + hsp);
		
		p00_1 = null;
	}	
				
				
				
	/* ir a source, e fazer generate do hascode*/
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Point))/* linha alterada em comp. com o cod original*/
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	
}
