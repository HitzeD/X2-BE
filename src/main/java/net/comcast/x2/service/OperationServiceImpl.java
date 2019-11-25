package net.comcast.x2.service;

import net.comcast.x2.models.Doc;
import net.comcast.x2.models.Operation;
import net.comcast.x2.models.Section;
import net.comcast.x2.repository.OperationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Service(value = "operationService")
public class OperationServiceImpl implements OperationService
{
    @Autowired
    OperationRepository opsRepo;

    @Override
    public List<Operation> findall()
    {
        List<Operation> myList = new ArrayList<>();

        opsRepo.findAll()
                .iterator()
                .forEachRemaining(myList::add);
        return myList;
    }

    @Override
    public Operation findById(long id)
    {
        return opsRepo.findById(id).orElseThrow(() -> new EntityNotFoundException("Not Found " + id));
    }

    @Transactional
    @Override
    public Operation save(Operation ops)
    {
        Operation newOps = new Operation();

        newOps.setOpsname(ops.getOpsname());

        return opsRepo.save(newOps);
    }

    @Override
    public void delete(long id)
    {
        opsRepo.deleteById(id);
    }
}
