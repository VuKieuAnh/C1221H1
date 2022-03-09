package command;

public class AppDT {
    private ICommand closeAccount;
    private ICommand openAccount;

    public AppDT(ICommand closeAccount, ICommand openAccount) {
        this.closeAccount = closeAccount;
        this.openAccount = openAccount;
    }

    public void clickOpen(){
        System.out.println("Ban dang mo tai khoan");
        openAccount.execute();
    }

    public void clickClose(){
        System.out.println("Dang dong tai khoan");
        closeAccount.execute();
    }

    public static void main(String[] args) {
        Account account =  new Account();
        ICommand open = new OpenAccount(account);
        ICommand close = new CloseAccount(account);
        AppDT appDT = new AppDT(close, open);

        appDT.clickOpen();
        appDT.clickClose();
    }
}
