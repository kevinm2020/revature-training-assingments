package com.revature;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.revature")
public class AppConfig { }


/**
 * Central Spring configuration class.
 *
 * - @Configuration tells Spring this class declares bean definitions.
 * - @ComponentScan makes Spring scan the given package for stereotype-annotated
 *   classes (e.g., @Service, @Component, @Repository) and register them as beans.
 *
 */