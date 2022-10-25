package task01;

public class Commodity {

	@CommodityAnnotation("Commodity - name annotation")
	private String name;
	@CommodityAnnotation("Commodity - width annotation")
	private double width;
	@CommodityAnnotation("Commodity - length annotation")
	private double length;
	private double height;

	public Commodity(String name, double width, double length, double height) {
		super();
		this.name = name;
		this.width = width;
		this.length = length;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Commodity [name=" + name + ", width=" + width + ", length=" + length + ", height=" + height + "]";
	}
}