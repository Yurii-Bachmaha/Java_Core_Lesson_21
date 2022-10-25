package task01;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Application {
	public static void main(String[] args) throws Exception {

		List<String> annotationValuesList = getAnnotationValues(Commodity.class);

		writeObjectToFile(new File("CommodityAnnotation.obj"), annotationValuesList);
		writeListItemsToFile(new File("CommodityAnnotation.txt"), annotationValuesList);

		System.out.println("Annotated values:");
		for (String string : annotationValuesList) {
			System.out.println(string);
		}

	}

	public static List<String> getAnnotationValues(Class<?> customClass) {
		List<String> annotationValues = new ArrayList<String>();

		Field[] fields = customClass.getDeclaredFields();

		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];

			if (field.getAnnotation(CommodityAnnotation.class) instanceof CommodityAnnotation) {
				annotationValues.add(field.getType().getSimpleName() + " " + field.getName() + " ----> "
						+ field.getAnnotation(CommodityAnnotation.class).value());
			}
		}
		return annotationValues;
	}

	public static void writeObjectToFile(File file, Object object) throws Exception {
		OutputStream os = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(os);
		oos.writeObject(object);
		oos.close();
		os.close();
	}

	public static void writeListItemsToFile(File file, List<String> list) throws Exception {
		Files.write(file.toPath(), list);
	}
}