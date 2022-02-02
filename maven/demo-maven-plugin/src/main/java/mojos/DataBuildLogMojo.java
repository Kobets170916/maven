package mojos;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.io.IOException;


@Mojo(name = "dataBuildLogReporter")
public class DataBuildLogMojo extends AbstractMojo {
    @Parameter(property = "dataBuildLogReporter.groupId")
    private String groupId;

    @Parameter(property = "dataBuildLogReporter.artifact")
    private String artifactId;

    @Parameter(property = "dataBuildLogReporter.version")
    private String version;

    public void execute() {
        getLog().info("Log file created");
        try {
            FileLog.printData(groupId, artifactId, version); //?
            getLog().info("log file created successfully.");

        } catch (IOException e) {
            getLog().info("log exception.");
        }

    }
}

