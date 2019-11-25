package net.comcast.x2.repository;

import net.comcast.x2.models.Doc;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocRepository extends CrudRepository<Doc, Long>
{
}
