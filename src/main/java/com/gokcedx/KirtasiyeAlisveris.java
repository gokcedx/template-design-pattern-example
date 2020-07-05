package com.gokcedx;

/**
 * template-design-pattern-example
 *
 * @author Gökçe Doğanay
 * @version 05.07.2020
 */
public class KirtasiyeAlisveris extends Alisveris {
    @Override
    public void iceriGir() {
        System.out.println("Kırtasiyeden içeri girildi.");
    }

    @Override
    public void urunSec() {
        System.out.println("Kırtasiyeden ürün seçidi.");
    }

    @Override
    public void ucretOde() {
        System.out.println("Kırtasiyede ürünlerin ücreti ödendi.");
    }

    @Override
    public void posetle() {
        System.out.println("Kırtasiyede ürünler poşetlendi.");
    }

    @Override
    public void disariCik() {
        System.out.println("Kırtasiyeden dışarı çıkıldı.");
    }
}
