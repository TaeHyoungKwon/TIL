import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class HelloWorldTest {
  @Test
  public void shouldReturnHelloWorld() {
      HelloWorld helloWorld = new HelloWorld();
      assertEquals("Hello World", helloWorld.main);
  }
}
