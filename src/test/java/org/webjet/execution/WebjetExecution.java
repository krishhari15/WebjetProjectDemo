package org.webjet.execution;


import org.webjet.pagefactory.FlightBooking;
import org.webjet.pagefactory.WebjetPagefactory;

public class WebjetExecution extends WebjetPagefactory
{
public static void main(String[] args) throws InterruptedException 
{
	WebjetPagefactory pg = new WebjetPagefactory();
	FlightBooking fb = new FlightBooking();
	browserLaunch("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\WebjetTest\\driver1\\chromedriver.exe");
	maximize();
	loadUrl("https://www.webjet.com.au/");
	waitTime();
	flights();
	
	departure(fb.getDepartureAirport(), "Madras, India - Chennai Intl (MAA)");
}
}
