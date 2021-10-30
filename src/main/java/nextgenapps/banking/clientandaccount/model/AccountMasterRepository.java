package nextgenapps.banking.clientandaccount.model;

import org.springframework.data.r2dbc.repository.R2dbcRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AccountMasterRepository extends R2dbcRepository<AccountMaster, Long> {
    Mono<AccountMaster> findByAccountNumber(Long accountNumber);
    Flux<AccountMaster> findAll();
}
