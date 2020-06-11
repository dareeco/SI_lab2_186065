import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
public class SILab2Test {
    private List<String> createUserList(String... elems){
        return new ArrayList<>(Arrays.asList(elems));
    }
    //User=null,allUsers=null vo jazli:1,2,3,4,26
    @Test
    void TestEveryStatement(){


        List<String>lista=createUserList("User1","User2");


        //User(null)
        assertEquals(false, SILab2.function(new User("User1","12abcdef","user2@hotmail.com"),lista)) //vrvi niz A,B,C,D,E
        assertEquals(false, SILab2.function(new User("User2","12abcdef","user2@gmail.com"),lista)); //vrvi niz A,B,C,D,E,F,G,H,I,J,K,L,M

        assertEquals(true, SILab2.function(new User("User3","12@Abcde","user3@yahoo.com"),lista)); //vrvi niz A,B,C,D,E,F,G,H,I,J,K,L,N




    }