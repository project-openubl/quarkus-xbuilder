package io.github.projec.openubl.quarkus.xbuilder.deployment;

import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.FeatureBuildItem;

class QuarkusXbuilderProcessor {

    private static final String FEATURE = "quarkus-xbuilder";

    @BuildStep
    FeatureBuildItem feature() {
        return new FeatureBuildItem(FEATURE);
    }
}
