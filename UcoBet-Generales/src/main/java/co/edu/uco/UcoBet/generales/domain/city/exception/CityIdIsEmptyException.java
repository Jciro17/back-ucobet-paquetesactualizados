package co.edu.uco.ucobet.generales.domain.city.exception;

import co.edu.uco.ucobet.generales.crosscutting.exceptions.RuleUcoBetException;
import co.edu.uco.ucobet.generales.infraestructure.secondaryadapters.redis.MessageCatalogServiceImpl;

public class CityIdIsEmptyException extends RuleUcoBetException {

	private static final long serialVersionUID = 1L;

	public CityIdIsEmptyException(String technicalMessage, String userMessage, Exception rootException) {
		super(technicalMessage, userMessage, rootException);
	}

	public static final CityIdIsEmptyException create(MessageCatalogServiceImpl messageCatalogService) {
		var userMessage = messageCatalogService.getMessage("CityIdIsEmptyException");
		return new CityIdIsEmptyException(userMessage, userMessage, new Exception());
	}

}
