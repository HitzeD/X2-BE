package net.comcast.x2.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "sections")
public class Section
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long sectionid;

    private String sectionname;

    @ManyToOne
    @JoinColumn(name = "opsid",
            nullable = false)
    private Operation operation;

    @OneToMany(mappedBy = "section",
            cascade = CascadeType.ALL)
    private List<Doc> docs = new ArrayList<>();

    public Section()
    {
    }

    public Section(String sectionname, List<Doc> docs)
    {
        this.sectionname = sectionname;
        this.docs = docs;
    }

    public long getSectionid()
    {
        return sectionid;
    }

    public void setSectionid(long sectionid)
    {
        this.sectionid = sectionid;
    }

    public String getSectionname()
    {
        return sectionname;
    }

    public void setSectionname(String sectionname)
    {
        this.sectionname = sectionname;
    }

    public List<Doc> getDocs()
    {
        return docs;
    }

    public void setDocs(List<Doc> docs)
    {
        this.docs = docs;
    }
}
