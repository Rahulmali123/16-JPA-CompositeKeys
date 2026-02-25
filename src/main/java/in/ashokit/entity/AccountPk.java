package in.ashokit.entity;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountPk implements  Serializable
{
	
	private Integer accId;

	private String accType;
	
	private String holderName;

	

}
