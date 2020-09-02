package nl.pvanassen.highchart.api;

import java.awt.Color;
import nl.pvanassen.highchart.api.axis.AxisLabels;
import nl.pvanassen.highchart.api.axis.AxisPlotLines;
import nl.pvanassen.highchart.api.base.BaseObject;
import nl.pvanassen.highchart.api.format.DateTimeLabelFormats;
import nl.pvanassen.highchart.api.shared.DashStyleType;
import nl.pvanassen.highchart.api.shared.EnumString;
import nl.pvanassen.highchart.api.shared.HexColor;
import nl.pvanassen.highchart.api.shared.Styleable;
import nl.pvanassen.highchart.api.utils.ArrayString;
import nl.pvanassen.highchart.api.utils.JsonArray;
import nl.pvanassen.highchart.api.utils.Utils;

public class Axis extends BaseObject implements Styleable<Axis> {

  public enum Type {
    LINEAR, LOGARITHMIC, DATETIME, CATEGORY
  }

  private ArrayString categories;

  private DateTimeLabelFormats dateTimeLabelFormats;

  private String gridLineColor;

  private String gridLineDashStyle;

  private Integer gridLineWidth;

  private AxisLabels labels;

  private String lineColor;

  private Integer lineWidth;

  private Double max;

  private Double min;

  private String minorGridLineColor;

  private String minorGridLineDashStyle;

  private Integer minorGridLineWidth;

  private Boolean opposite;

  private JsonArray<AxisPlotLines> plotLines;

  private Boolean reversed;

  private Boolean showEmpty;

  private Boolean showFirstLabel;

  private Boolean showLastLabel;

  private Boolean startOnTick;

  private Double tickInterval;

  private Double minTickInterval;

  private Title title;

  private String type;

  private String id;

  public Axis() {}

  public ArrayString getCategories() {
    if (this.categories == null) {
      this.categories = new ArrayString();
    }
    return this.categories;
  }

  public int getCategoriesLength() {
    return this.categories != null ? this.categories.size() : 0;
  }

  public DateTimeLabelFormats getDateTimeLabelFormats() {
    if (this.dateTimeLabelFormats == null) {
      this.dateTimeLabelFormats = new DateTimeLabelFormats();
    }
    return this.dateTimeLabelFormats;
  }

  /**
   * @return the gridLineColor
   */
  public String getGridLineColor() {
    return this.gridLineColor;
  }

  /**
   * @return the gridLineDashStyle
   */
  public String getGridLineDashStyle() {
    return this.gridLineDashStyle;
  }

  /**
   * @return the gridLineWidth
   */
  public Integer getGridLineWidth() {
    return this.gridLineWidth;
  }

  public String getId() {
    return this.id;
  }

  public AxisLabels getLabels() {
    if (this.labels == null) {
      this.labels = new AxisLabels();
    }
    return this.labels;
  }

  /**
   * @return the lineColor
   */
  public String getLineColor() {
    return this.lineColor;
  }

  /**
   * @return the lineWidth
   */
  public Integer getLineWidth() {
    return this.lineWidth;
  }

  public Double getMax() {
    return this.max;
  }

  public Double getMin() {
    return this.min;
  }

  /**
   * @return the minorGridLineColor
   */
  public String getMinorGridLineColor() {
    return this.minorGridLineColor;
  }

  /**
   * @return the minorGridLineDashStyle
   */
  public String getMinorGridLineDashStyle() {
    return this.minorGridLineDashStyle;
  }

  /**
   * @return the minorGridLineWidth
   */
  public Integer getMinorGridLineWidth() {
    return this.minorGridLineWidth;
  }

  public Double getMinTickInterval() {
    return this.minTickInterval;
  }

  /**
   * @return the opposite
   */
  public Boolean getOpposite() {
    return this.opposite;
  }

  public JsonArray<AxisPlotLines> getPlotLines() {
    if (this.plotLines == null) {
      this.plotLines = new JsonArray<AxisPlotLines>();
    }
    return this.plotLines;
  }

  /**
   * @return the reversed
   */
  public Boolean getReversed() {
    return this.reversed;
  }

  /**
   * @return the showEmpty
   */
  public Boolean getShowEmpty() {
    return this.showEmpty;
  }

  /**
   * @return the showFirstLabel
   */
  public Boolean getShowFirstLabel() {
    return this.showFirstLabel;
  }

  /**
   * @return the showLastLabel
   */
  public Boolean getShowLastLabel() {
    return this.showLastLabel;
  }

  /**
   * @return the startOnTick
   */
  public Boolean getStartOnTick() {
    return this.startOnTick;
  }

  public Double getTickInterval() {
    return this.tickInterval;
  }

  public Title getTitle() {
    if (this.title == null) {
      this.title = new Title();
    }
    return this.title;
  }

  public String getType() {
    return this.type;
  }

