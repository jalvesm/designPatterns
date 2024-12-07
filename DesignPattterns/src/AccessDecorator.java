
public abstract class AccessDecorator implements AccessProfile {
    protected AccessProfile decoratedProfile;

    public AccessDecorator(AccessProfile decoratedProfile) {
        this.decoratedProfile = decoratedProfile;
    }

    @Override
    public void access() {
        decoratedProfile.access();
    }
}