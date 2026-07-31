package ${package};

import org.identityconnectors.framework.common.objects.filter.AbstractFilterTranslator;

public class ${connectorName}FilterTranslator extends AbstractFilterTranslator<String> {

    @Override
    protected String createEqualsExpression(org.identityconnectors.framework.common.objects.filter.EqualsFilter filter, boolean not) {
        if (filter == null) {
            return null;
        }
        return filter.getAttribute().getName() + " EQ " + filter.getAttribute().getValue().get(0);
    }
}