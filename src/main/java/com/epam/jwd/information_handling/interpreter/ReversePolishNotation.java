package com.epam.jwd.information_handling.interpreter;

import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReversePolishNotation {
    private static final String EXPRESSION_LEXEME_REGEX = "(\\d+)|[[\\<{2}|\\>{2}]|[&\\~\\^\\)\\(]]";
    private static final String NUMBER_REGEX = "\\d+";
    private static final String OPERATOR_REGEX = "(\\<{2}|\\>{2})|[&\\~\\^\\)\\(\\|]";
    private static final String NEWEX = "((\\<{2}|\\>{2})|[&\\~\\^\\)\\(\\|])|(\\d+)";

    private Stack<String> reversePolishNotation = new Stack<>();
    private Stack<String> operators = new Stack<>();

    public String convert(String expression) {
        Pattern pattern = Pattern.compile(NEWEX);
        Matcher matcher = pattern.matcher(expression);
        while(matcher.find()) {
            //System.out.println(reversePolishNotation);
            //System.out.println(operators);

            String lexeme = matcher.group();
            //System.out.println(lexeme);
            if (lexeme.matches(NUMBER_REGEX)) {
                reversePolishNotation.push(lexeme);
                //System.out.println("it's a number");
            } else if (lexeme.matches(OPERATOR_REGEX)) {
                switch (lexeme) {
                    case "(": {
                        operators.push(lexeme);
                        //System.out.println("it is (");
                    }
                    break;
                    case ")": {
                        while(!operators.peek().equals("(")) {
                            reversePolishNotation.push(operators.pop());
                        }
                        operators.pop();
                        //System.out.println("it is )");
                    }
                    break;
                    default: {
                        if (operators.empty() || operators.peek().equals("(")) {
                            operators.push(lexeme);
                            //System.out.println("we don't have any operators in stack or it's (");
                        } else {
                            if (operatorPrecedence(operators.peek()) > operatorPrecedence(lexeme)) {
                                while(!operators.empty()) {
                                    reversePolishNotation.push(operators.pop());
                                    if (!operators.empty() && operators.peek().equals("(")) break;
                                }
                                operators.push(lexeme);
                                //System.out.println("given lexeme has less precedence");
                            } else {
                                operators.push(lexeme);
                                //System.out.println("given lexeme has higher precedence");
                            }
                        }
                    }
                }
            } //else System.out.println("no matches found");
        }
        while (!operators.empty()) {
            reversePolishNotation.push(operators.pop());
        }
        //System.out.println(reversePolishNotation);
        //System.out.println(operators);
        //System.out.println("end.");

        StringBuilder result = new StringBuilder();
        operators.clear();
        while(!reversePolishNotation.empty()) {
            operators.push(reversePolishNotation.pop());
        }
        while (!operators.empty()) {
            result.append(operators.pop());
            result.append(" ");
        }
        return result.toString().trim();
    }

    private Integer operatorPrecedence(String operator) {
        switch (operator) {
            case "|": return 0;
            case "^": return 1;
            case "&": return 2;
            case "<<":
            case ">>": return 3;
            case "~": return 4;
            default: return null;
        }
    }
}
