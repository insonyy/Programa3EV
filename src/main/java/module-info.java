module programa3EV {
	exports daoAnimales;
	exports common;
	exports ui;
	exports service;
	exports domain;
	exports config;

	requires MaterialFX;
	requires com.google.gson;
	requires java.logging;
	requires lombok;
	requires org.apache.logging.log4j;
	requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
	requires javafx.base;
    opens ui to javafx.fxml;
}