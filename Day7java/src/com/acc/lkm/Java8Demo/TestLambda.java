package com.acc.lkm.Java8Demo;

public class TestLambda {

	public static void main(String[] args) {
		//Without using Lambda Expression
		/*LambdaDemo lambdademo =new LambdaDemo() {
			
			@Override
			public float square(float a) {
				// TODO Auto-generated method stub
				return a*a;
			}
		};
       System.out.println(lambdademo.square(200));
	}*/
		/*LambdaDemo lambdaDemo=(A,B)->{
			System.out.println(A+" "+B);
			
		};
		lambdaDemo.lambda(100,"Rohan");
*/
		LambdaDemo lambda1=(float A,float B,float C)->(A*B*C);
		System.out.println(lambda1.square(200,300,400));
}}
