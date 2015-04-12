package lab1_67929;

public class Lab1 {
	//INSTANCE FIELDS TYPE INTEGER
	Integer x;
	Integer y;
	
	public Lab1(Integer x, Integer y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((x == null) ? 0 : x.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lab1 other = (Lab1) obj;
		if (x == null) {
			if (other.x != null)
				return false;
		} else if (!x.equals(other.x))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Lab1 [x=" + x + ", y=" + y + "]";
	}
	
	
	
	

}
