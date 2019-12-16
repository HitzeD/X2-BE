package net.comcast.x2;

import net.comcast.x2.models.Operation;
import net.comcast.x2.service.DocService;
import net.comcast.x2.service.OperationService;
import net.comcast.x2.service.SectionService;
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

    @Autowired
    SectionService sectionService;

    @Autowired
    DocService docService;

    @Override
    public void run(String... args) throws Exception
    {
        Operation op1 = new Operation("TechOps");
//        Operation op2 = new Operation("Xfinity Store");
//        Section sec1 = new Section("Sec 1", op1);
//        Doc d1 = new Doc("Doc 1", "https://soemthing.com", sec1);
//
//        sec1.getDocs().add(d1);
//        op1.getSections().add(sec1);
//        op2.getSections().add(sec1);

        operationService.save(op1);

//        Operation op2 = new Operation("Xfinity Store");
//        operationService.save(op2);
//
//        Operation op3 = new Operation("Launch");
//        operationService.save(op3);
//
//        Operation op4 = new Operation("Network Maintenance");
//        operationService.save(op4);
//
//        Operation op5 = new Operation("Project Management");
//        operationService.save(op5);



//        Section sec1 = new Section("Sec 1");
//        Section sec2 = new Section("Sec 2", op2);
//        sectionService.save(sec2);
//        Section sec3 = new Section("Sec 3", op3);
//        sectionService.save(sec3);
//        Section sec4 = new Section("Sec 4", op4);
//        sectionService.save(sec4);
//        Section sec5 = new Section("Sec 5", op5);
//        sectionService.save(sec5);



//        Doc d1 = new Doc("Doc 1", "https://soemthing.com", sec1);

//        sec1.getDocs().add(new Doc(d1.getDocname(), d1.getDocurl(), d1.getSection()));
//        sectionService.save(sec1);
//        Doc d2 = new Doc("Doc 2", "https://soemthing.com", sec2);
//        docService.save(d2);
//        Doc d3 = new Doc("Doc 3", "https://soemthing.com", sec3);
//        docService.save(d3);
//        Doc d4 = new Doc("Doc 4", "https://soemthing.com", sec4);
//        docService.save(d4);
//        Doc d5 = new Doc("Doc 5", "https://soemthing.com", sec5);
//        docService.save(d5);

    }
}
