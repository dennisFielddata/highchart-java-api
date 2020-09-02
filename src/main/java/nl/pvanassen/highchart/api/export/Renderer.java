package nl.pvanassen.highchart.api.export;

import java.io.OutputStream;

public interface Renderer<T> {

  public static abstract class PojoRenderer<T> implements Renderer<T> {

    private T options, globalOptions;

    private OutputStream output;

    protected T getChartOptions() {
      return this.options;
    }

    protected T getGlobalOptions() {
      return this.globalOptions;
    }

    protected OutputStream getOutputStream() {
      return this.output;
    }

    public Renderer<T> setChartOptions(T options) {
      this.options = options;
      return this;
    }

    public Renderer<T> setGlobalOptions(T options) {
      this.globalOptions = options;
      return this;
    }

    public Renderer<T> setOutputStream(OutputStream output) {
      this.output = output;
      return this;
    }

  }

  void render();

  Renderer<T> setChartOptions(T options);

  Renderer<T> setGlobalOptions(T options);

  Renderer<T> setOutputStream(OutputStream outputStream);

}
