package com.Ramakrishna.rest;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.Ramakrishna.rest.Exceptions.PatientBusinessException;

@Provider
public class PatientBusinessExceptionMapper implements ExceptionMapper<PatientBusinessException> {

	@Override
	public Response toResponse(PatientBusinessException e) {
		StringBuilder sb = new StringBuilder();
		sb.append("{");
		sb.append("\"status\":\"error\"");
		sb.append(",");
		sb.append("\"message\":\"Try again later\"");
		sb.append("}");
		
		return Response.serverError().entity(sb.toString()).type(MediaType.APPLICATION_JSON).build();
	}

}
