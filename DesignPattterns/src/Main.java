public class Main {
    public static void main(String[] args) {
        AccessProfile basicAccess = new BasicAccess();
        AccessProfile adminAccess = new AdminAccess(basicAccess);
        AccessProfile managerAccess = new ManagerAccess(basicAccess);
        AccessProfile operatorAccess = new OperatorAccess(basicAccess);

        System.out.println("Admin Profile:");
        adminAccess.access();

        System.out.println("\nManager Profile:");
        managerAccess.access();

        System.out.println("\nOperator Profile:");
        operatorAccess.access();
    }
}