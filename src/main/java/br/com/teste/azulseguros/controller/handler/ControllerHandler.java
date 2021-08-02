package br.com.teste.azulseguros.controller.handler;

import br.com.teste.azulseguros.model.ApiException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import br.com.teste.azulseguros.exception.FormatIdException;

@ControllerAdvice
public class ControllerHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler({ FormatIdException.class })
	public ResponseEntity<ApiException> handlerException(FormatIdException ex) {
		return ResponseEntity.status(HttpStatus.BAD_REQUEST)
				.body(new ApiException(ex.getMessage(), HttpStatus.BAD_REQUEST.value()));
	}

}
