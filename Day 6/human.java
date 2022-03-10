package Huawei.internship;

public class Human {
   private String Haircolor;
   private int Gender;
   private String Weight;
   private String Height;
   
	@Override
public String toString() {
	return "Human [Haircolor=" + Haircolor + ", Gender=" + Gender + ", Weight=" + Weight + ", Height=" + Height + "]";
}

	public String getHaircolor() {
	return Haircolor;
}

public void setHaircolor(String Haircolor) {
	this.Haircolor = Haircolor;
}

public int getGender() {
	return Gender;
}

public void setGender(String Gender) {
	this.Gender = Gender;
}

public String getWeight() {
	return Weight;
}

public void setWeight(int Weight) {
	this.Weight = Weight;
}

public String getHeight() {
	return Height;
}

public void setHeight(int Height) {
	this.Height = Height;
}

	public Human(String Haircolor, String Gender, int Weight, int Height) {
	super();
	this.Haircolor = Haircolor;
	this.Gender = Gender;
	this.Weight = Weight;
	this.Height = Height;
}

}


public class CreatingObject {

	public static void main(String[] args) {
		Human Vimal=new Human("Black","Male",65,150);
		Human Arun=new Human("Black","Male",50,180);
		Human Rooban=new Human("Black","Male",55,175);
	}

}
