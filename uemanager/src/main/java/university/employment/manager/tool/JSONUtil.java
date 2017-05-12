package university.employment.manager.tool;

import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
/**
 * 
 * @ClassName: JSONUtil 
 * @Description: json工具类 
 * @author lijiaqi
 * @date 2017年3月7日 上午8:32:07 
 *
 */
public class JSONUtil {

	public static String toJson(Object object) {
		Gson gson = new GsonBuilder().create();
		return gson.toJson(object);
	}

	public static String toJson(Object object, String dateFormat) {
		Gson gson = new GsonBuilder().setDateFormat(dateFormat).create();
		return gson.toJson(object);
	}

	@SuppressWarnings("unchecked")
	public static Object fromJson(String json, @SuppressWarnings("rawtypes") Class classOfT) {
		Gson gson = new GsonBuilder().create();
		return gson.fromJson(json, classOfT);
	}
	

	public static <T> T fromJson(String json,Type typeOfT) {
		Gson gson = new GsonBuilder().create();
		return gson.fromJson(json, typeOfT);
	}
}
