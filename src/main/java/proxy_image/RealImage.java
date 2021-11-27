package proxy_image;

import lombok.Getter;
import lombok.Setter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

@Getter @Setter
public class RealImage implements Image{
    private String fileName;
    private boolean loaded = false;

    public RealImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (!loaded) {
            loadFromDisk();
            if (!loaded) {
                System.out.println("Couldn't open file: " + fileName);
                return;
            }
        }
        System.out.println("Displaying file: " + fileName);
    }

    public void loadFromDisk() {
            File f = new File(fileName);
            if (f.exists() && !f.isDirectory()) {
                this.loaded = true;
                System.out.println("File loaded: " + fileName);
            } else {
                this.loaded = false;
                System.out.println(fileName + ": file not loaded");
            }
    }
}
