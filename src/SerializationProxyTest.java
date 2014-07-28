package test3;

import java.io.IOException;

public class SerializationProxyTest {

	 public static void main(String[] args) {
	        String fileName = "C:\\Users\\user\\Desktop\\New folder (2)\\data.ser";
	         
	        Data data = new Data("Anand");
	         
	        try {
	            SerializationUtil.serialize(data, fileName);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	         
	        try {
	            Data newData = (Data) SerializationUtil.deserialize(fileName);
	            System.out.println(newData);
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
				e.printStackTrace();
			}
	    }
}
