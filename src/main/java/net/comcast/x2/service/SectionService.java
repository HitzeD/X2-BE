package net.comcast.x2.service;

import net.comcast.x2.models.Section;

import java.util.List;

public interface SectionService
{
    List<Section> findall();

    Section findById(long id);

    Section save(Section section);

    void delete(long id);
}
