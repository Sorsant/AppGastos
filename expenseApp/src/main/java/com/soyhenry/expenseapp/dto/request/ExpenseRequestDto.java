package com.soyhenry.expenseapp.dto.request;

public class ExpenseRequestDto {
    private Double amount;
    private ExpenseCategoryRequestDto categoryDto;
    private String date;
    private  String detail;

    public ExpenseRequestDto() {
    }

    public ExpenseRequestDto(Double amount, ExpenseCategoryRequestDto categoryDto, String date ,String detail) {
        this.amount = amount;
        this.categoryDto = categoryDto;
        this.date = date;
        this.detail=detail;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public ExpenseCategoryRequestDto getCategoryDto() {
        return categoryDto;
    }

    public void setCategoryName(ExpenseCategoryRequestDto categoryDto) {
        this.categoryDto = categoryDto;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }



    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "ExpenseRequestDto{" +
                "amount=" + amount +
                ", categoryDto=" + categoryDto.toString() +
                ", date='" + date + '\'' +
                ", detail='" + detail + '\'' +

                '}';
    }
}
