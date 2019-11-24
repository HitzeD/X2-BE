package net.comcast.x2.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "operations")
public class Operation
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long opsid;

    private String opsname;

    @OneToMany(mappedBy = "operation",
            cascade = CascadeType.ALL)
    private List<Section> sections = new ArrayList<>();

    public Operation()
    {
    }

    public Operation(String opsname, List<Section> sections)
    {
        this.opsname = opsname;
        this.sections = sections;
    }

    public long getOpsid()
    {
        return opsid;
    }

    public void setOpsid(long opsid)
    {
        this.opsid = opsid;
    }

    public String getOpsname()
    {
        return opsname;
    }

    public void setOpsname(String opsname)
    {
        this.opsname = opsname;
    }

    public List<Section> getSections()
    {
        return sections;
    }

    public void setSections(List<Section> sections)
    {
        this.sections = sections;
    }
}
