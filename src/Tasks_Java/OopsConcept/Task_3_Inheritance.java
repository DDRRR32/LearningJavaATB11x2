package Tasks_Java.OopsConcept;

public class Task_3_Inheritance {
    public static void main(String[] args) {

        System.out.println("Single Inheritance:");
        Father f = new Father();

        System.out.println("\nMultilevel Inheritance:");
        Son s = new Son();

        System.out.println("\nHierarchical Inheritance:");
        Daughter d = new Daughter();
    }
}

// Base class
class GrandFather {
    GrandFather() {
        System.out.println("I am Grandfather!!");
    }
}

// Single Inheritance: Father inherits from GrandFather
class Father extends GrandFather {
    Father() {
        System.out.println("I am Father!!");
    }
}

// Multilevel Inheritance: Son inherits from Father, which inherits from GrandFather
class Son extends Father {
    Son() {
        System.out.println("I am Son!!");
    }
}

// Hierarchical Inheritance: Daughter also inherits directly from GrandFather
class Daughter extends GrandFather {
    Daughter() {
        System.out.println("I am Daughter!!");
    }
}
