package Project2;

import java.util.List;
import java.util.ArrayList;

public class ProjectData {
  private List<Pair<Integer>> integers;
  private List<Pair<String>> strings;
  private List<Pair<Boolean>> booleans;
  private List<Pair<Double>> doubles;
  
  private class Pair<T> {
    private String identifier;
    private T value;

    public Pair(String identifier, T value) {
      this.identifier = identifier;
      this.value = value;
    }

    public Pair(Pair<T> p) {
      this.value = p.value;
      this.identifier = p.identifier;
    }

    public String getIdentifier() {return identifier;}
    public T getValue() {return value;}
  }  

  public ProjectData() {
    integers = new ArrayList<Pair<Integer>>();
    strings = new ArrayList<Pair<String>>();
    booleans = new ArrayList<Pair<Boolean>>();
    doubles = new ArrayList<Pair<Double>>();
  }

  public ProjectData(ProjectData pd) {
    this.integers = new ArrayList<Pair<Integer>>(pd.integers);
    this.strings = new ArrayList<Pair<String>>(pd.strings);
    this.doubles = new ArrayList<Pair<Double>>(pd.doubles);
    this.booleans = new ArrayList<Pair<Boolean>>(pd.booleans);    
  }

  public void add(String identifier, int value) {
    integers.add(new Pair<Integer>(identifier, value));
  }

  public void add(String identifier, double value) {
    doubles.add(new Pair<Double>(identifier, value));
  }

  public void add(String identifier, String value) {
    strings.add(new Pair<String>(identifier, value));
  }

  public void add(String identifier, boolean value) {
    booleans.add(new Pair<Boolean>(identifier, value));
  }

  public int nextInt() {
    return integers.remove(0).getValue();
  }

  public String nextLine() {
    return strings.remove(0).getValue();
  }

  public double nextDouble() {
    return doubles.remove(0).getValue();
  }

  public boolean nextBoolean() {
    return booleans.remove(0).getValue();
  }

  public String formattedOutput() {
    ArrayList<String> items = new ArrayList<>();
    
    for (Pair<Integer> p : integers) {
      items.add("   " + p.getIdentifier() + " = " + p.getValue());
    }
    
    for (Pair<String> p : strings) {
      items.add("   " + p.getIdentifier() + " = " + p.getValue());
    }
    
    for (Pair<Double> p : doubles) {
      items.add("   " + p.getIdentifier() + " = " + p.getValue());
    }
    
    for (Pair<Boolean> p : booleans) {
      items.add("   " + p.getIdentifier() + " = " + p.getValue());
    }

    return String.join("\n", items);
  }
}
