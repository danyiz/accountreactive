package nextgenapps.banking.clientandaccount.model;

import lombok.*;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountMaster {
    @Id
    Long uuid;
    Long accountNumber;
    String accountType;
    LocalDate openingDate;
}

