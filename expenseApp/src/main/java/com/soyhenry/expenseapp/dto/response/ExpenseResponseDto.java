package com.soyhenry.expenseapp.dto.response;

import com.soyhenry.expenseapp.dto.request.ExpenseCategoryRequestDto;

public class ExpenseResponseDto {
    private Double amount;
    private ExpenseCategoryResponseDto categoryDto;
    private String date;
    private String detail;

    public ExpenseResponseDto() {
    }

    public ExpenseResponseDto(Double amount, ExpenseCategoryResponseDto categoryDto, String date, String detail) {
        this.amount = amount;
        this.categoryDto = categoryDto;
        this.date = date;
        this.detail= detail;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public ExpenseCategoryResponseDto getCategoryDto() {
        return categoryDto;
    }

    public void setCategoryDto(ExpenseCategoryResponseDto categoryDto) {
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
        return "ExpenseResponseDto{" +
                "amount=" + amount +
                ", categoryDto=" + categoryDto.toString() +
                ", date='" + date + '\'' +
                ", detail='" + detail + '\'' +

                '}';
    }


}
