package com.company;

import java.util.ArrayList;

public class WeightService {
    final private ArrayList<Weight> weights = new ArrayList<>();

    public void addWeight(String loader, String worker){
        weights.add(new Weight(loader, worker));
    }

    public boolean deleteWeight(Weight weight){
        return weights.remove(weight);
    }

    public ArrayList<Weight> getWeights(){
        return weights;
    }

    public void setVehicle(Vehicle vehicle){
        for (Weight weight: weights){

        }
    }

    public void unpackWeight(Vehicle vehicle){
        vehicle.setStatusFree();
        vehicle.getWeight().setStatusReceived();
    }
}
