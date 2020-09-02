package nl.pvanassen.highchart.api.format;

import java.util.HashMap;
import java.util.Map;
import nl.pvanassen.highchart.api.base.BaseObject;
import nl.pvanassen.highchart.api.shared.Styleable;
import nl.pvanassen.highchart.api.utils.Utils;

public class DateTimeLabelFormats extends BaseObject implements Styleable<DateTimeLabelFormats> {

  public enum TimeUnit {
    SECOND, MINUTE, HOUR, DAY, WEEK, MONTH, YEAR;
  }

  private Map<TimeUnit, String> formats;

  public DateTimeLabelFormats() {
    this.formats = null;
  }

  public String getFormat(TimeUnit unit) {
    return this.formats != null ? this.formats.get(unit) : null;
  }

  public Map<TimeUnit, String> getFormats() {
    return this.formats;
  }

  public DateTimeLabelFormats set(TimeUnit unit, String format) {
    if (this.formats == null) {
      this.formats = new HashMap<TimeUnit, String>();
    }
    this.formats.put(unit, format);
    return this;
  }

  public DateTimeLabelFormats style(final DateTimeLabelFormats src) {
    if (src == null) {
      return this;
    }
    Utils.stylePrimitiveMap(this.formats, src.formats);
    return this;
  }

}
