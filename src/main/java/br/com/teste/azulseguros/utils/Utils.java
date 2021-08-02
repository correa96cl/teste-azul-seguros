package br.com.teste.azulseguros.utils;

import br.com.teste.azulseguros.exception.FormatIdException;

public class Utils {

	private Utils() {
	}

	public static final void validateZipCode(String zipCode) {
		if (zipCode.length() > 8 || zipCode.length() < 8) {
			throw new FormatIdException("CEP informado é invalido");
		}
	}
}
