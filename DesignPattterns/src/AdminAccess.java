public class AdminAccess extends AccessDecorator {
    public AdminAccess(AccessProfile decoratedProfile) {
        super(decoratedProfile);
    }

    @Override
    public void access() {
        decoratedProfile.access();
        System.out.println("Admin access granted.");
    }
}