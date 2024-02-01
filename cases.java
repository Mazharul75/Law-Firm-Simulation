



import java.lang.*;
import java.io.*;
import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

public class cases{
	addACase caseList[] = new addACase[100];
	static int caseCount = 0;
	
	public cases(){
		try{
			Path filePath = Paths.get("Files", "caseList.txt"); //location must be the path where the file is saved
            File file = filePath.toFile();
            
            if (!file.exists()) {
                Files.createDirectories(filePath.getParent());
                Files.createFile(filePath);
                FileWriter fwm = new FileWriter(file, true);
                fwm.write("Default content\n");
                fwm.close();
            } 
			Scanner sc = new Scanner(file);
				while(sc.hasNext()){
					String line1 = sc.nextLine();
					String line2 = sc.nextLine();
					String line3 = sc.nextLine();
					String line4 = sc.nextLine();
					String line5 = sc.nextLine();
					String line6 = sc.nextLine();
					String line7 = sc.nextLine();
					String line8 = sc.nextLine();
					String line9 = sc.nextLine();
					String line10 = sc.nextLine();
					String line11 = sc.nextLine();
					String line12 = sc.nextLine();
					String line13 = sc.nextLine();
					String line14 = sc.nextLine();
					String line15 = sc.nextLine();
					String line16 = sc.nextLine();
					String line17 = sc.nextLine();
					

					
					String caseID = line1.substring(9);
					String client = line2.substring(8);
					String opponent = line3.substring(10);
					String dateOpened = line4.substring(13);
					String casetype = line5.substring(11);
					String assignedLawyer = line6.substring(17);
					String caseStatus = line7.substring(13);
					String witnessName = line8.substring(14);
					String evidence = line9.substring(10);
					String caseOutcome = line10.substring(14);
					String caseDescription = line11.substring(18);
					String consulation = line12.substring(13);
					String evidenceSubmission = line13.substring(21);
					String Witness = line14.substring(9);
					String Negotiations = line15.substring(14);
					String caseClosure = line16.substring(14);

					
					
					System.out.println(caseID);
					System.out.println(client);
					System.out.println(opponent);
					System.out.println(dateOpened);
					System.out.println(casetype);
					System.out.println(assignedLawyer);
					System.out.println(caseStatus);
					System.out.println(witnessName);
					System.out.println(evidence);
					System.out.println(caseOutcome);
					System.out.println(caseDescription);
					System.out.println(consulation);
					System.out.println(evidenceSubmission);
					System.out.println(Witness);
					System.out.println(Negotiations);
					System.out.println(caseClosure);
					
					
					
					
					
					addACase aac = new addACase(caseID, client, opponent, dateOpened, casetype, assignedLawyer, caseStatus, witnessName, evidence, caseOutcome, caseDescription, consulation, evidenceSubmission, Witness, Negotiations, caseClosure);
					caseList[caseCount] = aac; caseCount++;
					System.out.println(caseCount+"---------------------------------");
				}
			sc.close();   		
		}catch(Exception ex){
			
			System.out.println("File not found.");
			ex.printStackTrace();
			return;
		}
	}
	
	public int caseExists(String caseID){
		int index = -1;
		for(int i=0;i<caseCount;i++){
			if(caseList[i].getCaseID().equals(caseID)){
				index = i;
				break;
			}
		}
		return index;
	}
	
