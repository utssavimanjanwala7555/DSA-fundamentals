import java.util.Stack;

public class prac4 
{

    static int precedence(char ch) 
    {
        switch (ch) 
        {
            case '+':
            case '-': return 1;
            case '*':
            case '/': return 2;
            case '^': return 3;
        }
        return -1;
    }

    static String convert(String exp) 
    {
        String result = "";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < exp.length(); i++) 
            {
            char c = exp.charAt(i);

            if (Character.isLetterOrDigit(c)) 
            {
                result += c;
            }
            else if (c == '(') 
            {
                stack.push(c);
            }
            else if (c == ')') 
            {
                while (!stack.isEmpty() && stack.peek() != '(') 
                {
                    result += stack.pop();
                }
                if (!stack.isEmpty()) stack.pop();
            }
            else 
            {
                while (!stack.isEmpty() &&
                       ((precedence(c) < precedence(stack.peek())) ||
                       (precedence(c) == precedence(stack.peek()) && c != '^'))) 
                {
                    result += stack.pop();
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) 
        {
            result += stack.pop();
        }

        return result;
    }

    public static void main(String[] args) 
    {
        String infix = "A+B*(C-D)";
        System.out.println("Infix: " + infix);
        System.out.println("Postfix: " + convert(infix));
    }
}