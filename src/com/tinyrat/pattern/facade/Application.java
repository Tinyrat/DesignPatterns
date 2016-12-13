package com.tinyrat.pattern.facade;

/**
 * Created by Administrator on 2016/12/13.
 */
public class Application {
    public static void main(String[] args) {
        ClientServerFacade clientFacade;
        String advertisement = "联想电脑，价格6666元，联系电话12345678901";
        clientFacade = new ClientServerFacade(advertisement);
        clientFacade.doAdvertisement();
    }
}
