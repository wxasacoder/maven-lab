package org.wx;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Execute;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

/**
 * @author wuxin
 * @date 2025/01/15 22:07:58
 */
@Mojo(name = "count-code-line")
@Execute(goal = "count-code-line", phase = LifecyclePhase.PROCESS_SOURCES)
public class CountMojo extends AbstractMojo {


    private final Set<String> careFile  = new HashSet<String>(){{
        add("java");
        add("xml");
        add("properties");
        add("yaml");
    }};


    private File basedir;


    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().warn("--------------------------------------"+basedir);
    }
}
