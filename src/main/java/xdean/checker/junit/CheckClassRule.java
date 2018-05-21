package xdean.checker.junit;

import static javax.lang.model.element.Modifier.*;

import org.junit.ClassRule;
import org.junit.rules.TestRule;

import xdean.annotation.processor.toolkit.annotation.MetaFor;
import xdean.deannotation.checker.CheckField;
import xdean.deannotation.checker.CheckMethod;
import xdean.deannotation.checker.CheckModifier;
import xdean.deannotation.checker.CheckType;
import xdean.deannotation.checker.CheckType.Type;

@MetaFor(ClassRule.class)
@CheckField(
    modifier = @CheckModifier(require = { PUBLIC, STATIC }),
    type = @CheckType(value = TestRule.class, type = Type.EXTEND))
@CheckMethod(
    modifier = @CheckModifier(require = { PUBLIC, STATIC }),
    returnType = @CheckType(value = TestRule.class, type = Type.EXTEND),
    argCount = 0)
@interface CheckClassRule {

}
