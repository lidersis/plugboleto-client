package com.github.lidersis.plugboleto.client.service.v1;

import java.util.ArrayList;
import java.util.List;

import com.github.lidersis.plugboleto.client.Log;

public abstract class AbstractConverter<S, T> {

  public AbstractConverter() {
    super();
  }

  public List<T> convert(final List<S> objs) {
    if (objs == null) {
      return null;
    }
    List<T> list = new ArrayList<>();
    for (S obj : objs) {
      list.add(this.convert(obj));
    }
    return list;
  }

  public List<T> convert(final S[] objs) {
    if (objs == null) {
      return null;
    }
    List<T> list = new ArrayList<>();
    for (S obj : objs) {
      list.add(this.convert(obj));
    }
    return list;
  }

  public abstract T convert(final S obj);

  public S convertBack(final T target) {
    Log.getLog().debug("Unsupported convert back from " + target);
    throw new UnsupportedOperationException();
  }

  public List<S> convertBack(final List<T> objs) {
    if (objs == null) {
      return null;
    }
    List<S> list = new ArrayList<>();
    for (T obj : objs) {
      list.add(this.convertBack(obj));
    }
    return list;
  }

}
