package be.intecbrussel.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MagazineImplementation implements MagazineImpl {

    private List<CookingMagazine> magazines = new ArrayList<>();

        @Override
        public void addMagazine(CookingMagazine magazine) {
            magazines.add(magazine);
        }

    @Override
    public CookingMagazine getMagazineByIndex(int index) {
        CookingMagazine magazine  = magazines.stream().
                filter(r -> r.getId() == index).
                findAny().orElse(null);
        return magazine;
    }

    @Override
        public void removeMagazine(CookingMagazine magazine) {
            magazines.remove(magazine);
        }

        @Override
        public void updateMagazine(int index, CookingMagazine magazine) {
            magazines.set(index,magazine);
        }
    }
