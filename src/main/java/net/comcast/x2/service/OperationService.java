package net.comcast.x2.service;

import net.comcast.x2.models.Operation;
import net.comcast.x2.models.Section;

import java.util.List;

public interface OperationService
{
    List<Operation> findall();

    Operation findById(long id);

    Operation save(Operation ops);

    Operation addSection(Operation ops, Section section);

    void delete(long id);
}
