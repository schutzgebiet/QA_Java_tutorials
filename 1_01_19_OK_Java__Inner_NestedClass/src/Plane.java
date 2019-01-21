import java.util.Comparator;

public class Plane {
	
	private int x;
	private int y;
	
	public Plane(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
//	public int getSide() { это класс отец,родитель не видет детей
//		return side;
//	}
	
	@Override
	public String toString() {
		return "Plane [x=" + x + ", y=" + y + "]";
	}
	
//8888888888888888888888888
	
	public class Square{ //если статик то он первый и метод getX не работает
		private int side;

		public Square(int side) {
			super();
			this.side = side;
		}

		public int getSide() {
			return side;
		}

		public void setSide(int side) {
			this.side = side;
		}
		
		public int getX() { //тут видит потому-что в одном классе
			return x;
		}

		@Override
		public String toString() {
			return "Square [side=" + side + "]";
		}
		
		public void test() {
			
			// Test t = new Test();
			class Test{
				
			}
			Test t = new Test();
		}
	}
	//888888888888888888888888888888888888
	public static class Shadow{ //Nested Class
		private int size;
		private Plane p;

	public Shadow(int size) {
		super();
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public void setPlane(Plane p) {
		this.p = p;
	}

	@Override
	public String toString() {
		return "Shadow [size=" + size + " PLane: "+ p +"]";
	}
		
		
	}
	
	public Comparator getComp() 
	{
	return new Comparator<Integer>() {

			@Override
			public int compare(Integer i1,Integer i2) {
				
				return i1 - i2;
			}	
		};
	}
	
	
}
