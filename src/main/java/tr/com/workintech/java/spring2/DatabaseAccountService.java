package tr.com.workintech.java.spring2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DatabaseAccountService implements AccountService {

    private final RiskAssessor riskAssessor;

    private DatabaseAuthorizationService databaseAuthorizationService;

//    @Autowired
    // 1 constructor varsa bunu eklememize gerek yok, otomatik olarak o constructor kullanilacak
    public DatabaseAccountService(RiskAssessor riskAssessor) {
        this.riskAssessor = riskAssessor;

        System.out.println("Found risk assessor: " + riskAssessor);
    }

    @Autowired
    public void setDatabaseAuthorizationService(DatabaseAuthorizationService databaseAuthorizationService) {

        this.databaseAuthorizationService = databaseAuthorizationService;

        System.out.println("Set authorization service!");
    }
}
