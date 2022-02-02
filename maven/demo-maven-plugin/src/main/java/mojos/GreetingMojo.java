package mojos;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo(name="greeting")
public class GreetingMojo extends AbstractMojo {
    public void execute(){
        getLog().info("Hello Apache Maven Plugin World!");
    }
}
