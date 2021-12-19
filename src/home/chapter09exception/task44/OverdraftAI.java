package home.chapter09exception.task44;

public class OverdraftAI {

    private String fio;

    private boolean personValided;
    private boolean positiveBalance;
    private boolean goodHistory;

    public OverdraftAI(String fio) {
        this.fio = fio;
    }

    public boolean isPersonValided() {
        return personValided;
    }

    public void setPersonValided(boolean personValided) {
        this.personValided = personValided;
    }

    public boolean isPositiveBalance() {
        return positiveBalance;
    }

    public void setPositiveBalance(boolean positiveBalance) {
        this.positiveBalance = positiveBalance;
    }

    public boolean isGoodHistory() {
        return goodHistory;
    }

    public void setGoodHistory(boolean goodHistory) {
        this.goodHistory = goodHistory;
    }

    public void acceptOverdraft() throws OverdraftAIException {

        if (personValided && positiveBalance && goodHistory) {
            // operations
            System.out.println("Overdraft for " + fio + " is accepted");
        }
        else {
            throw new OverdraftAIException("An overdraft for " +
                    fio +
                    " isn't accepted\n" +
                    (personValided ? "" : "Person isn't valided\n") +
                    (positiveBalance ? "" : "Balance is negative\n") +
                    (goodHistory ? "" : "Bad histiory\n") );


        }
    }
}
