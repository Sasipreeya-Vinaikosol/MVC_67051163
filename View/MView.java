package View;
import controller.RoleRequest;
import java.util.Scanner;

public class MView {
    private RoleRequest controller;
    private Scanner scanner;
    private String activeUserId = "M01"; // จำลองผู้ใช้

    public MView(RoleRequest controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("\n Request management system (ID " + activeUserId + ") ");
            System.out.println("1. Create a request");
            System.out.println("2. Opinion");
            System.out.println("3. Exit");
            System.out.print("Menu Choose : ");
            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                System.out.print("ID Target: ");
                String target = scanner.nextLine();
                System.out.print("New Role: ");
                String role = scanner.nextLine();
                controller.createReq(activeUserId, target, role);
            } else if (choice.equals("2")) {
                System.out.print("Request Code: ");
                String reqId = scanner.nextLine();
                System.out.print("Opinion (APPROVE/REJECT): ");
                String opinion = scanner.nextLine();
                controller.submitVote(activeUserId, reqId, opinion);
            } else if (choice.equals("3")) {
                break;
            }
        }
    }
}
