package com.hillel.IhorProkhorov.HomeTaskSix.Impl;

import com.hillel.IhorProkhorov.HomeTaskSix.Interfaces.TakingHome;

public class GuideDog extends Dog implements TakingHome {

    private boolean isTrained;

    public GuideDog(int id, int age, double weight, String color, String name, boolean isVaccinated, boolean isTrained) {
        super(id, age, weight, color, name, isVaccinated);
        this.isTrained = isTrained;
    }

    @Override
    public String voice() {
        if (isTakingHome()){
            return super.voice() + " I can take you home." ;
        }else return super.voice() ;
    }

    @Override
    public boolean isTakingHome() {
        if (isTrained) return true;
        else return false;
    }
}
