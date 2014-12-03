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
public class Docent {
    private int Id;
    private String Naam;
    private String Email;
    private String Telefoon;

    /**
     * @return the Id
     */
    public int getId() {
        return Id;
    }

    /**
     * @return the Naam
     */
    public String getNaam() {
        return Naam;
    }

    /**
     * @param Naam the Naam to set
     */
    public void setNaam(String Naam) {
        this.Naam = Naam;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * @return the Telefoon
     */
    public String getTelefoon() {
        return Telefoon;
    }

    /**
     * @param Telefoon the Telefoon to set
     */
    public void setTelefoon(String Telefoon) {
        this.Telefoon = Telefoon;
    }
}
