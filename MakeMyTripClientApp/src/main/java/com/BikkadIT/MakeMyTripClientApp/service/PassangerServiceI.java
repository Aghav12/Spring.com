package com.BikkadIT.MakeMyTripClientApp.service;

import com.BikkadIT.MakeMyTripClientApp.request.Passanger;
import com.BikkadIT.MakeMyTripClientApp.response.Ticket;

public interface PassangerServiceI {

	public Ticket bookTicketResttemplete(Passanger psg);

	public Ticket bookTicketWebClient(Passanger psg);
}
