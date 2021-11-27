package proxy_image;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProxyImageTest {
    ProxyImage proxyImage;

    @BeforeEach
    void setUp() {
        proxyImage = new ProxyImage("cat.png");
    }

    @Test
    void display() {
        proxyImage.display();
        assertNotNull(proxyImage.getRealImage());
    }
}