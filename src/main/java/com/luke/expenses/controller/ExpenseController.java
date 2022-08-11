package com.luke.expenses.controller;

import com.luke.expenses.entity.Expense;
import com.luke.expenses.entity.SomeDependency;
import com.luke.expenses.service.ExpenseService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/expenses")
@AllArgsConstructor
@Slf4j
public class ExpenseController {
    private final ExpenseService expenseService;
    private final SomeDependency someDependency;

    @GetMapping("/expenses")
    public List<Expense> getAllExpenses() {
        log.info("all expenses: {}", expenseService.getAllExpenses());
        log.info("dependency: {}", someDependency.stuff());
        return expenseService.getAllExpenses();
    }

    @GetMapping("/expense/{id}")
    public Optional<Expense> getExpense(@PathVariable("id") int id) {
        return expenseService.getExpenseById(id);
    }

    @DeleteMapping("/expense/{id}")
    public void deleteExpense(@PathVariable("id") int id) {
        expenseService.deleteExpenseById(id);
    }

    @PostMapping("/expense")
    public void addExpense(@RequestBody Expense expense) {
        expenseService.saveOrUpdate(expense);
    }

    @PutMapping("/expense")
    public void updateExpense(@RequestBody Expense expense) {
        expenseService.saveOrUpdate(expense);
    }

    //TODO:  Use this
//    private ExpenseDto entityToDto(Expense expense) {
//        return ExpenseDto.builder()
//                         .id(expense.getId())
//                         .amount(expense.getAmount())
//                         .build();
//    }
}
