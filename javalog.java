import javax.swing.JOptionPane;

public class javalog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String username = "Westy";
		String password = "password";
		String login = JOptionPane.showInputDialog("Enter Username");
		if(username.equalsIgnoreCase(login)) { // true
			String pw = JOptionPane.showInputDialog("Enter Password");
			if(pw.equals(password)) {
				System.out.println("Welcome " + username);
		} else {	
			System.out.println("Fail Authentication.");
	}
	} else { // false 
			System.out.println("Fail Authentication.");
		}
	}
}

