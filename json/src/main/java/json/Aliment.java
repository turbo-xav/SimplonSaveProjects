package json;

public class Aliment extends Component {

	private Long kCal = 0L;
		
	public Aliment() {
		
	}	
	
	public Long getkCal() {
		return kCal;
	}

	public void setkCal(Long kCal) {
		this.kCal = kCal;
	}

	public Aliment(Long id, String name, Long kCal) {
		super(id, name);
		this.kCal = kCal;
	}
	
	public String toString() {
		return "Aliment id = "+this.getId()+" name = "+this.getName()+ " kCal = "+this.kCal; 
	}
}
