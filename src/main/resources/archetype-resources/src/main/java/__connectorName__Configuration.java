package ${package};

import org.identityconnectors.framework.spi.AbstractConfiguration;
import org.identityconnectors.common.security.GuardedString;

public class ${connectorName}Configuration extends AbstractConfiguration {

    private String host;
    private GuardedString password;

    @Override
    public void validate() {
        if (host == null || host.trim().length() == 0) {
            throw new IllegalArgumentException("El parámetro 'host' no puede estar vacío.");
        }
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public GuardedString getPassword() {
        return password;
    }

    public void setPassword(GuardedString password) {
        this.password = password;
    }
}