  /**
   * @param gridLineColor the gridLineColor to set
   * @return
   */
  public Axis setGridLineColor(Color gridLineColor) {
    this.gridLineColor = HexColor.toString(gridLineColor);
    return this;
  }

  /**
   * @param gridLineDashStyle the gridLineDashStyle to set
   * @return
   */
  public Axis setGridLineDashStyle(DashStyleType gridLineDashStyle) {
    this.gridLineDashStyle = EnumString.toString(gridLineDashStyle);
    return this;
  }

  /**
   * @param gridLineWidth the gridLineWidth to set
   * @return
   */
  public Axis setGridLineWidth(Integer gridLineWidth) {
    this.gridLineWidth = gridLineWidth;
    return this;
  }

  public Axis setId(String id) {
    this.id = id;
    return this;
  }

  /**
   * @param lineColor the lineColor to set
   * @return
   */
  public Axis setLineColor(Color lineColor) {
    this.lineColor = HexColor.toString(lineColor);
    return this;
  }

  /**
   * @param lineWidth the lineWidth to set
   * @return
   */
  public Axis setLineWidth(Integer lineWidth) {
    this.lineWidth = lineWidth;
    return this;
  }

  public Axis setMax(Double max) {
    this.max = max;
    return this;
  }

  public Axis setMin(Double min) {
    this.min = min;
    return this;
  }

  /**
   * @param minorGridLineColor the minorGridLineColor to set
   * @return
   */
  public Axis setMinorGridLineColor(Color minorGridLineColor) {
    this.minorGridLineColor = HexColor.toString(minorGridLineColor);
    return this;
  }

  /**
   * @param minorGridLineDashStyle the minorGridLineDashStyle to set
   * @return
   */
  public Axis setMinorGridLineDashStyle(final DashStyleType minorGridLineDashStyle) {
    this.minorGridLineDashStyle = EnumString.toString(minorGridLineDashStyle);
    return this;
  }

  /**
   * @param minorGridLineWidth the minorGridLineWidth to set
   * @return
   */
  public Axis setMinorGridLineWidth(Integer minorGridLineWidth) {
    this.minorGridLineWidth = minorGridLineWidth;
    return this;
  }

  public Axis setMinTickInterval(double minTickInterval) {
    this.minTickInterval = minTickInterval;
    return this;
  }

  /**
   * @param opposite the opposite to set
   * @return
   */
  public Axis setOpposite(Boolean opposite) {
    this.opposite = opposite;
    return this;
  }

  /**
   * @param reversed the reversed to set
   * @return
   */
  public Axis setReversed(Boolean reversed) {
    this.reversed = reversed;
    return this;
  }

  /**
   * @param showEmpty the showEmpty to set
   * @return
   */
  public Axis setShowEmpty(Boolean showEmpty) {
    this.showEmpty = showEmpty;
    return this;
  }

  /**
   * @param showFirstLabel the showFirstLabel to set
   * @return
   */
  public Axis setShowFirstLabel(Boolean showFirstLabel) {
    this.showFirstLabel = showFirstLabel;
    return this;
  }

  /**
   * @param showLastLabel the showLastLabel to set
   * @return
   */
  public Axis setShowLastLabel(Boolean showLastLabel) {
    this.showLastLabel = showLastLabel;
    return this;
  }

  /**
   * @param startOnTick the startOnTick to set
   * @return
   */
  public Axis setStartOnTick(Boolean startOnTick) {
    this.startOnTick = startOnTick;
    return this;
  }

  public Axis setTickInterval(Double tickInterval) {
    this.tickInterval = tickInterval;
    return this;
  }

  public Axis setType(Type type) {
    this.type = EnumString.toString(type).toLowerCase();
    return this;
  }

  public Axis style(final Axis src) {
    if (src == null) {
      return this;
    }
    Utils.stylePrimitiveArray(this.categories, src.categories);
    Utils.style(this.dateTimeLabelFormats, src.dateTimeLabelFormats);
    this.gridLineColor = src.gridLineColor;
    this.gridLineDashStyle = src.gridLineDashStyle;
    this.gridLineWidth = src.gridLineWidth;
    Utils.style(this.labels, src.labels);
    this.lineColor = src.lineColor;
    this.lineWidth = src.lineWidth;
    this.max = src.max;
    this.min = src.min;
    this.minorGridLineColor = src.minorGridLineColor;
    this.minorGridLineDashStyle = src.minorGridLineDashStyle;
    this.minorGridLineWidth = src.minorGridLineWidth;
    this.opposite = src.opposite;
    this.plotLines = src.plotLines;
    this.reversed = src.reversed;
    this.showEmpty = src.showEmpty;
    this.showFirstLabel = src.showFirstLabel;
    this.showLastLabel = src.showLastLabel;
    this.startOnTick = src.startOnTick;
    this.tickInterval = src.tickInterval;
    this.minTickInterval = src.minTickInterval;
    Utils.style(this.title, src.title);
    this.type = src.type;
    this.id = src.id;
    return this;
  }

}
