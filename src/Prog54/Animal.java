package Prog54;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.rmi.server.ExportException;
import java.util.Objects;

class Animal implements Serializable {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Animal) {
            return Objects.equals(name, ((Animal) obj).name);
        }
        return false;
    }

    public static Animal[] deserializeAnimalArray(byte[] data) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(data);
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            int size = objectInputStream.readInt();
            Animal[] result = new Animal[size];
            for (int i = 0; i < size; i++) {
                result[i] = (Animal) objectInputStream.readObject();
            }
            return result;
        }catch(Exception exc){
            throw new IllegalArgumentException();
        }
    }
}