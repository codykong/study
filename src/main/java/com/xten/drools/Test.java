package com.xten.drools;


import org.kie.api.io.ResourceType;
import org.kie.internal.builder.KnowledgeBuilder;
import org.kie.internal.builder.KnowledgeBuilderFactory;
import org.kie.internal.definition.KnowledgePackage;
import org.kie.internal.io.ResourceFactory;

import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 * User: cody
 * Date: 2016/11/12
 * Time: 下午10:52
 * To change this template use File | Settings | File Templates.
 */
public class Test {

    public static void main(String[] args) {

        KnowledgeBuilder  kbuilder =
                KnowledgeBuilderFactory.newKnowledgeBuilder();
        kbuilder.add(ResourceFactory.newClassPathResource("test.drl",Test.class), ResourceType.DRL);
        Collection<KnowledgePackage> kpackage = kbuilder.getKnowledgePackages();
    }
}
