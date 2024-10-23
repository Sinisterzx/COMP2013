import com.lab3.Zoo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestZoo {

    @Test
    @DisplayName("Test ID")
    void Zoo_Test1(){
        Zoo zoos[] = new Zoo[4];
        for (int i = 0; i < zoos.length; i++){
            zoos[i] = new Zoo();
        }

        for (int i = 0; i < zoos.length-1; i++){
            Assertions.assertNotEquals(zoos[i].get_id(), zoos[3].get_id());
        }


    }

    @Test
    @DisplayName("Number of Compunds")
    void Zoo_Test2(){
        Zoo zoo = new Zoo( "New York", 42);
        Assertions.assertEquals(42, zoo.get_num_compounds());
    }

    @Test
    @DisplayName("Add Compunds")
    void Zoo_Test3(){
        Zoo zoo = new Zoo( "New York", 42);
        zoo.BuildNewCompound();
        Assertions.assertEquals(zoo.get_num_compounds(), 43);
    }






}
