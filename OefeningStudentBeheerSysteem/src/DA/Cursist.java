
package DA;

/**
 *
 * @author Ernst
 */
public class Cursist {
    private int Id;
    private String naam;
    private String richting;
    private String email;
    private String telefoon;

    /**
     * @return the Id
     */
    public int getId() {
        return Id;
    }

    /**
     * @return the naam
     */
    public String getNaam() {
        return naam;
    }

    /**
     * @param naam the naam to set
     */
    public void setNaam(String naam) {
        this.naam = naam;
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
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telefoon
     */
    public String getTelefoon() {
        return telefoon;
    }

    /**
     * @param telefoon the telefoon to set
     */
    public void setTelefoon(String telefoon) {
        this.telefoon = telefoon;
    }
}
