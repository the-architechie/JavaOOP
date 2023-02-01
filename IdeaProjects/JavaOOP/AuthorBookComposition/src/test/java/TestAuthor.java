import org.junit.*;

import java.lang.reflect.Field;

public class TestAuthor {

    @Test
    public void testAuthor() {
        Author muchami = new Author("Muchami", "muchamingotho@gmail.com", 'M');
        Assert.assertEquals("Muchami", muchami.getName());
        Assert.assertEquals("muchamingotho@gmail.com", muchami.getEmail());
        Assert.assertEquals('M', muchami.getGender());
    }
    @Test
    public void testToString() {
        Author muchami = new Author("Muchami", "muchamingotho@gmail.com", 'M');
        String expected = "Author[name='Muchami', email='muchamingotho@gmail.com', gender=M]";
        Assert.assertEquals(expected, muchami.toString());
    }
    @Test
    public void testGetter_setEmail() throws NoSuchFieldException, IllegalAccessException {
        final Author muchami = new Author("Muchami", "muchamingotho@gmail.com", 'M');
        //given

        muchami.setEmail("muchamingotho@gmail.com");
        //when
        final Field field = muchami.getClass().getDeclaredField("email");
        field.setAccessible(true);
        Assert.assertEquals("fields did not match", field.get(muchami), "muchamingotho@gmail.com");

    }


    @Test
    public void testGetter_getsValue() throws NoSuchFieldException, IllegalAccessException {
        Author muchami = new Author("Muchami", "muchamingotho@gmail.com", 'M');
        //given

        Field field = muchami.getClass().getDeclaredField("email");
        field.setAccessible(true);
        field.set(muchami, "muchamingotho@gmail.com");

        String result = muchami.getEmail();

        Assert.assertEquals("field was not retrieved properly", result, "muchamingotho@gmail.com");



    }

}
