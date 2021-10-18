package github.guisofiati.email.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import github.guisofiati.email.dto.EmailDTO;

public class MockEmailService implements EmailService {

	private static Logger LOG = LoggerFactory.getLogger(MockEmailService.class);

	public void sendEmail(EmailDTO dto) {
		LOG.info("Send email to: " +dto.getTo());
		LOG.info("Email sent!");
	}
}