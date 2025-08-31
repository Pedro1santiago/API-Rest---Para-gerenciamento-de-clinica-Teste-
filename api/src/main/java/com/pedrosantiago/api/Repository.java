package com.pedrosantiago.api;

import com.pedrosantiago.api.medico.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Medico, Long> {
}
