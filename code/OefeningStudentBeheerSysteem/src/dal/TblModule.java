package dal;
// Generated 3-dec-2014 14:24:29 by Hibernate Tools 4.3.1



/**
 * TblModule generated by hbm2java
 */
public class TblModule  implements java.io.Serializable {


     private Integer id;
     private String vak;
     private String richting;
     private String modulenummer;

    public TblModule() {
    }

    public TblModule(String vak, String richting, String modulenummer) {
       this.vak = vak;
       this.richting = richting;
       this.modulenummer = modulenummer;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getVak() {
        return this.vak;
    }
    
    public void setVak(String vak) {
        this.vak = vak;
    }
    public String getRichting() {
        return this.richting;
    }
    
    public void setRichting(String richting) {
        this.richting = richting;
    }
    public String getModulenummer() {
        return this.modulenummer;
    }
    
    public void setModulenummer(String modulenummer) {
        this.modulenummer = modulenummer;
    }




}


