package com.BikkadIT.IRCTC.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.BikkadIT.IRCTC.model.Passanger;
import com.BikkadIT.IRCTC.model.Ticket;
import com.BikkadIT.IRCTC.repository.PassangerRepository;

@org.springframework.stereotype.Service
public class ServiceI implements Service {

	@Autowired
	private PassangerRepository passangerRepository;

	@Override
	public Ticket bookTicket(Passanger psg) {
		Passanger passanger = passangerRepository.save(psg);

		if (passanger != null) {
			Ticket t = new Ticket();
			t.settStatus("Booked");
			t.setPnr("875687");
			t.settAmount(123.00);
			return t;
		} else {
			return null;
		}

	}
	
}
