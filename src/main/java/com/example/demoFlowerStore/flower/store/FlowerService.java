package com.example.demoFlowerStore.flower.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlowerService {

    private final FlowerRepository flowerRepository;

    @Autowired
    public FlowerService(FlowerRepository flowerRepository) {
        this.flowerRepository = flowerRepository;
    }

    public List<Flower> getFlowers(){
//        List<Flower> objects = Arrays.asList(
//                new Flower(10.0, RED, 40.0, FlowerType.TULIP, 100L),
//                new Flower(10.0, WHITE, 20.0, FlowerType.CHAMOMILE, 10L),
//                new Flower(5.0, YELLOW, 50.0, FlowerType.ROSE, 1L)
//        );
//        return objects;
        return flowerRepository.findAll();
    }

    public void addNewFlower(Flower flower) {
        System.out.println(flower);
    }
}
