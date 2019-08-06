package Generic;

import java.util.ArrayList;
import java.util.Collection;

/*
*   泛型高级：
*   任意类型，如果没有明确，那么就是Object以及任意的java类了
    ?extends E
        向下限定，E以及子类
    ?super E
        向上限定，E以及父类
*
*   泛型如果明确的写的时候，前后必须一致
*  */
public class GenericDemo1 {
    public static void main(String[] args) {
        //?表示任意的类型都是可以的
        Collection<?> c = new ArrayList<Object>();
        Collection<?> c2 = new ArrayList<Animal>();
        Collection<?> c3 = new ArrayList<Dog>();
        Collection<?> c4 = new ArrayList<Cat>();


        //? extends E：向下限定，E以及子类
        //Collection<? extends Animal> c5= new ArrayList<Object>();
        Collection<? extends Animal> c6 = new ArrayList<Animal>();
        Collection<? extends Animal> c7 = new ArrayList<Dog>();
        Collection<? extends Animal> c8 = new ArrayList<Cat>();

        //？ super E：向上限定 ，E
        Collection<? super Animal> c9= new ArrayList<Object>();
        Collection<? super Animal> c10 = new ArrayList<Animal>();
        //Collection<? super Animal> c11 = new ArrayList<Dog>();
        //Collection<? super Animal> c12 = new ArrayList<Cat>();
    }
}

class Animal{}

class Dog extends Animal{}

class Cat extends Animal{}