package command;

public class ATM {
    private ICommand closeAccount;

    public ATM(ICommand closeAccount) {
        this.closeAccount = closeAccount;
    }

    public void clickCloseAccount(){
        closeAccount.execute();
    }

    public static void main(String[] args) {
        Account account = new Account();
        ICommand command = new CloseAccount(account);
        ATM atm =  new ATM(command);
        atm.clickCloseAccount();
    }
}
