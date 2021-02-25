package hu.meiit.haladojava.calculator;

import hu.meiit.haladojava.logic.CalculatorException;
import hu.meiit.haladojava.logic.Executor;
import hu.meiit.haladojava.logic.Expression;
import hu.meiit.haladojava.logic.IExecutor;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{

    private static String getExpressionFromStandardInput() {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();
        scanner.close();
        return expression;
    }

    public static void main( String[] args )
    {
        try {
            String strExpression = getExpressionFromStandardInput();
            Expression expression = ExpressionMaker.parse(strExpression);
            IExecutor executor = new Executor();
            System.out.print(executor.executeExpression(expression));
        }
        catch (ExpressionInvalidException e) {
            System.out.println("-");
        }
        catch (CalculatorException e) {
            System.out.println("-");
        }
    }
}
