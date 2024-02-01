

public class addACase{
    private String caseID ;
    private String client ;
    private String opponent ;
    private String dateOpened ;
    private String casetype ;
    private String assignedLawyer ;
    private String caseStatus ;
    private String witnessName ;
    private String evidence ;
    private String caseOutcome ;
    private String caseDescription;
    private String consulation;
    private String evidenceSubmission;
    private String Witness;
    private String Negotiations;
    private String caseClosure;

    public addACase(String caseID, String client, String opponent, String dateOpened, String casetype, String assignedLawyer, String caseStatus, String witnessName, String evidence, String caseOutcome, String caseDescription, String consulation, String evidenceSubmission, String Witness, String Negotiations, String caseClosure ){

        this.caseID= caseID;
        this.client= client;
        this.opponent= opponent;
        this.dateOpened=dateOpened;
        this.casetype=casetype;
        this.assignedLawyer=assignedLawyer;
        this.caseStatus=caseStatus;
        this.witnessName=witnessName;
        this.evidence=evidence;
        this.caseOutcome=caseOutcome;
        this.caseDescription=caseDescription;
        this.consulation=consulation;
        this.evidenceSubmission=evidenceSubmission;
        this.Witness=Witness;
        this.Negotiations=Negotiations;
        this.caseClosure=caseClosure;

    }

    public void setCaseID(String caseID){
        this.caseID=caseID;
    }
    public void setClient(String client){
        this.client=client;
    }
    public void setOpponent(String opponent){
        this.opponent=opponent;
    }
     public void setDateOpened(String dateOpened){
          this.dateOpened=dateOpened;
     }
     public void setCasetype(String casetype){
        this.casetype=casetype;
   }
   public void setAssignedLawyer(String assignedLawyer){
        this.assignedLawyer=assignedLawyer;
   }
   public void setCaseStatus(String caseStatus){
        this.caseStatus=caseStatus;
   }

   public void setWitnessName(String witnessName){
        this.witnessName=witnessName;
   }
   public void setEvidence(String evidence){
        this.evidence=evidence;
   }
   public void setCaseOutcome(String caseOutcome){
        this.caseOutcome=caseOutcome;
   }

   public void setCaseDescription(String caseDescription){
        this.caseDescription=caseDescription;
   }

     public void setConsulation(String consulation){
            this.consulation=consulation;
     }

     public void setEvidenceSubmission(String evidenceSubmission){
            this.evidenceSubmission=evidenceSubmission;
     }

     public void setWitness(String Witness){
            this.Witness=Witness;
     }

     public void setNegotiations(String Negotiations){
            this.Negotiations=Negotiations;
     }

     public void setCaseClosure(String caseClosure){
            this.caseClosure=caseClosure;
     }



   public String getCaseID(){
        return caseID;
   }
   public String getClient(){
        return client;
   }
   public String getOpponent(){
        return opponent;
   }
   public String getDateOpened(){
        return dateOpened;
   }
   public  String getCasetype(){
        return casetype;
   }
   public String getAssignedLawyer(){
        return assignedLawyer;
   }
   public String getCaseStatus(){
        return caseStatus;
   }
   public String getWitnessName(){
        return witnessName;
   }
   public String getEvidence(){
        return evidence;
   }
   public String getCaseOutcome(){
        return caseOutcome;
   }

     public String getCaseDescription(){
            return caseDescription;
     }

     public String getConsulation(){
            return consulation;
     }

     public String getEvidenceSubmission(){
            return evidenceSubmission;
     }

     public String getWitness(){
            return Witness;
     }

     public String getNegotiations(){
            return Negotiations;
     }

     public String getCaseClosure(){
            return caseClosure;
     }



     
}