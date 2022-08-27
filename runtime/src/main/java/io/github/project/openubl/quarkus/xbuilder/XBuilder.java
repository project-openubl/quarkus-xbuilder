package io.github.project.openubl.quarkus.xbuilder;

import io.github.project.openubl.xbuilder.enricher.config.Defaults;
import io.quarkus.qute.Template;

public interface XBuilder {

    Template getTemplate(Type type);

    Defaults getDefaults();

    enum Type {
        INVOICE("invoice.xml"),
        CREDIT_NOTE("creditNote.xml"),
        DEBIT_NOTE("debitNote.xml");

        private final String templatePath;

        Type(String templatePath) {
            this.templatePath = templatePath;
        }

        public String getTemplatePath() {
            return templatePath;
        }
    }

}