package SingletonTraining;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class test {
	
	public static void main(String agrs[]) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		SingletonEnum instance = SingletonEnum.INSTANCE;
		
		instance.setName("Subhash");
		System.out.println(instance.getName());
		
	}
}
