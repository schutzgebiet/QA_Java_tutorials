
public class Main {

	public static void main(String[] args) {
		
	//	Plane.Square sq = new Square(10);
		
		Plane pl= new Plane(4,6);
		int side = 5;
		
		Plane.Square sq = pl.new Square(side);
		System.out.println(sq.getSide());
		System.out.println(sq.getX());
		//==========================================
		
		int sizeArea = 10;
		
		Plane.Shadow sh = new Plane.Shadow(sizeArea);
		System.out.println(sh);
		sh.setPlane(pl);
		System.out.println(sh);
	}

}
