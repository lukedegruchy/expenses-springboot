package com.luke.expenses.service;

import com.luke.expenses.entity.Expense;
import com.luke.expenses.repository.ExpenseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;

@Service
@AllArgsConstructor
public class ExpenseService {
    private final ExpenseRepository expenseRepository;

    public List<Expense> getAllExpenses() {
        return StreamSupport.stream(expenseRepository.findAll()
                                                     .spliterator(), false)
                            .toList();
//        return new ArrayList<>(expenseRepository.findAll());
    }

    public Optional<Expense> getExpenseById(long expenseId) {
        return expenseRepository.findById(expenseId);
    }

    public void saveOrUpdate(Expense expense) {
        expenseRepository.save(expense);

    }

    public void deleteExpenseById(long expenseId) {
        expenseRepository.deleteById(expenseId);
    }
}
