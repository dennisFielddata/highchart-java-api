package nl.pvanassen.highchart.api.shared;

import java.util.HashMap;
import java.util.Map;
import nl.pvanassen.highchart.api.base.BaseObject;
import nl.pvanassen.highchart.api.utils.Utils;

public class Style extends BaseObject implements Styleable<Style> {

  private Map<String, String> properties;

  public Style() {
    this.properties = null;
  }

  public Map<String, String> getProperties() {
    return this.properties;
  }

  public String getProperty(String property) {
    return this.properties != null ? this.properties.get(property) : null;
  }

  public Style setProperty(String property, String value) {
    if (this.properties == null) {
      this.properties = new HashMap<String, String>();
    }
    this.properties.put(property, value);
    return this;
  }

  public Style style(final Style src) {
    if (src == null) {
      return this;
    }
    Utils.stylePrimitiveMap(this.properties, src.properties);
    return this;
  }
}
