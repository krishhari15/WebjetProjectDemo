package org.webjet.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightBooking extends WebjetPagefactory
{
@FindBy(id="departure-airport")
private WebElement departureAirport;

public WebElement getDepartureAirport() {
	return departureAirport;
}



}
