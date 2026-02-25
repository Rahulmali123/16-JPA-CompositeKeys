package in.ashokit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "BRANCH_ACCOUNTS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account 
{
	
	@Column(name = "BRANCH_NAME")
	private String branchName;

	@Column(name = "MIN_BAL")
	private Double minBal;

	@EmbeddedId
	private AccountPk accPk;
	
}
