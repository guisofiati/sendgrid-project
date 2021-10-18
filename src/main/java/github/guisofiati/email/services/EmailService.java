package github.guisofiati.email.services;

import github.guisofiati.email.dto.EmailDTO;

public interface EmailService {
	
	void sendEmail(EmailDTO dto);
}