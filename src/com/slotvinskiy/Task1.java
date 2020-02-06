package com.slotvinskiy;

//Написать метод numJewelsInStones который принимает 2 параметра:
// - String jewels: строка, каждый сивол которой это драгоценный камень, символы уникальны
// - String stones: строка, каждый сивол которой это камень.
// Строки могут состоять только из a..zA..Z
// Метод должен вернуть количество драгоценных камней в строке stones.


public class Task1 {

    public static void main(String[] args) {
        String jewels = "aAb";
        String stones = "cacAcA";
        int jewelsNum = numJewelsInStones(jewels, stones);
        System.out.println(jewelsNum);

    }

    private static int numJewelsInStones(String jewels, String stones) {
        char[] stonesArray = stones.toCharArray();
        int counter = 0;
        for (int i = 0; i < stonesArray.length; i++) {
            if (jewels.contains(Character.toString(stonesArray[i]))) {
                counter++;
            }
        }
        return counter;
    }
}
