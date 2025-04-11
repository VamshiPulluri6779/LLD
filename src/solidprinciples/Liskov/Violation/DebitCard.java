package solidprinciples.Liskov.Violation;

import common.Exception.CustomException;

import static common.Exception.ErrorEnum.VIOLATES_LISKOV_PRINCIPLE;

public class DebitCard implements Payment {


    @Override
    public void getCredit() {
        throw new CustomException(VIOLATES_LISKOV_PRINCIPLE, "Debit card doesn't have credit");
    }

    @Override
    public void checkBalance() {
        System.out.println("Debit card balance.");
    }
}