	public void AddCase(addACase aac){
		caseList[caseCount]= aac;
		caseCount++;
		//also adding them in file
		String caseDetails = "Case ID: " + aac.getCaseID() + "\n";
		caseDetails += "Client: " + aac.getClient() + "\n";
		caseDetails += "Opponent: " + aac.getOpponent() + "\n";
		caseDetails += "Date Opened: " + aac.getDateOpened() + "\n";
		caseDetails += "Case Type: " + aac.getCasetype() + "\n";
		caseDetails += "Assigned Lawyer: " + aac.getAssignedLawyer() + "\n";
		caseDetails += "Case Status: " + aac.getCaseStatus() + "\n";
		caseDetails += "Witness Name: " + aac.getWitnessName() + "\n";
		caseDetails += "Evidence: " + aac.getEvidence() + "\n";
		caseDetails += "Case Outcome: " + aac.getCaseOutcome() + "\n";
		caseDetails += "Case Description: " + aac.getCaseDescription() + "\n";
		caseDetails += "Consulation: " + aac.getConsulation() + "\n";
		caseDetails += "Evidence Submission: " + aac.getEvidenceSubmission() + "\n";
		caseDetails += "Witness: " + aac.getWitness() + "\n";
		caseDetails += "Negotiations: " + aac.getNegotiations() + "\n";
		caseDetails += "Case Closure: " + aac.getCaseClosure() + "\n";
		caseDetails += "\n";

		System.out.println("Current working directory: " + System.getProperty("user.dir"));
		System.out.println("Case details: " + caseDetails);
		
		try{
			FileWriter fwm = new FileWriter("Files/caseList.txt",true);
			fwm.write(caseDetails);
			fwm.close();
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	public addACase checkCredentials(int index, String caseID){
		if((caseList[index].getCaseID().equals(caseID))){
			return caseList[index];
		}else{return null;}
	}
	
	public addACase getCACase(int index){
		return caseList[index];
	}
	
	public void updateCase(addACase oldCase, addACase updatedCase){
		
		String oldCaseDetails = "Case ID: " + oldCase.getCaseID() + "\n";
		oldCaseDetails += "Client: " + oldCase.getClient() + "\n";
		oldCaseDetails += "Opponent: " + oldCase.getOpponent() + "\n";
		oldCaseDetails += "Date Opened: " + oldCase.getDateOpened() + "\n";
		oldCaseDetails += "Case Type: " + oldCase.getCasetype() + "\n";
		oldCaseDetails += "Assigned Lawyer: " + oldCase.getAssignedLawyer() + "\n";
		oldCaseDetails += "Case Status: " + oldCase.getCaseStatus() + "\n";
		oldCaseDetails += "Witness Name: " + oldCase.getWitnessName() + "\n";
		oldCaseDetails += "Evidence: " + oldCase.getEvidence() + "\n";
		oldCaseDetails += "Case Outcome: " + oldCase.getCaseOutcome() + "\n";
		oldCaseDetails += "Case Description: " + oldCase.getCaseDescription() + "\n";
		oldCaseDetails += "Consulation: " + oldCase.getConsulation() + "\n";
		oldCaseDetails += "Evidence Submission: " + oldCase.getEvidenceSubmission() + "\n";
		oldCaseDetails += "Witness: " + oldCase.getWitness() + "\n";
		oldCaseDetails += "Negotiations: " + oldCase.getNegotiations() + "\n";
		oldCaseDetails += "Case Closure: " + oldCase.getCaseClosure() + "\n";
		oldCaseDetails += "\n";
		
		
		
	
		//deleting from file
		String updatedDetails = "Case ID: " + updatedCase.getCaseID() + "\n";
		updatedDetails += "Client: " + updatedCase.getClient() + "\n";
		updatedDetails += "Opponent: " + updatedCase.getOpponent() + "\n";
		updatedDetails += "Date Opened: " + updatedCase.getDateOpened() + "\n";
		updatedDetails += "Case Type: " + updatedCase.getCasetype() + "\n";
		updatedDetails += "Assigned Lawyer: " + updatedCase.getAssignedLawyer() + "\n";
		updatedDetails += "Case Status: " + updatedCase.getCaseStatus() + "\n";
		updatedDetails += "Witness Name: " + updatedCase.getWitnessName() + "\n";
		updatedDetails += "Evidence: " + updatedCase.getEvidence() + "\n";
		updatedDetails += "Case Outcome: " + updatedCase.getCaseOutcome() + "\n";
		updatedDetails += "Case Description: " + updatedCase.getCaseDescription() + "\n";
		updatedDetails += "Consulation: " + updatedCase.getConsulation() + "\n";
		updatedDetails += "Evidence Submission: " + updatedCase.getEvidenceSubmission() + "\n";
		updatedDetails += "Witness: " + updatedCase.getWitness() + "\n";
		updatedDetails += "Negotiations: " + updatedCase.getNegotiations() + "\n";
		updatedDetails += "Case Closure: " + updatedCase.getCaseClosure() + "\n";

		
		
		
		try{
			String filepath = "Files/caseList.txt";
			File originalFile = new File(filepath);
				
			String newDetails = "";				
			Scanner sc = new Scanner(originalFile);
			while(sc.hasNext()){
				String readCase = sc.nextLine() + "\n";
				readCase += sc.nextLine() + "\n";
				readCase += sc.nextLine() + "\n";
				readCase += sc.nextLine() + "\n";
				readCase += sc.nextLine() + "\n";
				readCase += sc.nextLine() + "\n";
				readCase += sc.nextLine() + "\n";
				readCase += sc.nextLine() + "\n"; //witness name
				readCase += sc.nextLine() + "\n"; //evidence
				readCase += sc.nextLine() + "\n"; //case outcome
				readCase += sc.nextLine() + "\n"; //case description
				readCase += sc.nextLine() + "\n"; //consulation
				readCase += sc.nextLine() + "\n"; //evidence submission
				readCase += sc.nextLine() + "\n"; //witness
				readCase += sc.nextLine() + "\n"; //negotiations
				readCase += sc.nextLine() + "\n"; //case closure
				readCase += sc.nextLine();

				
				System.out.println(readCase);
				System.out.println(oldCaseDetails);
				
				if(readCase.equals(oldCaseDetails)){
					System.out.println("Updated");
					newDetails += updatedDetails + "\n";
				}else{
					System.out.println("Writing");
					newDetails += readCase + "\n";
				}
			} sc.close(); 
			FileWriter fwm = new FileWriter(filepath);
			fwm.write(newDetails);
			fwm.close();
		}catch(Exception ex){
			System.out.println(ex);
		}
	}
	
	public void deleteCase(addACase aac){
		int index = caseExists(aac.getCaseID());
		for(int i=index;i<caseCount-1;i++){
			caseList[i]=caseList[i+1];
		}
		caseCount--;
		caseList[caseCount]=null;
		
		//deleting from file
		String caseDetails = "Case ID: " + aac.getCaseID() + "\n";
		caseDetails += "Client: " + aac.getClient() + "\n";
		caseDetails += "Opponent: " + aac.getOpponent() + "\n";
		caseDetails += "Date Opened: " + aac.getDateOpened() + "\n";
		caseDetails += "Case Type: " + aac.getCasetype() + "\n";
		caseDetails += "Assigned Lawyer: " + aac.getAssignedLawyer() + "\n";
		caseDetails += "Case Status: " + aac.getCaseStatus() + "\n";
		caseDetails += "Witness Name: " + aac.getWitnessName() + "\n";
		caseDetails += "Evidence: " + aac.getEvidence() + "\n";
		caseDetails += "Case Outcome: " + aac.getCaseOutcome() + "\n";
		caseDetails += "Case Description: " + aac.getCaseDescription() + "\n";
		caseDetails += "Consulation: " + aac.getConsulation() + "\n";
		caseDetails += "Evidence Submission: " + aac.getEvidenceSubmission() + "\n";
		caseDetails += "Witness: " + aac.getWitness() + "\n";
		caseDetails += "Negotiations: " + aac.getNegotiations() + "\n";
		caseDetails += "Case Closure: " + aac.getCaseClosure() + "\n";
		caseDetails += "\n";


		
		try{
			String filepath = "Files/caseList.txt";
			File originalFile = new File(filepath);
				
			String newDetails = "";				
			Scanner sc = new Scanner(originalFile);
			while(sc.hasNext()){
				String readCase = sc.nextLine() + "\n";
				readCase += sc.nextLine() + "\n";
				readCase += sc.nextLine() + "\n";
				readCase += sc.nextLine() + "\n";
				readCase += sc.nextLine() + "\n";
				readCase += sc.nextLine() + "\n";
				readCase += sc.nextLine() + "\n";
				readCase += sc.nextLine() + "\n";
				readCase += sc.nextLine() + "\n";
				readCase += sc.nextLine() + "\n";
				readCase += sc.nextLine() + "\n"; //case description
				readCase += sc.nextLine() + "\n"; //consulation
				readCase += sc.nextLine() + "\n"; //evidence submission
				readCase += sc.nextLine() + "\n"; //witness
				readCase += sc.nextLine() + "\n"; //negotiations
				readCase += sc.nextLine() + "\n"; //case closure
				readCase += sc.nextLine();

				
				System.out.println(readCase);
				System.out.println(caseDetails);
				
				if(readCase.equals(caseDetails)){
					System.out.println("Equal");
					//newDetails += updatedDetails + "\n";
					continue;
				}
				System.out.println("Writing");
				newDetails += readCase + "\n";
			} sc.close(); 
			FileWriter fwm = new FileWriter(filepath);
			fwm.write(newDetails);
			fwm.close();
		}catch(Exception ex){
			System.out.println(ex);
		}
	}
}