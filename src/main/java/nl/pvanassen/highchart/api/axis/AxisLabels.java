package nl.pvanassen.highchart.api.axis;

import nl.pvanassen.highchart.api.base.BaseObject;
import nl.pvanassen.highchart.api.shared.AlignType;
import nl.pvanassen.highchart.api.shared.EnumString;
import nl.pvanassen.highchart.api.shared.Style;
import nl.pvanassen.highchart.api.shared.Styleable;
import nl.pvanassen.highchart.api.utils.Utils;


public class AxisLabels extends BaseObject implements Styleable<AxisLabels> {

  private String align;

  private Boolean enabled;

  private String format;

  private Integer maxStaggerLines;

  private String overflow;

  private Double rotation;

  private Integer staggerLines;

  private Integer step;

  private Style style;

  private Boolean useHTML;

  private Integer x;

  private Integer y;

  private Integer zIndex;

  public String getAlign() {
    return this.align;
  }

  /**
   * @return the enabled
   */
  public Boolean getEnabled() {
    return this.enabled;
  }

  /**
   * @return the format
   */
  public String getFormat() {
    return this.format;
  }

  /**
   * @return the maxStaggerLines
   */
  public Integer getMaxStaggerLines() {
    return this.maxStaggerLines;
  }

  /**
   * @return the overflow
   */
  public Object getOverflow() {
    return this.overflow;
  }

  public Double getRotation() {
    return this.rotation;
  }

  /**
   * @return the staggerLines
   */
  public Integer getStaggerLines() {
    return this.staggerLines;
  }

  /**
   * @return the step
   */
  public Integer getStep() {
    return this.step;
  }

  /**
   * @return the style
   */
  public Style getStyle() {
    if (this.style == null) {
      this.style = new Style();
    }
    return this.style;
  }

  /**
   * @return the useHTML
   */
  public Boolean getUseHTML() {
    return this.useHTML;
  }

  /**
   * @return the x
   */
  public Integer getX() {
    return this.x;
  }

  /**
   * @return the y
   */
  public Integer getY() {
    return this.y;
  }

  /**
   * @return the zIndex
   */
  public Integer getZIndex() {
    return this.zIndex;
  }

  public AxisLabels setAlign(AlignType align) {
    this.align = EnumString.toString(align);
    return this;
  }

  /**
   * @param enabled the enabled to set
   * @return
   */
  public AxisLabels setEnabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * @param format the format to set
   * @return
   */
  public AxisLabels setFormat(String format) {
    this.format = format;
    return this;
  }

  /**
   * @param maxStaggerLines the maxStaggerLines to set
   * @return
   */
  public AxisLabels setMaxStaggerLines(Integer maxStaggerLines) {
    this.maxStaggerLines = maxStaggerLines;
    return this;
  }

  /**
   * @return
   */
  public AxisLabels setOverflow(String overflow) {
    this.overflow = overflow;
    return this;
  }

  public AxisLabels setRotation(Double rotation) {
    this.rotation = rotation;
    return this;
  }

  /**
   * @param staggerLines the staggerLines to set
   * @return
   */
  public AxisLabels setStaggerLines(Integer staggerLines) {
    this.staggerLines = staggerLines;
    return this;
  }

  /**
   * @param step the step to set
   * @return
   */
  public AxisLabels setStep(Integer step) {
    this.step = step;
    return this;
  }

  /**
   * @param useHTML the useHTML to set
   * @return
   */
  public AxisLabels setUseHTML(Boolean useHTML) {
    this.useHTML = useHTML;
    return this;
  }

  /**
   * @param x the x to set
   * @return
   */
  public AxisLabels setX(Integer x) {
    this.x = x;
    return this;
  }

  /**
   * @param y the y to set
   * @return
   */
  public AxisLabels setY(Integer y) {
    this.y = y;
    return this;
  }

  /**
   * @param zIndex the zIndex to set
   * @return
   */
  public AxisLabels setZIndex(Integer zIndex) {
    this.zIndex = zIndex;
    return this;
  }

  public AxisLabels style(final AxisLabels src) {
    if (src == null) {
      return this;
    }
    this.align = src.align;
    this.enabled = src.enabled;
    this.format = src.format;
    this.maxStaggerLines = src.maxStaggerLines;
    this.overflow = src.overflow;
    this.rotation = src.rotation;
    this.staggerLines = src.staggerLines;
    this.step = src.step;
    Utils.style(this.style, src.style);
    this.useHTML = src.useHTML;
    this.x = src.x;
    this.y = src.y;
    this.zIndex = src.zIndex;
    return this;
  }

}
