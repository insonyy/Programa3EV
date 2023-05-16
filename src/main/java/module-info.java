module Programa3EV {
	exports common;
	exports ui;
	exports daoAnimales;
	exports daoIngresos;
	exports service;
	exports domain;
	exports config;
	exports daoEmpleados;

	requires MaterialFX;
	requires com.google.gson;
	requires java.logging;
	requires javafx.base;
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires lombok;
	requires org.apache.logging.log4j;
	   opens ui to javafx.fxml;

}