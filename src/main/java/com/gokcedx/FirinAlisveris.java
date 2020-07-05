package com.gokcedx;

/**
 * template-design-pattern-example
 *
 * @author Gökçe Doğanay
 * @version 05.07.2020
 */
public class FirinAlisveris extends Alisveris {
    @Override
    public void iceriGir() {
        System.out.println("Fırından içeri girildi.");
    }

    @Override
    public void urunSec() {
        System.out.println("Fırından ürün seçidi.");
    }

    @Override
    public void ucretOde() {
        System.out.println("Fırında ürünlerin ücreti ödendi.");
    }

    @Override
    public void posetle() {
        System.out.println("Fırında ürünler poşetlendi.");
    }

    @Override
    public void disariCik() {
        System.out.println("Fırından dışarı çıkıldı.");
    }
}
