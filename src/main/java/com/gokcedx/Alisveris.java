package com.gokcedx;

/**
 * template-design-pattern-example
 *
 * @author Gökçe Doğanay
 * @version 05.07.2020
 */
public abstract class Alisveris {

    // burada alisverisYap metodu bir templatedir.
    public final void alisverisYap(){
        iceriGir();
        urunSec();
        ucretOde();
        posetle();
        disariCik();
    }

    public abstract void iceriGir();
    public abstract void urunSec();
    public abstract void ucretOde();
    public abstract void posetle();
    public abstract void disariCik();
}
