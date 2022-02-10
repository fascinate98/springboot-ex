package com.poscoict.springbootex;



import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

//bootstrap class

@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		/**
		 * 1. 어플리케이션 컨텍스트(Application Context, Strping Container)생성
		 * 2. 웹애플리케이션 타입 (Web Application 인 경우 : MVC 설정 or Reactive 타입 결정) 
		 * 3. 어노테이션 스캐닝(auto: @ComponentScan) or Configuration Class(explicit : @Import({})) 통한 빈 생성/등록 및 와이어링
		 * 4. 웹 애플리케이션(MVC : was가 필요함. 함수형은 was필요 없음. reactive타입으로 짜면 was필요없어) 인 경우 
		 * 	- 내장(embeded) 서버(TomcatEmbededServletContainer) 인스턴스 생성
		 *  - 실행시키기 전에 서버 인스턴스 웹애플리케이션을 배포
		 *  - 서버 인스턴스 실행
		 * 5. ApplicationRunner 인터페이스 구현한 빈 찾아서 실행시킨다(run 호출)
		 * 		 */
//		ConfigurableApplicationContext c = null;
//		try {
//			c =  SpringApplication.run(HelloWorldApplication.class, args);	
//		} catch(Throwable ex) {
//			ex.printStackTrace();
//		} finally {
//			c.close();
//		}
		
//	try ~ with ~ resource
		try(ConfigurableApplicationContext c = SpringApplication.run(HelloWorldApplication.class, args)){
			
		}
	}

}
