package ${package};

import org.identityconnectors.framework.spi.ConnectorClass;
import org.identityconnectors.framework.spi.PoolableConnector;
import org.identityconnectors.framework.spi.Configuration;
import org.identityconnectors.framework.common.objects.ObjectClass;
import org.identityconnectors.framework.common.objects.OperationOptions;

@ConnectorClass(
        displayNameKey = "${artifactId}.display",
        configurationClass = ${connectorName}Configuration.class
)
public class ${connectorName}Connector implements PoolableConnector {

    private ${connectorName}Configuration configuration;

    @Override
    public void init(Configuration configuration) {
        this.configuration = (${connectorName}Configuration) configuration;
    }

    @Override
    public void dispose() {
        // Limpieza de conexiones o recursos al destruir la instancia
    }

    @Override
    public void checkAlive() {
        // Validación del estado de conexión con el sistema destino
    }

    @Override
    public Configuration getConfiguration() {
        return this.configuration;
    }
}