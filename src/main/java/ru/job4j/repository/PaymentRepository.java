package ru.job4j.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.job4j.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}
