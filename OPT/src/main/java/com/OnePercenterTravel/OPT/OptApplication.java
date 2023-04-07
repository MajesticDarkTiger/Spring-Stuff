package com.OnePercenterTravel.OPT;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
/*
 * this is your main file
 * It's purpose is to run your spring app indefinately
 * You can stop the program either pressing the stop button on the IDE, or 
 * clicking cntrl+c in the terminal
 */

@SpringBootApplication
/*
 * Component Scan is given the base packages to look for all the java code in the project. They should
 * be in the com.(whicheverYouNamedYourFolder)
 * IF YOU DON'T HAVE THIS, NONE OF YOUR SPRING ANNOTATIONS FOR YOUR FILES WILL BE SEEN, SO NOTHING WILL WORK, EVEN
 * THOUGH YOUR PROJECT STARTED WITH NO ERRORS
 */
@ComponentScan(basePackages = "com.OnePercenterTravel")
public class OptApplication {

	public static void main(String[] args) {
		SpringApplication.run(OptApplication.class, args);
	}

}
