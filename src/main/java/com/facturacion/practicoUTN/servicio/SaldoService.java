package com.facturacion.practicoUTN.servicio;

import com.facturacion.practicoUTN.modelo.Saldo;
import com.facturacion.practicoUTN.repository.SaldoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaldoService {
    @Autowired
    private SaldoRepository saldoRepository;
    public List<Saldo> listarSaldos() {
        return saldoRepository.findAll();
    }
    public Saldo guardarSaldo(Saldo saldo) {
        return saldoRepository.save(saldo);
    }
    public void eliminarSaldo(Long id) {
        saldoRepository.deleteById(id);
    }
}