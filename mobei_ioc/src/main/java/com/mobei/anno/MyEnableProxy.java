package com.mobei.anno;

import com.mobei.importselector.MySelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Import(MySelector.class)
public @interface MyEnableProxy {
}
