package org.example;

public class ProductService {
    private int count = 0;
    public int countByFilter(BatchOfProducts batch, Object filter) {
        for (int i = 0; i < batch.getArr().length; i++) {
            if (batch.getArr()[i] instanceof PackagedPieceProduct) {
                if(filter instanceof BeginStringFilter) {
                    if (((BeginStringFilter) filter).apply(((PackagedPieceProduct) batch.getArr()[i]).getPProd().getName())) count++;
                }
                if(filter instanceof BeginStringFilter1) {
                    if (((BeginStringFilter1) filter).apply(((PackagedPieceProduct) batch.getArr()[i]).getPProd().getName())) count++;
                }
                if(filter instanceof BeginStringFilter2) {
                    if (((BeginStringFilter2) filter).apply(((PackagedPieceProduct) batch.getArr()[i]).getPProd().getName())) count++;
                }
            }
            if (batch.getArr()[i] instanceof PackagedWeightProduct) {
                if(filter instanceof BeginStringFilter) {
                    if (((BeginStringFilter) filter).apply(((PackagedWeightProduct) batch.getArr()[i]).getWProd().getName())) count++;
                }
                if(filter instanceof BeginStringFilter1) {
                    if (((BeginStringFilter1) filter).apply(((PackagedWeightProduct) batch.getArr()[i]).getWProd().getName())) count++;
                }
                if(filter instanceof BeginStringFilter2) {
                    if (((BeginStringFilter2) filter).apply(((PackagedWeightProduct) batch.getArr()[i]).getWProd().getName())) count++;
                }
            }
        }
        return count;
    }
}
