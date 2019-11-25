package net.comcast.x2;

import net.comcast.x2.models.Operation;
import net.comcast.x2.service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Component
public class SeedData implements CommandLineRunner
{
    @Autowired
    OperationService operationService;

    @Override
    public void run(String... args) throws Exception
    {
        Operation op1 = new Operation("TechOps");
        operationService.save(op1);

        Operation op2 = new Operation("Xfinity Store");
        operationService.save(op2);

        Operation op3 = new Operation("Launch");
        operationService.save(op3);

        Operation op4 = new Operation("Network Maintenance");
        operationService.save(op4);

        Operation op5 = new Operation("Project Management");
        operationService.save(op5);


    }
}
