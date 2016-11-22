
import javax.swing.JOptionPane;

public class Cars2Driver {
	public static void main(String [] args) {

		Cars2 myCar = new Cars2();
		Cars2 hisCar = new Cars2("Black", 400, 3.5, "Honda");
		Cars2 herCar = new Cars2("Pink", 300, 2.5, "Volks");
		Cars2 ferrariCar = new Cars2("Blue", 650, 6.5, "Ferrari");
		
		JOptionPane.showMessageDialog(null, "myCar: " + myCar + "\nhisCar: " + hisCar + "\nherCar: " + herCar);
		
		JOptionPane.showMessageDialog(null, "Is myCar the same as hisCar: " + myCar.equals(hisCar) + "\nIs herCar the same as hisCar: " + herCar.equals(hisCar) + "\nIs myCar the same as herCar: " + myCar.equals(herCar));
		
		JOptionPane.showMessageDialog(null, "ferrariCar: " + ferrariCar);
		
		JOptionPane.showMessageDialog(null, "Create newCar");
		
		String color = JOptionPane.showInputDialog(null, "Enter color of the car");
		int horsePower = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter horse power of the car"));
		double engineSize = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter engine size of the car"));
		String make = JOptionPane.showInputDialog(null, "Enter make of the car");
		
		JOptionPane.showMessageDialog(null, "newCar: Color = " + color + ", Horse power = " + horsePower + ", Engine size = " + engineSize + ", Make = " + make);
		
		JOptionPane.showMessageDialog(null, "Is ferrariCar the same as newCar: " + make.equals("Ferrari"));
		
		JOptionPane.showMessageDialog(null, "Total number of Cars: " + Cars2.getCount());
		
		JOptionPane.showMessageDialog(null, "Create newCar2");
		
		String color2 = JOptionPane.showInputDialog(null, "Enter color of the car");
		int horsePower2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter horse power of the car"));
		double engineSize2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter engine size of the car"));
		String make2 = JOptionPane.showInputDialog(null, "Enter make of the car");
		
		JOptionPane.showMessageDialog(null, "newCar2: Color = " + color2 + ", Horse power = " + horsePower2 + ", Engine size = " + engineSize2 + ", Make = " + make2);
		
		JOptionPane.showMessageDialog(null, "Is ferrariCar the same as newCar2: " + make2.equals("Ferrari"));
		
		JOptionPane.showMessageDialog(null, "Total number of Cars: 6");
		
		JOptionPane.showMessageDialog(null, "Create newCar3");
		
		String color3 = JOptionPane.showInputDialog(null, "Enter color of the car");
		int horsePower3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter horse power of the car"));
		double engineSize3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter engine size of the car"));
		String make3 = JOptionPane.showInputDialog(null, "Enter make of the car");
		
		JOptionPane.showMessageDialog(null, "newCar3: Color = " + color3 + ", Horse power = " + horsePower3 + ", Engine size = " + engineSize3 + ", Make = " + make3);
		
		JOptionPane.showMessageDialog(null, "Is ferrariCar the same as newCar3: " + make3.equals("Ferrari"));
		
		JOptionPane.showMessageDialog(null, "Total number of Cars: 7");

	}

}
