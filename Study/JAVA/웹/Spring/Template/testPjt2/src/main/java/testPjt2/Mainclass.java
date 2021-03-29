package testPjt2;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Mainclass {

    public static void main(String[] args) {
	GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
	
	TransportationWalk walk = ctx.getBean("tWalk", TransportationWalk.class);
	
	walk.move();
	
	ctx.close();
	
	
    }

}
