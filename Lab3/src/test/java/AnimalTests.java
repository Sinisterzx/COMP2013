import com.lab3.*;
import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.generator.Size;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import net.jqwik.api.ForAll;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

@RunWith(JUnitQuickcheck.class)
public class AnimalTests {

    private final PrintStream standardout = System.out;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    Bear bear = new Bear("Bruce");



    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    @DisplayName("Test1")
    void Animal_test1(){
        bear.eat();
        Assertions.assertEquals("Fish", outContent.toString().trim());
    }

    @Test
    @DisplayName("Test2")
    void Animal_test2(){
        bear.setName("Bruce");
        Assertions.assertEquals("Bruce", bear.getName());
    }

    @ParameterizedTest
    @DisplayName("Test3")
    @ValueSource(strings = {"Bruce", "James", "jackson"})
    void Animal_test3(String animal_name){
        bear.setName(animal_name);
        Assertions.assertEquals(animal_name, bear.getName());
    }

    @DisplayName("Test4")
    @Property
    void animal_test4(@ForAll @Size(max = 50) String name){
        bear.setName(name);
        Assertions.assertEquals(name, bear.getName());

    }



    @AfterEach void tearDown(){
        System.setOut(standardout);
    }





}
