package com.luke.expenses.config;

import com.luke.expenses.entity.SomeDependency;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(SomeDependency.class)
public class ExpensesConfig {
}
