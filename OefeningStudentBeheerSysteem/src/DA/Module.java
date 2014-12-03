/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DA;

/**
 *
 * @author Ernst
 */
public class Module {
 private int Id;
 private String moduleNummer;
 private String richting;
 private String vak;

    /**
     * @return the Id
     */
    public int getId() {
        return Id;
    }

    /**
     * @return the moduleNummer
     */
    public String getModuleNummer() {
        return moduleNummer;
    }

    /**
     * @param moduleNummer the moduleNummer to set
     */
    public void setModuleNummer(String moduleNummer) {
        this.moduleNummer = moduleNummer;
    }

    /**
     * @return the richting
     */
    public String getRichting() {
        return richting;
    }

    /**
     * @param richting the richting to set
     */
    public void setRichting(String richting) {
        this.richting = richting;
    }

    /**
     * @return the vak
     */
    public String getVak() {
        return vak;
    }

    /**
     * @param vak the vak to set
     */
    public void setVak(String vak) {
        this.vak = vak;
    }
 
 
}
