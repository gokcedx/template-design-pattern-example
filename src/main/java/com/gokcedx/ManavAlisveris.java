package com.gokcedx;

/**
 * template-design-pattern-example
 *
 * @author Gökçe Doğanay
 * @version 05.07.2020
 */
public class ManavAlisveris extends Alisveris{
    @Override
    public void iceriGir() {
        System.out.println("Manavdan içeri girildi.");
    }

    @Override
    public void urunSec() {
        System.out.println("Manavdan ürün seçidi.");
    }

    @Override
    public void ucretOde() {
        System.out.println("Manavda ürünlerin ücreti ödendi.");
    }

    @Override
    public void posetle() {
        System.out.println("Manavda ürünler poşetlendi.");
    }

    @Override
    public void disariCik() {
        System.out.println("Manavdan dışarı çıkıldı.");
    }
}
