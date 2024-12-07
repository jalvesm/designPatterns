public class OperatorAccess extends AccessDecorator {
    public OperatorAccess(AccessProfile decoratedProfile) {
        super(decoratedProfile);
    }

    @Override
    public void access() {
        decoratedProfile.access();
        System.out.println("Operator access granted.");
    }
}
