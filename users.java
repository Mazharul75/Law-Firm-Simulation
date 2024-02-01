import java.lang.*;
import java.io.*;
import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

public class users{
	client userList[] = new client[100];
	static int userCount = 0;
	
	public users(){
		try{
			Path filePath = Paths.get("Files", "userList.txt"); //location must be the path where the file is saved
            File file = filePath.toFile();
            
            if (!file.exists()) {
                Files.createDirectories(filePath.getParent());
                Files.createFile(filePath);
                FileWriter fw = new FileWriter(file, true);
                fw.write("Default content\n");
                fw.close();
            } 
			Scanner sc = new Scanner(file);
				while(sc.hasNext()){
					String line1 = sc.nextLine();
					String line2 = sc.nextLine();
					String line3 = sc.nextLine();
					String line4 = sc.nextLine();
					String line5 = sc.nextLine();
					String line6 = sc.nextLine();
					
					String fName = line1.substring(12);
					String lName = line2.substring(11);
					String username = line3.substring(10);
					String email = line4.substring(7);
					String password = line5.substring(10);
					
					
					System.out.println(fName);
					System.out.println(lName);
					System.out.println(username);
					System.out.println(email);
					System.out.println(password);
					
					
					
					
					client c = new client(username,password,email,fName,lName);
					userList[userCount] = c; userCount++;
					System.out.println(userCount+"---------------------------------");
				}
			sc.close();   		
		}catch(Exception ex){
			
			System.out.println("File not found.");
			ex.printStackTrace();
			return;
		}
	}
	
	public int userExists(String username){
		int index = -1;
		for(int i=0;i<userCount;i++){
			if(userList[i].getUsername().equals(username)){
				index = i;
				break;
			}
		}
		return index;
	}
	
	public void addUser(client c){
		userList[userCount]=c;
		userCount++;
		//also adding them in file
		String userDetails = "First Name: " + c.getFName() + "\n";
		userDetails += "Last Name: " + c.getLName() + "\n";
		userDetails += "Username: " + c.getUsername() + "\n";
		userDetails += "Email: " + c.getEmail() + "\n";
		userDetails += "Password: " + c.getPassword() + "\n";
		userDetails += "\n";

		
		try{
			FileWriter fw = new FileWriter("Files/userList.txt",true);
			fw.write(userDetails);
			fw.close();
		}catch(Exception ex){
			System.out.println(ex);
		}
	}
	
	public client checkCredentials(int index, String pass){
		if((userList[index].getPassword().equals(pass))){
			return userList[index];
		}else{return null;}
	}
	
	public client getUser(int index){
		return userList[index];
	}
	
	public void updateUser(client oldUser, client updatedUser){
		
		String oldUserDetails="First Name: "+ oldUser.getFName() + "\n";
		oldUserDetails+="Last Name: "+oldUser.getLName() + "\n";
		oldUserDetails+="Username: "+ oldUser.getUsername() + "\n";
		oldUserDetails+="Email: "+ oldUser.getEmail() + "\n";
		oldUserDetails+="Password: "+ oldUser.getPassword() + "\n";
		oldUserDetails+="\n";
		
		
	
		//deleting from file
		String updatedDetails="First Name: "+ updatedUser.getFName() + "\n";
		updatedDetails+="Last Name: "+updatedUser.getLName() + "\n";
		updatedDetails+="Username: "+ updatedUser.getUsername() + "\n";
		updatedDetails+="Email: "+ updatedUser.getEmail() + "\n";
		updatedDetails+="Password: "+ updatedUser.getPassword() + "\n";
		
		
		
		try{
			String filepath = "Files/userList.txt";
			File originalFile = new File(filepath);
				
			String newDetails = "";				
			Scanner sc = new Scanner(originalFile);
			while(sc.hasNext()){
				String readUser = sc.nextLine() + "\n";
				readUser += sc.nextLine() + "\n";
				readUser += sc.nextLine() + "\n";
				readUser += sc.nextLine() + "\n";
				readUser += sc.nextLine() + "\n";
				readUser += sc.nextLine();
				
				System.out.println(readUser);
				System.out.println(oldUserDetails);
				
				if(readUser.equals(oldUserDetails)){
					System.out.println("Updated");
					newDetails += updatedDetails + "\n";
				}else{
					System.out.println("Writing");
					newDetails += readUser + "\n";
				}
			} sc.close(); 
			FileWriter fw = new FileWriter(filepath);
			fw.write(newDetails);
			fw.close();
		}catch(Exception ex){
			System.out.println(ex);
		}
	}
	
	public void deleteUser(client c){
		int index = userExists(c.getUsername());
		for(int i=index;i<userCount-1;i++){
			userList[i]=userList[i+1];
		}
		--userCount;
		userList[userCount]=null;
		
		//deleting from file
		String userDetails = "First Name: " + c.getFName() + "\n";
		userDetails += "Last Name: " + c.getLName() + "\n";
		userDetails += "Username: " + c.getUsername() + "\n";
		userDetails += "Email: " + c.getEmail() + "\n";
		userDetails += "Password: " + c.getPassword() + "\n";
		userDetails += "\n";

		
		try{
			String filepath = "Files/userList.txt";
			File originalFile = new File(filepath);
				
			String newDetails = "";				
			Scanner sc = new Scanner(originalFile);
			while(sc.hasNext()){
				String readUser = sc.nextLine() + "\n";
				readUser += sc.nextLine() + "\n";
				readUser += sc.nextLine() + "\n";
				readUser += sc.nextLine() + "\n";
				readUser += sc.nextLine() + "\n";
				readUser += sc.nextLine();
				
				System.out.println(readUser);
				System.out.println(userDetails);
				
				if(readUser.equals(userDetails)){
					System.out.println("Equal");
					//newDetails += updatedDetails + "\n";
					continue;
				}
				System.out.println("Writing");
				newDetails += readUser + "\n";
			} sc.close(); 
			FileWriter fw = new FileWriter(filepath);
			fw.write(newDetails);
			fw.close();
		}catch(Exception ex){
			System.out.println(ex);
		}
	}
}