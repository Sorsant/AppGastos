package com.soyhenry.expenseapp.domain;

public class SpecialExpense extends Expense {
    private String reason;

    public SpecialExpense() {
    }

    public SpecialExpense(Double amount, Long categoryId, String categoryName, String date, String detail, String reason) {
        super(amount, categoryId, categoryName, date, detail);
        this.reason = reason;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
