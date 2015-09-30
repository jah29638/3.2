import javax.swing.JOptionPane;
	
public class SwitchCase {

	public static void main(String[] args) {
	String input = JOptionPane.showInputDialog("Are you an \"Administrator\", \"Faculty\", \"Staff\", \"Student\", or a \"Guest\".");
	
	switch (input) {
	case "Administrator":
		System.out.println("Hello " + input);
		break;
	case "Faculty":
		System.out.println("Hello " + input);
		break;
	case "Staff":
		System.out.println("Hello " + input);
		break;
	case "Student":
		System.out.println("Hello " + input);
		break;
	case "Guest":
		System.out.println("Hello " + input);
		break;
	default:
		System.out.println("Hello");
		
		}
		
		
	}
	
}

