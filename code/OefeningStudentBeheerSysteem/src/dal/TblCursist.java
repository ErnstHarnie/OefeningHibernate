package dal;
// Generated 3-dec-2014 14:24:29 by Hibernate Tools 4.3.1



/**
 * TblCursist generated by hbm2java
 */
public class TblCursist  implements java.io.Serializable {


     private Integer id;
     private String naam;
     private String email;
     private String richting;
     private String telefoon;

    public TblCursist() {
    }

    public TblCursist(String naam, String email, String richting, String telefoon) {
       this.naam = naam;
       this.email = email;
       this.richting = richting;
       this.telefoon = telefoon;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNaam() {
        return this.naam;
    }
    
    public void setNaam(String naam) {
        this.naam = naam;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getRichting() {
        return this.richting;
    }
    
    public void setRichting(String richting) {
        this.richting = richting;
    }
    public String getTelefoon() {
        return this.telefoon;
    }
    
    public void setTelefoon(String telefoon) {
        this.telefoon = telefoon;
    }




}

