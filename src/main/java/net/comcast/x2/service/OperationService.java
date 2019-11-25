package net.comcast.x2.service;

import net.comcast.x2.models.Operation;

import java.util.List;

public interface OperationService
{
    List<Operation> findall();

    Operation findById(long id);

    Operation save(Operation ops);

    void delete(long id);
}
