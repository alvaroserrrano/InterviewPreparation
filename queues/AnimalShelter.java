import java.util.LinkedList;

//An animal shelter which holds only cats and dogs, operates on a strictly first in firs out fashion. People must either adopt the oldest animal (based on arrival time to the shelter) or they can select whether they prefer a cat or a dog (and will receive the oldest animal of that type). They cannot select the specific animal they want. Create the data structure to maintain the system and implement operations such as enqueue, dequeue, dequeueAny, dequeueDog and dequeueCat. You may use the built-in LinkedList data structure  
public abstract class Animal {
    private int order;
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int getOrder() {
        return this.order;
    }

    public boolean isOlderThan(Animal animal) {
        return this.order < animal.getOrder();
    }
}

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
}

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
}

class AnimalShelter {
    LinkedList<Dog> dogs = new LinkedList<>();
    LinkedList<Cat> cats = new LinkedList<>();
    private int order = 0;

    public void enqueue(Animal animal) {
        animal.setOrder(order);
        order++;
        if (animal instanceof Dog)
            dogs.addLast((Dog) animal);
        else if (animal instanceof Cat)
            cats.addLast((Cat) animal);
    }

    public Animal dequeueAny() {
        if (dogs.size() == 0) {
            return dequeuCats();
        } else if (cats.size() == 0) {
            return dequeuDogs();
        }
        Dog dog = dogs.peek();
        Cat cat = cats.peek();
        if (dog.isOlderThan(cat)) {
            return dequeueDogs();
        } else {
            return dequeueCats();
        }
    }

    public Dog dequeueDog() {
        return dogs.poll();
    }

    public Cat dequeueCats() {
        return cats.poll();
    }
}