package nextgenapps.banking.clientandaccount;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import nextgenapps.banking.clientandaccount.model.AccountMaster;
import nextgenapps.banking.clientandaccount.model.AccountMasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDate;

@Slf4j
@RestController
@RequestMapping(value = "/api/member")
@RequiredArgsConstructor
public class AccountController {

    @Autowired
    private AccountMasterRepository accountMasterRepository;

    @GetMapping
    public Flux<AccountMaster> getAll() {
        return accountMasterRepository.findAll();
    }

    @PostMapping(value = "/{accountnumber}")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<AccountMaster> createAccount(@PathVariable String accountnumber) {
        AccountMaster accountMaster = new AccountMaster();
        accountMaster.setAccountNumber(Long.parseLong(accountnumber));
        accountMaster.setAccountType("LOAN");
        accountMaster.setOpeningDate(LocalDate.now());
        return accountMasterRepository.save(accountMaster);
    }
}
