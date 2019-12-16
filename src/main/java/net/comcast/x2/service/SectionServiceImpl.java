package net.comcast.x2.service;

import net.comcast.x2.models.Doc;
import net.comcast.x2.models.Section;
import net.comcast.x2.repository.SectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Service(value = "sectionService")
public class SectionServiceImpl implements SectionService
{
    @Autowired
    SectionRepository secRepo;

    @Override
    public List<Section> findall()
    {
        List<Section> myList = new ArrayList<>();

        secRepo.findAll()
                .iterator()
                .forEachRemaining(myList::add);
        return myList;
    }

    @Override
    public Section findById(long id)
    {
        return secRepo.findById(id).orElseThrow(() -> new EntityNotFoundException("Not Found " + id));
    }

    @Transactional
    @Override
    public Section save(Section section)
    {
        Section newSec = new Section();

        newSec.setSectionname(section.getSectionname());

        newSec.setSectionid(section.getSectionid());

        for (Doc d : section.getDocs())
        {
            newSec.getDocs()
                    .add(new Doc(d.getDocname(), d.getDocurl(), newSec));
        }

        return secRepo.save(newSec);
    }

    @Override
    public void delete(long id)
    {
        secRepo.deleteById(id);
    }
}
