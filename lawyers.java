import java.lang.*;
import java.io.*;
import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

public class lawyers{
	private lawyer[] lawyerList = new lawyer[100];
	private int lawyerCount = 0;
	
	public lawyers(){
		try{
			File file = new File("Files/lawyersList.txt");
            Path filePath = Paths.get("Files/lawyersList.txt");
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
					
					
					
					
					lawyer l = new lawyer(fName,lName,username,email,password);
					lawyerList[lawyerCount]=l;
					System.out.println(lawyerCount+"---------------------------------");
				}
			sc.close();   		
		}catch(Exception ex){
			
			System.out.println("File not found.");
			ex.printStackTrace();
			return;
		}
	}
	
	public int lawyerExists(String username){
        int index = -1;
        for(int i=0;i<lawyerCount;i++){
            if(lawyerList[i].getUsername().equals(username)){
                index = i;
                break;
            }
        }
        return index;
    }

	public void addLawyer(lawyer l){
        lawyerList[lawyerCount]=l;
        lawyerCount++;

        String lawyerDetails="First Name: "+ l.getFName() + "\n";
        lawyerDetails+="Last Name: "+l.getLName() + "\n";
        lawyerDetails+="Username: "+ l.getUsername() + "\n";
        lawyerDetails+="Email: "+ l.getEmail() + "\n";
        lawyerDetails+="Password: "+ l.getPassword() + "\n";
        lawyerDetails+="\n";

        try{
            FileWriter fw = new FileWriter("Files/lawyersList.txt", true);
            fw.write(lawyerDetails);
            fw.close();

        } catch(Exception ex){
            System.out.println(ex);}
    }
	
	public lawyer checkCredentials(int index, String password){
        if(lawyerList[index].getPassword().equals(password)){
            return lawyerList[index];
        }else{
            return null;
        }
    }

    public lawyer getLawyer(int index){
        return lawyerList[index];
    }
	
	public void updateLawyer(lawyer oldLawyer, lawyer updatedLawyer){
            
            String oldLawyerDetails="First Name: "+ oldLawyer.getFName() + "\n";
            oldLawyerDetails+="Last Name: "+oldLawyer.getLName() + "\n";
            oldLawyerDetails+="Username: "+ oldLawyer.getUsername() + "\n";
            oldLawyerDetails+="Email: "+ oldLawyer.getEmail() + "\n";
            oldLawyerDetails+="Password: "+ oldLawyer.getPassword() + "\n";
            oldLawyerDetails+="\n";
            
            
        
            //deleting from file
            String updatedDetails="First Name: "+ updatedLawyer.getFName() + "\n";
            updatedDetails+="Last Name: "+updatedLawyer.getLName() + "\n";
            updatedDetails+="Username: "+ updatedLawyer.getUsername() + "\n";
            updatedDetails+="Email: "+ updatedLawyer.getEmail() + "\n";
            updatedDetails+="Password: "+ updatedLawyer.getPassword() + "\n";
            
            
            try{
                String filepath = "Files/lawyersList.txt";
                File originalFile = new File(filepath);
                    
                String newDetails = "";				
                Scanner sc = new Scanner(originalFile);
                while(sc.hasNext()){
                    String readLawyer = sc.nextLine() + "\n";
                    readLawyer += sc.nextLine() + "\n";
                    readLawyer += sc.nextLine() + "\n";
                    readLawyer += sc.nextLine() + "\n";
                    readLawyer += sc.nextLine() + "\n";
                    readLawyer += sc.nextLine();
                    
                    System.out.println(readLawyer);
                    System.out.println(oldLawyerDetails);

                    if(readLawyer.equals(oldLawyerDetails)){
                        System.out.println("Updated");
                        newDetails += updatedDetails + "\n";
                    }else{
                        System.out.println("Writing");
                        newDetails += readLawyer + "\n";
                    }
                } sc.close();
			FileWriter fw = new FileWriter(filepath);
			fw.write(newDetails);
			fw.close();
		}catch(Exception ex){
			System.out.println(ex);
		}
	}
	
	public void deleteLawyer(lawyer l){
        int index = lawyerExists(l.getUsername());
        for(int i=index;i<lawyerCount-1;i++){
            lawyerList[i]=lawyerList[i+1];
        }
        --lawyerCount;
        lawyerList[lawyerCount]=null;

        String lawyerDetails="First Name: "+ l.getFName() + "\n";
        lawyerDetails+="Last Name: "+l.getLName() + "\n";
        lawyerDetails+="Username: "+ l.getUsername() + "\n";
        lawyerDetails+="Email: "+ l.getEmail() + "\n";
        lawyerDetails+="Password: "+ l.getPassword() + "\n";
        lawyerDetails+="\n";
        
        try{
            String filepath = "Files/lawyersList.txt";
            File originalFile = new File(filepath);
                
            String newDetails = "";				
            Scanner sc = new Scanner(originalFile);
            while(sc.hasNext()){
                String readLawyer = sc.nextLine() + "\n";
                readLawyer += sc.nextLine() + "\n";
                readLawyer += sc.nextLine() + "\n";
                readLawyer += sc.nextLine() + "\n";
                readLawyer += sc.nextLine() + "\n";
                readLawyer += sc.nextLine();

                System.out.println(readLawyer);
                System.out.println(lawyerDetails);

                if(readLawyer.equals(lawyerDetails)){
                    System.out.println("Deleted");
                    continue;
                }
                System.out.println("Writing");
                newDetails += readLawyer + "\n";
            } sc.close();

            FileWriter fw = new FileWriter(filepath);
            fw.write(newDetails);
            fw.close();
        }catch(Exception ex){
            System.out.println(ex);
        }




}

}
