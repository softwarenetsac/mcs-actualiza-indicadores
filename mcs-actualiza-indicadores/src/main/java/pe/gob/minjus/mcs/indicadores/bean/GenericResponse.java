package pe.gob.minjus.mcs.indicadores.bean;

import java.io.Serializable;

public class GenericResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private String code;
	private String message;
	private Object data;

	public GenericResponse() {

	}

	public GenericResponse(String code, String message, Object data) {

		this.code = code;
		this.message = message;
		this.data = data;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "GenericResponse [code=" + code + ", message=" + message + ", data=" + data + "]";
	}

}
