public class Item {

	private double value;
	public String name;

	public Item(String name, double value) {
		if (isValidName(name)) {
			this.name = name;
		}
		if (isValueValid(value)) {
			this.value = value;
		}
	}

	public void setValue(double value) {
		this.value = value;
	}

	public double getValue() {
		return value;
	}

	@Override
	public String toString() {
		return name + " " + value;
	}

	private boolean isValidName(String name) {
		return name != null && !name.isEmpty();
	}

	private boolean isValueValid(double value) {
		return value > 0;
	}
}
