package net.comcast.x2.service;

import net.comcast.x2.models.Doc;
import net.comcast.x2.repository.DocRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
        return null;
    }

    @Override
    public Doc findById(long id)
    {
        return null;
    }

    @Override
    public Doc save(Doc doc)
    {
        return null;
    }

    @Override
    public void delete(long id)
    {

    }
}
