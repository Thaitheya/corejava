
public class dog {
  String name;
  String breed;
  int age;
  String color;
  
  
  public dog(String name, String breed, int age, String color) {
	  
	  
	  this.name = name;
	  this.breed = breed;
	  this.age = age;
	  this.color = color;
	  
  }
  public String getName() {
	return name;
  }
  public String getBreed() {
	  return breed;
  }
  public String getcolor() {
	  return color;
  }
  public int getage() {
	  return age;
  }
  
  public String toString() {
	  return ("The dog name is " + this.getName() + "The breed name and its color is " + getBreed() + this.color + "The age of the dog is " + this.age);
  }
 
}
