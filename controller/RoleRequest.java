package controller;
import models.Member;
import models.ChangeRequest;
import java.util.ArrayList;;

public class RoleRequest {
    private ArrayList<Member> mem;
    private ArrayList<ChangeRequest> requests;

    public RoleRequest(ArrayList<Member> mem, ArrayList<ChangeRequest> requests){
        this.mem=mem;
        this.requests=requests;
    }

    public void createReq(String requesterId,String targetId,String newRole){
        System.out.println("Request successfully created.");
    }
    public void submitVote(String voterId,String requestId,String opinion){
        ChangeRequest req=null;
        for(ChangeRequest r : requests){
            if (r.getId().equals(requestId)){
                req=r;
                break;}
        }
        if (req == null){
            System.out.println("No request found.");
        }
        if (opinion.equals("APPROVE")) {
            req.addApproveVote(voterId);
        }
        else {
            req.addRejectVote(voterId);
        }
        System.out.println("Record Complete");
    }
    public void cancelRequest(String requesterId,String requestId){
        
    }
}
