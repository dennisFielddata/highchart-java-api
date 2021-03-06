package nl.pvanassen.highchart.api.serializer;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Map.Entry;

public abstract class Serializer<K> implements JsonSerializer<K> {

  public Serializer() {
    super();
  }

  public abstract Map<String, String> getProperties(K instance);

  public JsonElement serialize(K instance, Type arg1, JsonSerializationContext arg2) {
    Map<String, String> map = getProperties(instance);
    if (map == null) {
      return new JsonPrimitive("");
    }

    JsonObject r = new JsonObject();
    for (Entry<String, String> e : map.entrySet()) {
      r.addProperty(e.getKey(), e.getValue());
    }

    return r;
  }

}
