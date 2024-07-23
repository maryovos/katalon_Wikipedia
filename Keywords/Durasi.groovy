import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable
import java.time.LocalTime;
import java.time.Duration;
import java.time.format.DateTimeParseException;

public class Durasi {
	
	
	
	
	@Keyword
	def getDurationDelay(String timeStr) {
		
		LocalTime time = LocalTime.now()
		println("Waktu Sekarang : " + time.hour +" : " + time.minute +" : " + time.second)
		LocalTime localTime2;
		
//		Selisih dengan waktu tertentu
		try {
			// Parse the string to LocalTime
			localTime2 = LocalTime.parse(timeStr);

			System.out.println("Parsed LocalTime: " + localTime2);
		} catch (DateTimeParseException e) {
			System.out.println("Error parsing the time: " + e.getMessage());
			// Handle the exception as needed
		}
		
		LocalTime time2 = LocalTime.of(12, 0)
		
		Duration duration = Duration.between(time, localTime2)
		
		println("Waktu Menunggu : " + duration.seconds +" Detik")
		
		return duration.seconds
		
		
	}
	
}
