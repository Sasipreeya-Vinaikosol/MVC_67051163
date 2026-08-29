package models;

import java.util.ArrayList;

import org.w3c.dom.DOMStringList;

public class ChangeRequest {
    private String id;
    private String requester_id;
    private String target_id;
    private String new_role;
    private String status; // PENDING, APPROVED, REJECTED, CANCELLED
    private int approval_votes;
    private int rejection_votes;
    private ArrayList<String> voted_members;

    public ChangeRequest(String id,String requester_id, String target_id,String new_role){
        this.id=id;
        this.requester_id=requester_id;
        this.target_id=target_id;
        this.new_role=new_role;
        this.status="PENDING";
        this.approval_votes=0;
        this.rejection_votes=0;
        this.voted_members=new ArrayList<>();
    }

    public void addApproveVote(String memberId){
        this.approval_votes++;
        this.voted_members.add(memberId);
    }

    public void addRejectVote(String memberId){
        this.rejection_votes++;
        this.voted_members.add(memberId);
    }

    public String getId(){return id;}
    public String getRequesterId(){return requester_id;}
    public String getTargetId(){return target_id;}
    public String getNewRole(){return new_role;}
    public String getStatus(){return status;}
    public void setStatus(String status){this.status=status;}
    public int getApprovalVotes(){return approval_votes;}
    public int getRejectionVotes(){return rejection_votes;}
    public ArrayList<String> getVoteMem(){return voted_members;}
}
