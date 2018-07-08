package daruen.kcomplementary;

public class Pair {
	
	public int firstValue;
	public int complementary;
	
	
	
	public Pair(int firstValue, int complementary) {
		super();
		this.firstValue = firstValue;
		this.complementary = complementary;
	}
	
	public int getFirstValue() {
		return firstValue;
	}
	public void setFirstValue(int firstValue) {
		this.firstValue = firstValue;
	}
	public int getComplementary() {
		return complementary;
	}
	public void setComplementary(int complementary) {
		this.complementary = complementary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * (result + complementary+firstValue);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Pair)){
			return false;
		}
		Pair other=(Pair)obj;
		return((this.complementary==other.complementary&& this.firstValue==other.firstValue)||(this.complementary==other.firstValue&&this.firstValue==other.complementary));
	}
	
	@Override
	public String toString(){
		return "Pair "+firstValue+","+complementary;
		
	}
	
	

}
