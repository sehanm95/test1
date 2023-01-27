package ch;
import java.util.ArrayList;
import java.util.List;

public class test {
	List<Double> numbers;
	
	public test(){
		this.numbers = new ArrayList<Double>();
	}
	
	public test(List<Double> numbers){
		this.numbers = new ArrayList<Double>(numbers);
	}

	public List<Double> getNumbers() {
		return numbers;
	}

	public void setNumbers(List<Double> numbers) {
		this.numbers = numbers;
	}
	
	public void printElement() {
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "test [numbers=" + numbers + "]";
	}
	
	
}
