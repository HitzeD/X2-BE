package net.comcast.x2.service;

import net.comcast.x2.models.Doc;
import net.comcast.x2.repository.DocRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Service(value = "docService")
public class DocServiceImpl implements DocService
{
    @Autowired
    DocRepository docrepo;

    @Override
    public List<Doc> findall()
    {
        List<Doc> myList = new ArrayList<>();

        docrepo.findAll()
                .iterator()
                .forEachRemaining(myList::add);
        return myList;
    }

    @Override
    public Doc findById(long id)
    {
        return docrepo.findById(id).orElseThrow(() -> new EntityNotFoundException("Not Found " + id));
    }

    @Transactional
    @Override
    public Doc save(Doc doc)
    {
        Doc newDoc = new Doc();

        newDoc.setDocname(doc.getDocname());

        newDoc.setDocurl(doc.getDocurl());

        return docrepo.save(newDoc);
    }

    @Override
    public void delete(long id)
    {
        docrepo.deleteById(id);
    }
}
