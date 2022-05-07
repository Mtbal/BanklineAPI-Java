package com.dio.santander.banklineapi.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.santander.banklineapi.dto.NovaMovimentação;
import com.dio.santander.banklineapi.model.Correntista;
import com.dio.santander.banklineapi.model.Movimentação;
import com.dio.santander.banklineapi.model.MovimentaçãoTipo;
import com.dio.santander.banklineapi.repository.CorrentistaRepository;
import com.dio.santander.banklineapi.repository.MovimentaçãoRepository;

@Service
public class MovimentaçãoService {
	@Autowired
	private MovimentaçãoRepository repository;
	
	@Autowired
	private CorrentistaRepository correntistaRepository;
	public void save(NovaMovimentação novaMovimentação) {
		Movimentação movimentação = new Movimentação();
		
		//Double valor = novaMovimentação.getTipo()==MovimentaçãoTipo.RECEITA ? novaMovimentação.getValor() : novaMovimentação.getValor() * -1;
		
		Double valor = novaMovimentação.getValor();
		if(novaMovimentação.getTipo() == MovimentaçãoTipo.DESPESA)
			valor = valor * -1;
		
		movimentação.setDatahora(LocalDateTime.now());
		movimentação.setDescrição(novaMovimentação.getDescrição());
		movimentação.setIdConta(novaMovimentação.getIdConta());
		movimentação.setTipo(novaMovimentação.getTipo());
		movimentação.setValor(valor);
		
		Correntista correntista = correntistaRepository.findById(novaMovimentação.getIdConta()).orElse(null);
		if(correntista!=null){
			correntista.getConta().setSaldo(correntista.getConta().getSaldo() + valor);
			correntistaRepository.save(correntista);
		}
		
		repository.save(movimentação);
	}
}
