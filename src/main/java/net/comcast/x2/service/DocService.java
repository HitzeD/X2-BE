package net.comcast.x2.service;

import net.comcast.x2.models.Doc;

import java.util.List;

public interface DocService
{
    List<Doc> findall();

    Doc findById(long id);

    Doc save(Doc doc);

    void delete(long id);
}
