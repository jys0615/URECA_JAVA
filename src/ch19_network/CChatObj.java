package ch19_network;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class CChatObj implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
	private String message;
	private Date date;

}
