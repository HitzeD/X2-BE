package net.comcast.x2.repository;

import net.comcast.x2.models.Section;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SectionRepository extends CrudRepository<Section, Long>
{
}
