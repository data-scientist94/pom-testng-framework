package automation.ollion.project.test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import automation.TestSessionInitiator;

import java.util.*;
import java.util.stream.Collectors;

public class LoginTest  {
	private TestSessionInitiator test;

	public LoginTest() {
		test = new TestSessionInitiator();
	}


	@Test(priority = 1)
	public void BrowserQuestionSection(){
		test.login.expandIcon();
	}

	@Test(priority = 2)
	public void goToUserSection(){
		test.login.clickOnUserButton();
	}

	@Test(priority = 3)
	public void goToSecondPage(){
		test.login.goSecondPageUserSection();
	}

	@Test(priority = 4)
	public void printThe(){
		HashMap<HashMap<String, String>, Integer> mapOfMap = new HashMap<>();

		int index = 1;
		for(WebElement element : test.login.getAllTheUserInfo()){
			HashMap<String, String> map = new HashMap<>();

			map.put(element.findElement(By.xpath("(//div[@class='user-details']/a)" + "[" +index + "]")).getText(),
					element.findElement(By.xpath("(//div[@class='user-details']/span)"+ "[" +index + "]")).getText());
			mapOfMap.put(map, Integer.parseInt(element.findElement(By.xpath("(//div[@class='user-details']/div)"+ "[" +index + "]")).getText()));

			index++;

		}
		HashMap<HashMap<String,String>, Integer> temp = mapOfMap.entrySet()
				.stream()
				.sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
				.collect(Collectors.toMap(
						Map.Entry::getKey,
						Map.Entry::getValue,
						(e1, e2) -> e1, LinkedHashMap::new));
		int value = 0;
		int indexOfHashMap = 0;
		for (Map.Entry<HashMap<String, String>, Integer> entry : temp.entrySet()) {
			if(indexOfHashMap==0) {
				value = entry.getValue();
			}
			else if(value<= entry.getValue()){
				System.out.println("Key = " + entry.getKey() +
						", Value = " + entry.getValue());
			}
			indexOfHashMap++;
		}
	}
}
