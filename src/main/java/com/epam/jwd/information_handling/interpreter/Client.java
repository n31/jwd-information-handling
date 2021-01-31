package com.epam.jwd.information_handling.interpreter;

import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    private ArrayList<AbstractMathExpression> listExpression = new ArrayList<>();

    public Client(String expression) {
        parse(expression);
    }

    private void parse(String expression) {
        for (String lexeme : expression.split("\\p{Blank}+")) {
            if (lexeme.isEmpty()) {
                continue;
            }

            switch(lexeme) {
                case "<<": listExpression.add(new TerminalExpressionBitShiftLeft());
                break;
                case ">>": listExpression.add(new TerminalExpressionBitShiftRight());
                break;
                case "~": listExpression.add(new TerminalExpressionNot());
                break;
                case "&": listExpression.add(new TerminalExpressionAnd());
                break;
                case "|": listExpression.add(new TerminalExpressionOr());
                break;
                case "^": listExpression.add(new TerminalExpressionXor());
                break;
                default: {
                    Scanner scan = new Scanner(lexeme);
                    if (scan.hasNextInt()) {
                        listExpression.add(new NonterminalExpressionNumber(scan.nextInt()));
                    }
                }
            }
        }
    }

    public Number calculate() {
        Context context = new Context();
        listExpression.forEach(terminal -> terminal.interpret(context));
        return context.popValue();
    }
}
