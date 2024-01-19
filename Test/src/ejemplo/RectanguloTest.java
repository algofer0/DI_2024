package ejemplo;

import static org.junit.jupiter.api.Assertions.*;

class RectanguloTest {



    @Test
    void test()
    {
      Rectangulo r = new   Rectangulo(3, 4);

        assert(()-> assertEquals(14, r.perimetro()));
    }
}