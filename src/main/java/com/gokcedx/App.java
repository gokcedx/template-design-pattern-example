package com.gokcedx;

/**
 * template-design-pattern-example
 *
 * @author Gökçe Doğanay
 * @version 05.07.2020
 */
public class App 
{
    public static void main( String[] args )
    {
        FirinAlisveris firinAlisveris = new FirinAlisveris();
        firinAlisveris.alisverisYap();
        KirtasiyeAlisveris kirtasiyeAlisveris = new KirtasiyeAlisveris();
        kirtasiyeAlisveris.alisverisYap();
        ManavAlisveris manavAlisveris = new ManavAlisveris();
        manavAlisveris.alisverisYap();
        MarketAlisveris marketAlisveris = new MarketAlisveris();
        marketAlisveris.alisverisYap();
    }
}
