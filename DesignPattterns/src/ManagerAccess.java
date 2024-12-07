public class ManagerAccess extends AccessDecorator {
    public ManagerAccess(AccessProfile decoratedProfile) {
        super(decoratedProfile);
    }

    @Override
    public void access() {
        decoratedProfile.access();
        System.out.println("Manager access granted.");
    }
}