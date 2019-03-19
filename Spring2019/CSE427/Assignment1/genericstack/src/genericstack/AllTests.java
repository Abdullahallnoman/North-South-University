package genericstack;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ GenericStackTest.class, IsEmptyTest.class, PopTest.class, PushTest.class })
public class AllTests {

}
