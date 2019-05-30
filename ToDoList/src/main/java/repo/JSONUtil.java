package repo;

import com.google.gson.Gson;

public class JSONUtil {

	public JSONUtil() {
		
	}

	private Gson gson = new Gson();

	public String toJSON(Object obj) {
		return this.gson.toJson(obj);
	}

	public <T> T fromJSON(String json, Class<T> clazz) {
		return this.gson.fromJson(json, clazz);
	}
}
