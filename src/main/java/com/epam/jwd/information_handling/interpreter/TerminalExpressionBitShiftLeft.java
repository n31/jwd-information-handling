package com.epam.jwd.information_handling.interpreter;

public class TerminalExpressionBitShiftLeft extends AbstractMathExpression {
    @Override
    public void interpret(Context context) {
        Integer rightValue = context.popValue();
        Integer leftValue = context.popValue();
        context.pushValue((leftValue << rightValue));
    }
}
