package dto;

public class Truck extends Car{
		private double weight;

		public Truck() {
		}

		public Truck(String model, int year, double engine, boolean ac, double weight) {
			super(model, year, engine, ac);
			this.weight = weight;
		}
		
		public int compareTo(Truck other) {
			return this.weight > other.weight? 1 : this.weight < other.weight ? -1 : 0;
		}

		@Override
		public String toString() {
			return super.toString() + "Truck [weight=" + weight + "]";
		}
		
		
	
}
