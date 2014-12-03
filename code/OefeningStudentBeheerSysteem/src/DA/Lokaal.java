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
public class Lokaal {
    private int Id;
    private int Lokaalnummer;
    private int Gebouw;

    /**
     * @return the Id
     */
    public int getId() {
        return Id;
    }

    /**
     * @return the Lokaalnummer
     */
    public int getLokaalnummer() {
        return Lokaalnummer;
    }

    /**
     * @param Lokaalnummer the Lokaalnummer to set
     */
    public void setLokaalnummer(int Lokaalnummer) {
        this.Lokaalnummer = Lokaalnummer;
    }

    /**
     * @return the Gebouw
     */
    public int getGebouw() {
        return Gebouw;
    }

    /**
     * @param Gebouw the Gebouw to set
     */
    public void setGebouw(int Gebouw) {
        this.Gebouw = Gebouw;
    }
}
