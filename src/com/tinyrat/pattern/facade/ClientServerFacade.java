package com.tinyrat.pattern.facade;

/**
 * Created by Administrator on 2016/12/13.
 */
public class ClientServerFacade {
    private CheckWord checkWord;
    private Charge charge;
    private TypeSetting typeSetting;
    String advertisement;

    public ClientServerFacade(String advertisement) {
        this.advertisement = advertisement;
        checkWord = new CheckWord(advertisement);
        charge = new Charge(checkWord);
        typeSetting = new TypeSetting(advertisement);
    }

    public void doAdvertisement() {
        checkWord.setChargeAmount();
        charge.giveCharge();
        typeSetting.typeSetting();
    }
}
