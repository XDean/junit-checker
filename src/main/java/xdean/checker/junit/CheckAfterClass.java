package xdean.checker.junit;

import static javax.lang.model.element.Modifier.PUBLIC;
import static javax.lang.model.element.Modifier.STATIC;

import org.junit.AfterClass;

import xdean.annotation.processor.toolkit.annotation.MetaFor;
import xdean.deannotation.checker.CheckMethod;
import xdean.deannotation.checker.CheckModifier;
import xdean.deannotation.checker.CheckType;

@MetaFor(AfterClass.class)
@CheckMethod(modifier = @CheckModifier(require = { PUBLIC, STATIC }), returnType = @CheckType(void.class), argCount = 0)
@interface CheckAfterClass {

}
