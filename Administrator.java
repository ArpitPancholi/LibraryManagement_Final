import java.util.Calendar;

public class Administrator {

    private String username;
    private String password;
    private boolean canAddMember;
    private boolean canDeleteMember;
    private boolean canViewStatistics;

    public Administrator(String username, String password) {
        this.username = username;
        this.password = password;
        this.canAddMember = true;
        this.canDeleteMember = true;
        this.canViewStatistics = true;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean correctPassword(String enteredPassword) {
        return password.equals(enteredPassword);
    }

    public void addMember(String memberType, String username, String password, boolean canAddMember, boolean canDeleteMember, boolean canViewStatistics) {
        // Logic to add a member with specified privileges
    }
}