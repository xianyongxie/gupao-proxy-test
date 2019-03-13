package com.gupao.proxy.staticproxy;

import com.gupao.proxy.IBuyHouse;

/**
 * Created by xuhuan on 2019/3/13.
 */
public class BuyHouseProxy implements IBuyHouse {

    private IBuyHouse buyHouse;

    public BuyHouseProxy(final IBuyHouse buyHouse){
        this.buyHouse = buyHouse;
    }

    public void buyHouse() {
        System.out.println("买房前要借钱");
        buyHouse.buyHouse();
        System.out.println("买房后要还钱");
    }
}
