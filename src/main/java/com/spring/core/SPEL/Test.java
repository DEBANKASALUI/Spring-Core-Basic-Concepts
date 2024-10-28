package com.spring.core.SPEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/core/SPEL/spelconfig.xml");
		Demo d1 = context.getBean("demo", Demo.class);
		System.out.println(d1);
		
		//Using SPEL API
		SpelExpressionParser spelExpressionParser = new SpelExpressionParser();
		Expression expression = spelExpressionParser.parseExpression("100+25+75");
		System.out.println(expression.getValue());

	}

}
