package soap.webservice;
import java.util.HashMap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
@WebService(targetNamespace = "http://webservice.soap/", portName = "Assignment_01Port", serviceName = "Assignment_01Service")
public class Assignment_01 {
	
	private static HashMap<String, Integer> marksMap = new HashMap<String, Integer>();
    private static String[] validCourseCodes = {"ITE3742", "ITE3822", "ITE3512"};
    private static String[] validIndexNumbers = {"E2041327", "E1111111", "E1234235", "E3456845", "E7534245"};

    @WebMethod(operationName = "storeMarks", action = "urn:StoreMarks")
	public static void storeMarks(@WebParam(name = "arg0") String indexNumber, @WebParam(name = "arg1") String courseCode, @WebParam(name = "arg2") int marks) {
    	
        String hashKey = courseCode + indexNumber;
        
        if (isValidCourseCode(courseCode) && isValidIndexNumber(indexNumber)) 
        {
        	marksMap.put(hashKey, marks);
            
        } 
        else 
        {
        	System.out.println("Please enter valid course code or index number.");        
        }
    }

    @WebMethod(operationName = "retrieveMarks", action = "urn:RetrieveMarks")
	public static int retrieveMarks(@WebParam(name = "arg0") String indexNumber, @WebParam(name = "arg1") String courseCode) {
    	
        String hashKey = courseCode + indexNumber;
        
        if (!isValidCourseCode(courseCode) || !isValidIndexNumber(indexNumber)) 
        {
            System.out.println("please enter valid course code or index number.");
            return -1;
        } 
        else if (marksMap.containsKey(hashKey)) 
        {
            return marksMap.get(hashKey);
        } 
        else 
        {
            return -1;
        }
    }

    private static boolean isValidIndexNumber(String indexNumber) {
        for (String index : validIndexNumbers) 
        {
            if (index.equals(indexNumber)) 
            {
                return true;
            }
        }
        return false;
    }
    
    private static boolean isValidCourseCode(String courseCode) {
        for (String code : validCourseCodes) {
            if (code.equals(courseCode)) {
                return true;
            }
        }
        return false;
    }

    
}
