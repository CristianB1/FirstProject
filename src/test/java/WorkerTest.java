import com.sda.example.Production.Worker;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

    @RunWith(SpringRunner.class)
    @ContextConfiguration(locations = "/test-application-context.xml")
    public class WorkerTest {

        @Autowired private Worker worker; //injectie

    // @Before
    // public void setUp() throws Exception {
    // worker = new Worker("TestWorker", 20, new WorkerMotto("Too young to be called a worker"))
    // }
    // @After
        // public void tearDown() throws Exception{
        // worker = null;
        // }

    @Test
    public void getTools(){
        Assert.assertNotNull(worker);
        Assert.assertNotNull(worker.getTools());
        Assert.assertEquals(50, worker.getAge());
        Assert.assertEquals("Carpenter", worker.getProfession());
        Assert.assertEquals(2, worker.getTools().size());
    }
}