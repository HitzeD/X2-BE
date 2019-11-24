package net.comcast.x2.models;

import javax.persistence.*;

@Entity
@Table(name = "docs")
public class Doc
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long docid;

    private String docname;

    private String docurl;

    @ManyToOne
    @JoinColumn(name = "sectionid",
            nullable = false)
    private Section section;

    public Doc()
    {
    }

    public Doc(String docname, String docurl)
    {
        this.docname = docname;
        this.docurl = docurl;
    }

    public long getDocid()
    {
        return docid;
    }

    public void setDocid(long docid)
    {
        this.docid = docid;
    }

    public String getDocname()
    {
        return docname;
    }

    public void setDocname(String docname)
    {
        this.docname = docname;
    }

    public String getDocurl()
    {
        return docurl;
    }

    public void setDocurl(String docurl)
    {
        this.docurl = docurl;
    }
}
