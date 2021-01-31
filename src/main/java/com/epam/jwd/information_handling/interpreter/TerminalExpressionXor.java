package com.epam.jwd.information_handling.interpreter;

public class TerminalExpressionXor extends AbstractMathExpression{
    @Override
    public void interpret(Context context) {
        context.pushValue((context.popValue() ^ context.popValue()));
    }
}
