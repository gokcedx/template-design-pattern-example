package com.gokcedx;

/**
 * template-design-pattern-example
 *
 * @author Gökçe Doğanay
 * @version 05.07.2020
 */
public class MarketAlisveris extends Alisveris {
    @Override
    public void iceriGir() {
        System.out.println("Marketten içeri girildi.");
    }

    @Override
    public void urunSec() {
        System.out.println("Marketten ürün seçidi.");
    }

    @Override
    public void ucretOde() {
        System.out.println("Markette ürünlerin ücreti ödendi.");
    }

    @Override
    public void posetle() {
        System.out.println("Markette ürünler poşetlendi.");
    }

    @Override
    public void disariCik() {
        System.out.println("Marketten dışarı çıkıldı.");
    }
}
