package com.luke.expenses.dto;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Jacksonized
@Builder
@Data
public class ExpenseDto {
    long id;
    double amount;
}
