package com.eb;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class TrackSwiggyServices 
{
	 @Pointcut("execution(* Swiggy.starterMenu(..))")  
	public void vegMenu() {}
	
	@Before("vegMenu()")
	//@After("vegMenu()")
	//@Around("vegMenu()")
	//@AfterReturning("vegMenu()")
	public void suggestion(JoinPoint p) 
	{
		System.out.println("This is an Additional Method");
	}
}
