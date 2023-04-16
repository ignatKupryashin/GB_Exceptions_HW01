package org.example;

//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, каждый элемент которого
// равен разности элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.

import java.util.Arrays;
import java.util.Random;

public class Main {

    static Random random = new Random();

    public static void main(String[] args){
        int[] array1 = generateArray(5);
        int[] array2 = generateArray(5);
        int[] array3 = generateArray(6);
        System.out.println(Arrays.toString(subtractArrays(array1, array2)));
        System.out.println(Arrays.toString(subtractArrays(array1, array3)));
    }


    /**
     * Метод создания случайного массива типа int заданной длинны
     * @param length длинна массива
     * @return int[]
     */
    public static int[] generateArray(int length){
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }





    /**
     * Метод вычитания одного массива из другого. Если дльны массивов не одинаковые
      * @param array1 массив из элементов которого будет вычитаться
     * @param array2 массив, элеметы которого будут вычитаться
     * @return Новый массив той же длинны, элементами которого являются разности элементов двух входящих массивов в той же ячейке.
     */
    public static int[] subtractArrays(int[] array1, int[] array2) {
        if (array1 == null || array2 == null){
            throw new NullPointerException("Оба массива доллжны существовать");
        }
        if (array1.length != array2.length){
            throw new CustomArrayRuntimeException(String.format("Длинны Массивов должны быть равны.\nДлинна первого массива: %d\nДлинна второго массива: %d", array1.length, array2.length), array1.length, array2.length);
        }
        else {
            int[] resolt = new int[array1.length];
            for (int i = 0; i < array1.length; i++) {
                resolt[i] = array1[i] - array2[i];
            }
            return resolt;
        }

    }








}