package xdean.checker.junit;

import static javax.lang.model.element.Modifier.PUBLIC;
import static javax.lang.model.element.Modifier.STATIC;

import org.junit.Rule;
import org.junit.rules.MethodRule;
import org.junit.rules.TestRule;

import xdean.annotation.processor.toolkit.annotation.MetaFor;
import xdean.deannotation.checker.CheckField;
import xdean.deannotation.checker.CheckMethod;
import xdean.deannotation.checker.CheckModifier;
import xdean.deannotation.checker.CheckType;
import xdean.deannotation.checker.CheckType.Type;

@MetaFor(Rule.class)
@CheckField(
    modifier = @CheckModifier(require = PUBLIC, forbid = STATIC),
    type = @CheckType(value = { TestRule.class, MethodRule.class }, type = Type.EXTEND_ONE))
@CheckMethod(
    modifier = @CheckModifier(require = PUBLIC, forbid = STATIC),
    returnType = @CheckType(value = { TestRule.class, MethodRule.class }, type = Type.EXTEND_ONE),
    argCount = 0)
@interface CheckRule {

}
