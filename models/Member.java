package models;

public class Member{
    private String id;
    private String name;
    private String role;
    private boolean isActive;

    public Member(String id, String name, String role, boolean isActive) {
        this.id=id;
        this.name=name;
        this.role=role;
        this.isActive=isActive;
    }
    public String getId(){return id;}
    public String getName(){return name;}
    public String getRole(){return role;}
    public boolean isActive(){return isActive;}
    public void setRole(String role){this.role=role;}

}