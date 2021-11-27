package proxy_image;

import lombok.Getter;

@Getter
public class ProxyImage implements Image{
    private RealImage realImage;
    private String filename;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(filename);
        }

        this.realImage.display();
    }
}
