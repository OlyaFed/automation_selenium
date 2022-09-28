package org.example;
import org.aeonbits.owner.Config;

public interface ServerConfig extends Config {
    @DefaultValue("/usr/local/bin/chromedriver")
    String pathToChromeDriver();
    @DefaultValue("https://www.google.com/")
    String hostname();
}
