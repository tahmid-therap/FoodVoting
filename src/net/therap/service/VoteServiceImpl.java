package net.therap.service;

import net.therap.dao.FoodDao;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: tahmid
 * Date: 4/22/12
 * Time: 4:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class VoteServiceImpl implements VoteService {

    public void vote(String [] foodNameList) {

        FoodDao foodDao = new FoodDao();

        for (String foodName : foodNameList) {
             foodDao.updateVoteCount(foodName);
        }

    }
}
