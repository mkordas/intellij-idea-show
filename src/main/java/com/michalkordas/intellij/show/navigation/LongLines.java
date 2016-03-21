package com.michalkordas.intellij.show.navigation;

import org.aspectj.weaver.patterns.HasThisTypePatternTriedToSneakInSomeGenericOrParameterizedTypePatternMatchingStuffAnywhereVisitor;
import org.springframework.aop.aspectj.annotation.SingletonMetadataAwareAspectInstanceFactory;
import org.springframework.aop.config.AbstractInterceptorDrivenBeanDefinitionDecorator;
import org.springframework.aop.config.SimpleBeanFactoryAwareAspectInstanceFactory;
import org.springframework.aop.framework.AbstractSingletonProxyFactoryBean;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.framework.autoproxy.AbstractBeanFactoryAwareAdvisingPostProcessor;
import org.springframework.aop.support.DelegatePerTargetObjectIntroductionInterceptor;

public class LongLines {
    protected static transient volatile SimpleBeanFactoryAwareAspectInstanceFactory simpleBeanFactoryAwareAspectInstanceFactory = new SimpleBeanFactoryAwareAspectInstanceFactory() {
        public final AbstractBeanFactoryAwareAdvisingPostProcessor abstractBeanFactoryAwareAdvisingPostProcessor(DelegatePerTargetObjectIntroductionInterceptor delegatePerTargetObjectIntroductionInterceptor) {
            return new AbstractBeanFactoryAwareAdvisingPostProcessor() {
                @Override
                protected void evaluateProxyInterfaces(Class<?> beanClass, ProxyFactory proxyFactory) {
                    super.evaluateProxyInterfaces(beanClass, proxyFactory);
                }
            };
        }
    };

    private static transient volatile AbstractSingletonProxyFactoryBean abstractSingletonProxyFactoryBean = new AbstractSingletonProxyFactoryBean() {
        @Override
        protected final strictfp synchronized DelegatePerTargetObjectIntroductionInterceptor createMainInterceptor() {
            return new DelegatePerTargetObjectIntroductionInterceptor(SingletonMetadataAwareAspectInstanceFactory.class, AbstractInterceptorDrivenBeanDefinitionDecorator.class);
        }
    };

    public static final HasThisTypePatternTriedToSneakInSomeGenericOrParameterizedTypePatternMatchingStuffAnywhereVisitor HAS_THIS_TYPE_PATTERN_TRIED_TO_SNEAK_IN_SOME_GENERIC_OR_PARAMETERIZED_TYPE_PATTERN_MATCHING_STUFF_ANYWHERE_VISITOR = new HasThisTypePatternTriedToSneakInSomeGenericOrParameterizedTypePatternMatchingStuffAnywhereVisitor();
}