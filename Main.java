import models.Member;
import models.ChangeRequest;
import controller.RoleRequest;
import View.MView;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Member> members = new ArrayList<>();
        ArrayList<ChangeRequest> requests = new ArrayList<>();
        RoleRequest control=new RoleRequest(members, requests);
        MView view= new MView(control);
        view.start();
    }
}
